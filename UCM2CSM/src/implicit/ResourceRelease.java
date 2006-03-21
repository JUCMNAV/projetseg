package implicit;

import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Inserts Resource Release objects in duplicate map 
 * <!-- end-user-doc -->
 * @see implicit
 * @generated
 */
public class ResourceRelease {
    
    // RR and Empty Point IDs
    int rr_id = 300;                   
    int seq_id = 400;    
    PrintStream ps;
    
    // constructor 
    public ResourceRelease(PrintStream ps){
        this.ps = ps;
    }
    
    // adds all hyperedge parent components to stack
    public void findParentsRR(ComponentRef component_ref, Stack edge_stack){
        // The top of the stack is the outermost component        
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null){            
            findParentsRR(parent_ref, edge_stack);
            edge_stack.push(parent_ref);
        }                
    }
  
    // Resource Release algorithm
    public int releaseResource(PathNode curr_edge, CSMDupNodeList dup_map, Hashtable component_release){
        // list that will store edges to be parsed (will contain pathnodes only)
        CSMDupNodeList next_edge_list = new CSMDupNodeList();
        int nodes_inserted = 0; // total nodes inserted since last run        
        int curr_edge_pos = dup_map.getNodeIndex(curr_edge); // position where to insert node                          
        Stack curr_edge_stack = new Stack (); // will hold all the parent components of current edge               
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();
        
        // current edge is inside component 
        if (curr_edge_comp_ref != null ){            
            boolean done = false;         
            // parsing list of dupnodes (each can be either a pathnode or an RA/RR/Seq
            for (int i = curr_edge_pos + 1; !done && i < dup_map.size(); i++) {
                PathNode node = dup_map.getListNode(i);
                if (node != null) {
                    if (node == null){
                        done = true; 
                    }
                    else{
                        next_edge_list.add(new CSMDupNode (node));   // populate next_edge_list                     
                    }
                }// if
            }//for                        
            
            // find the parent component of current edge                                                    
            findParentsRR(curr_edge_comp_ref, curr_edge_stack);
            curr_edge_stack.push(curr_edge_comp_ref);
            /*
            // for debug - next_edge list contents
            System.out.println("Contents of next edge list");
            for (int i=0; i < next_edge_list.size(); i++){
                System.out.println(next_edge_list.get(i));
            }
            */
            if (!next_edge_list.isEmpty()){                
                //PathNode next_edge = curr_edge;
                //for (int j = 0; j < next_edge_list.size(); j++){
                for (int j = 0; j < 1; j++){
                    // Next edge must be in a different component
                    // curr_edge = next_edge_list.getListNode(j);
                    PathNode next_edge = next_edge_list.getListNode(j);
                    System.out.println("curr_edge: " + curr_edge);
                    System.out.println("next_edge: " + next_edge);
                    ComponentRef next_edge_comp_ref = (ComponentRef) next_edge.getContRef();
                    System.out.println("next_edge_comp_ref: " + next_edge_comp_ref);
                    Stack outside_comp_stack = new Stack();
                    
                    // next edge is an end-point                    
                    if (next_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                            outside_comp_stack.push(curr_edge_stack.get(b)); 
                       } // for 
                        
                       while (!outside_comp_stack.isEmpty()){
                           ComponentRef comp = (ComponentRef) outside_comp_stack.pop();                           
                           // create resource acquire component and insert it in duplicate map                           
                           CSMDupNode rr_node = new CSMDupNode(rr_id);                          
                           System.out.println("Node id: " + rr_id);
                           System.out.println("Insert @ position: " + (curr_edge_pos + 1));                          
                           dup_map.add((curr_edge_pos + 1),rr_node);
                           nodes_inserted ++;
                           // create empty point and insert it in duplicate map
                           CSMDupNode e_node = new CSMDupNode(seq_id);
                           System.out.println("Node id: " + seq_id);
                           System.out.println("Insert @ position: " + (curr_edge_pos + 1));
                           dup_map.add((curr_edge_pos + 1),e_node);
                           nodes_inserted ++;
                           component_release.put(new String(rr_node.getId()),comp);
                           rr_id++;
                           seq_id++;
                       }// while
                    }// if
                    
                    else if (next_edge_comp_ref != curr_edge_comp_ref){
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack next_edge_stack = new Stack ();                        
                        findParentsRR(next_edge_comp_ref, next_edge_stack);
                        next_edge_stack.push(next_edge_comp_ref);
                        
                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack, next_edge_stack);
                        
                        // for debug - outside_comp_stack contents
                        System.out.println("Contents of outside stack");
                        for (int i=0; i < outside_comp_stack.size(); i++){
                            System.out.println(outside_comp_stack.get(i));
                        }
                        
                        // Acquire the components of the parents                        
                        while (!outside_comp_stack.isEmpty()){
                            ComponentRef comp = (ComponentRef) outside_comp_stack.pop();                           
                            // create a resource acquire component and insert it in duplicate map                           
                            CSMDupNode rr_node = new CSMDupNode(rr_id);                          
                            System.out.println("Node id: " + rr_id);
                            System.out.println("Insert @ position:" + (curr_edge_pos + 1));
                            dup_map.add((curr_edge_pos + 1),rr_node);
                            nodes_inserted++;
                            // create empty point and insert it in duplicate map
                            CSMDupNode e_node = new CSMDupNode(seq_id);
                            System.out.println("Node id: " + seq_id);
                            System.out.println("Insert @ position: " + (curr_edge_pos + 1));
                            dup_map.add((curr_edge_pos + 1), e_node);
                            nodes_inserted++;
                            component_release.put(new String(rr_node.getId()),comp);                                                                                    
                            rr_id++;
                            seq_id++;
                        }
                    }// if                    
                }// for                
            } // if
        } // if    
        else {
            // Must be an end point, acquire the components                        
            while (!curr_edge_stack.isEmpty()){
                ComponentRef comp = (ComponentRef) curr_edge_stack.pop();                
                // create a resource acquire component and an empty point (sequence)                           
                CSMDupNode rr_node = new CSMDupNode(rr_id);
                dup_map.add(dup_map.size() - 1,rr_node);
                nodes_inserted++;
                // create empty point and insert it in duplicate map
                CSMDupNode e_node = new CSMDupNode(seq_id);
                dup_map.add(dup_map.size() - 1, e_node);
                nodes_inserted++;
                component_release.put(new String(rr_node.getId()),comp);                                                
                rr_id++;
                seq_id++;
            }
        } // else        
        return nodes_inserted;
    } // function
    
    // prints XML representation of Resource Release element
    public void releaseComp(ComponentRef comp,
                            CSMDupNode node,
                            CSMDupNodeList list,
                            int position){
                  
        // initializing attributes
        String successor = list.getSuccessor(position);
        String predecessor = list.getPredecessor(position);
        
        // object attributes 
        String ra_attributes = "<ResourceRelease id=\"" + node.getId() + "\"" +
                               " name=\"" + " " + "\"" +   
                               " release=\"" + "c" + comp.getId() + "\"" +   
                               " successor=\"" + "h" + successor + "\"" + 
                               " predecessor=\"" + "h" + predecessor + "\"" + "/>";        
        ps.println("            " + ra_attributes);         
    }
    
    // prints XML representation of Dummy EmptyPoint element
    public void acquireEmptyPoint (CSMDupNode node){
               
        // object attributes              
        String epoint_attributes = "<Sequence id=\"" + node.getId() + "\"" + "/>";
        // output to file
        ps.println("            " + epoint_attributes);
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
