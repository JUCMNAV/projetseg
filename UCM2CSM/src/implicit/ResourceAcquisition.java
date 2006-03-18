package implicit;

import java.io.PrintStream;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Inserts Resource Acquisition objects in duplicate map 
 * <!-- end-user-doc -->
 * @see implicit
 * @generated
 */

public class ResourceAcquisition {
    // RA and Empty Point IDs
    int ra_id = 100;                   
    int seq_id = 200;
    
    // constructor 
    public ResourceAcquisition(){        
    }
    
    // adds all hyperedge parent components to stack
    public void findParentsRA(ComponentRef component_ref, Stack edge_stack){
        // The top of the stack is the outermost component        
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null){
            edge_stack.push(parent_ref);
            findParentsRA(parent_ref, edge_stack);
        }                
    }
  
    // Resource Acquire algorithm
    public int acquireResource(PathNode curr_edge, CSMDupNodeList dup_map, PrintStream print){
        // list that will store edges to be parsed (will contain pathnodes only)
        CSMDupNodeList prev_edge_list = new CSMDupNodeList();
        int nodes_inserted = 0; // total nodes inserted since last run
        
        // local variables                  
        Stack curr_edge_stack = new Stack ();        
        
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();
        
        // current edge is inside component 
        if (curr_edge_comp_ref != null ){
            
            // populate local prev_edge_list 
            boolean done = false;
          
            // parsing list of dupnodes (each can be either a pathnode or an RA/RR/Seq
            for (int i = 0; !done && i < dup_map.size(); i++) {
                // PathNode node = dup_map.getNode(i);
                PathNode node = dup_map.getListNode(i);
                if (node != null) {
                    if (node == curr_edge){
                        done = true; 
                    }
                    else{
                        prev_edge_list.add(new CSMDupNode (node));                        
                    }
                }// if
            }//for                        
            
            // find the parent component of current edge                                        
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);
            
            if (!prev_edge_list.isEmpty()){
                // only look at the last two elements of the prev_edge_list
                for (int j = prev_edge_list.size() - 1; j < prev_edge_list.size(); j++){
                    // Previous edge must be in a different component                    
                    PathNode prev_edge = prev_edge_list.getListNode(j);
                    System.out.println("prev_edge: " + prev_edge);
                    ComponentRef prev_edge_comp_ref = (ComponentRef) prev_edge.getContRef(); 
                    System.out.println("prev_edge_comp_ref: " + prev_edge_comp_ref);
                    
                    Stack outside_comp_stack = new Stack();
                    // prev edge is a start point                    
                    if (prev_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                            outside_comp_stack.push(curr_edge_stack.get(b)); 
                       } // for 
                        
                       while (!outside_comp_stack.isEmpty()){
                           ComponentRef comp = (ComponentRef) outside_comp_stack.pop();
                           // create resource acquire component and insert it in duplicate map                           
                           CSMDupNode ra_node = new CSMDupNode(ra_id);
                           System.out.println("Size BEFORE insertion: " + dup_map.size());
                           System.out.println("j = " + j);
                           dup_map.add(j,ra_node);
                           nodes_inserted ++;
                           System.out.println("Size AFTER insertion: " + dup_map.size());
                           acquireComp(comp,print,ra_node);
                           // create empty point and insert it in duplicate map
                           CSMDupNode e_node = new CSMDupNode(seq_id);
                           dup_map.add(j+1,e_node);
                           nodes_inserted ++;
                           emptyPoint(comp,print,e_node);
                           ra_id++;
                           seq_id++;
                       }
                    }
                    else if (prev_edge_comp_ref != curr_edge_comp_ref){
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack prev_edge_stack = new Stack ();
                        prev_edge_stack.push(prev_edge_comp_ref);
                        findParentsRA(prev_edge_comp_ref, prev_edge_stack);
                        
                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack,prev_edge_stack);
                       
                        // Acquire the components of the parents                        
                        while (!outside_comp_stack.isEmpty()){
                            ComponentRef comp = (ComponentRef) outside_comp_stack.pop();
                            // create a resource acquire component and insert it in duplicate map                           
                            CSMDupNode ra_node = new CSMDupNode(ra_id);
                            dup_map.add(j,ra_node);
                            nodes_inserted++;
                            acquireComp(comp,print,ra_node);
                            // create empty point and insert it in duplicate map
                            CSMDupNode e_node = new CSMDupNode(seq_id);
                            dup_map.add(j+1, e_node);
                            nodes_inserted++;
                            emptyPoint(comp,print,e_node);
                            seq_id++;
                            ra_id++;
                        }
                    }// if                    
                }// for                
            } // if
        } // if    
        else {
            // Must be a start point, acquire the components                        
            while (!curr_edge_stack.isEmpty()){
                ComponentRef comp = (ComponentRef) curr_edge_stack.pop();
                // create a resource acquire component and an empty point (sequence)                           
                CSMDupNode ra_node = new CSMDupNode(ra_id);
                dup_map.add(0,ra_node);
                nodes_inserted++;
                acquireComp(comp,print,ra_node);
                // create empty point and insert it in duplicate map
                CSMDupNode e_node = new CSMDupNode(seq_id);
                dup_map.add(1, e_node);
                emptyPoint(comp,print,e_node);
                nodes_inserted++;
                seq_id++;
                ra_id++;
            }
        } // else        
        
        // debug - dup-map contents
        for (int b = 0; b < dup_map.size(); b ++){ 
             System.out.println("dup_map " + b + " " + dup_map.get(b));
        } // for
        return nodes_inserted;
    } // function
    
    // prints XML representation of Resource Acquire element
    public void acquireComp(ComponentRef comp, PrintStream ps, CSMDupNode node){
        
        // PathNode successor = prev_edge_list.getNode()        
        
        // object attributes 
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" +
                               " acquire=\"" + "c" + comp.getId() + "\"" +   
                               " successor=\"" + "c" + "node.getSuccessor()" + "\"" + 
                               " predecessor=\"" + "c" + "node.getPredecessor()" + "\"" + "/>";
        ps.println("            " + ra_attributes);         
    }
    
    // prints XML representation of EmptyPoint element
    public void emptyPoint (ComponentRef comp, PrintStream ps, CSMDupNode node){
               
        // object attributes
        String epoint_attributes = "<Sequence id=\"" + node.getId() + "\"" + 
                                   " name=\"" + " " + "\"" + "/>";
        // output to file
        ps.println("           " + epoint_attributes);
        ps.flush();              
    }
    
    // calculates the difference between two stacks
    public Stack stackDifference(Stack stack_one, Stack stack_two){
        Stack stack_three = new Stack();
        for (int i=0; i<stack_one.size();i++){
            if(!stack_two.contains(stack_one.get(i))){
                stack_three.push(stack_one.get(i));
            }
        }
        return stack_three;
    }   
    
}
