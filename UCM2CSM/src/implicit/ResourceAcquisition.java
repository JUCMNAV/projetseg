package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
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
    static int ra_id = 100;                   
    static int seq_id = 200;    
    PrintStream ps;
    
    // constructor 
    public ResourceAcquisition(PrintStream ps){
        this.ps = ps;
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
    public int acquireResource(PathNode curr_edge,
                               CSMDupNodeList dup_map,
                               CSMDupConnectionList dup_map_conn,
                               Hashtable component_acquire){
        // list that will store edges to be parsed (will contain pathnodes only)
        // CSMDupNodeList prev_edge_list = new CSMDupNodeList();
        int nodes_inserted = 0; // total nodes inserted since last run        
        // int curr_edge_pos = dup_map.getNodeIndex(curr_edge); // position where to insert node                          
        Stack curr_edge_stack = new Stack (); // will hold all the parent components of current edge
        System.out.println("curr_edge: " + curr_edge);
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();
        System.out.println("curr_edge_comp_ref " + curr_edge_comp_ref);
        
        // current edge is inside component 
        if (curr_edge_comp_ref != null ){
            
            boolean done = false;
            ArrayList prev_edge_list = new ArrayList(1000);
            String curr_edge_id = curr_edge.getId();
            dup_map_conn.getPrevEdgeList(curr_edge_id, prev_edge_list); 
            
            // for debug -- Printing prev_edge_list
            System.out.println("--------Printing prev_edge_list----------");
            for (int i=0;i<prev_edge_list.size(); i++){
                System.out.println("Index " + i + " Contents: " + prev_edge_list.get(i));
            }
            System.out.println("-----------------------------------------");
            
            // find the parent component of current edge                                        
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);
            
            if (!prev_edge_list.isEmpty()){
                // only look at the last two elements of the prev_edge_list
                for (int j = prev_edge_list.size() - 1; j < prev_edge_list.size(); j++){
                    // Previous edge must be in a different component                    
                    PathNode prev_edge = (PathNode) prev_edge_list.get(j);                    
                    ComponentRef prev_edge_comp_ref = (ComponentRef) prev_edge.getContRef(); 
                    Stack outside_comp_stack = new Stack();
                    // prev edge is a start point                    
                    if (prev_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                            outside_comp_stack.push(curr_edge_stack.get(b)); 
                       } // for
                        
                        // for debug - original outside stack
                        System.out.println("Original stack- S point");
                        for (int i=0; i<outside_comp_stack.size();i++){
                            System.out.println("Index: " + i + " Contents " + outside_comp_stack.get(i));
                        }
                      
                       /* 
                       outside_comp_stack = reverseStack (outside_comp_stack);
                       
                       // for debug - reversed outside stack
                       System.out.println("Reversed stack-S point");
                       for (int i=0; i<outside_comp_stack.size();i++){
                           System.out.println("Index: " + i + " Contents " + outside_comp_stack.get(i));
                       }
                       */
                       // for every component in the outside stack, add an RA and an Empty Point 
                       while (!outside_comp_stack.isEmpty()){
                           nodes_inserted = addRA(outside_comp_stack,
                                                  // curr_edge_pos,
                                                  curr_edge, 
                                                  dup_map,
                                                  dup_map_conn,
                                                  nodes_inserted,
                                                  component_acquire);
                       }
                    }
                    else if (prev_edge_comp_ref != curr_edge_comp_ref){
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack prev_edge_stack = new Stack ();
                        prev_edge_stack.push(prev_edge_comp_ref);
                        findParentsRA(prev_edge_comp_ref, prev_edge_stack);
                        
                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack,prev_edge_stack);
                        
                        
                        // for debug - reversed outside stack
                        System.out.println("Original stack");
                        for (int i=0; i<outside_comp_stack.size();i++){
                            System.out.println("Index: " + i + " Contents " + outside_comp_stack.get(i));
                        }
                        
                        // Acquire the components of the parents                        
                        while (!outside_comp_stack.isEmpty()){
                            nodes_inserted = addRA(outside_comp_stack,
                                                   // curr_edge_pos,
                                                   curr_edge, 
                                                   dup_map,
                                                   dup_map_conn,
                                                   nodes_inserted,
                                                   component_acquire);
                        }
                    }// if                    
                }// for                
            } // if
        } // if    
        else {
            // Must be a start point, acquire the components                        
            while (!curr_edge_stack.isEmpty()){
                nodes_inserted = addRA(null,
                                       // curr_edge_pos,
                                       curr_edge, 
                                       dup_map,
                                       dup_map_conn,    
                                       nodes_inserted,
                                       component_acquire);
            }
        } // else        

        return nodes_inserted;
    } // function
    
    // prints XML representation of Resource Acquire element
    public void acquireComp(ComponentRef comp,
                            CSMDupNode node,
                            CSMDupConnectionList list){
                  
        // initializing attributes                 
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());
        
        // object attributes 
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" +
                               " name=\"" + " " + "\"" +   
                               " acquire=\"" + "c" + comp.getId() + "\"";  
                             //   " predecessor=\"" + "h" + predecessor + "\"" +
                             //  " successor=\"" + "h" + successor + "\"" + "/>";
        String ra_predecessor = " predecessor=\"" + "h" + predecessor + "\"";
        String ra_successor = " successor=\"" + "h" + successor + "\"";
        String end_ra = "/>";
        
        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")){
            ra_predecessor = " predecessor=\"" + predecessor + "\"";
        }
        if (successor.startsWith("G")){
            ra_successor = " successor=\"" + successor + "\"";
        }
                
        // printing attributes
        ps.print("            " + ra_attributes);
        ps.print(" " + ra_predecessor);
        ps.print(" " + ra_successor);
        ps.print(" " + end_ra);
        ps.println("");
    }
    
    // prints XML representation of Dummy EmptyPoint element
    public void acquireEmptyPoint (CSMDupNode node,
                                   CSMDupConnectionList list){
        
        // initializing attributes
        String target = list.getTargetForSource (node.getId());
        String source = list.getSourceForTarget(node.getId());
        
        // object attributes              
        String epoint_attributes = "<Sequence id=\"" + node.getId() + "\"" + " "; 
                                    // "target= \"h" + target + "\"" + " " +
                                    // "source= \"h" + source + "\"" + "/>";
        String epoint_target = "target= \"h" + target + "\"" + " ";
        String epoint_source = "source= \"h" + source + "\"";
        String epoint_end = "/>";
        
        // special naming convention for RR/RA objects
        if (source.startsWith("G")){
            epoint_source = " source=\"" + source + "\"";
        }
        if (target.startsWith("G")){
            epoint_target = " target=\"" + target + "\"";
        }
        
        // output to file        
        ps.print("            " + epoint_attributes);
        ps.print(" " + epoint_source);
        ps.print(" " + epoint_target);
        ps.print(" " + epoint_end);
        ps.println("");
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
        // for debug - original outside stack
        System.out.println("Original stack");
        for (int i=0; i<stack_three.size();i++){
            System.out.println("Index: " + i + " Contents " + stack_three.get(i));
        }
        // return reverseStack(stack_three);
        return stack_three;
    }
    /*
    // restructures the given stack so that the first element in is not the last element in
    public Stack reverseStack (Stack stack){
        Stack reversed_stack = new Stack();
        for (int i=stack.size()-1; i >= 0;i--){            
                reversed_stack.add(stack.get(i));                                
        }
        return reversed_stack;
    }
    */
    // inserts RA and Empty Points where necessary in the duplicate map 
    public int addRA(Stack comp_stack,
                     PathNode curr_edge,
                     // int edge_position,
                     CSMDupNodeList map,
                     CSMDupConnectionList conn_map,
                     int ins_nodes,
                     Hashtable aquire){        
        // create empty point and insert it in duplicate map
        CSMDupNode e_node = new CSMDupNode(++seq_id);
        map.add(e_node);
        ins_nodes ++;
        // create resource acquire component and insert it in duplicate map                           
        CSMDupNode ra_node = new CSMDupNode(++ra_id);                          
        map.add(ra_node);
        ins_nodes ++;
        // create new links
        CSMDupNode source = conn_map.getSourceForTarget(curr_edge);
        conn_map.add(new CSMDupConnection(source, ra_node));
        conn_map.add(new CSMDupConnection(ra_node, e_node));
        conn_map.add(new CSMDupConnection(e_node, curr_edge));
        conn_map.remove(source, curr_edge);
        if (!comp_stack.isEmpty()){
            ComponentRef comp = (ComponentRef) comp_stack.pop();
            aquire.put(new String(ra_node.getId()),comp);
        }        
        // setRaId(ra_id++); // ra_id++;
        // setRaSeqId(seq_id++); // seq_id++;
        return ins_nodes;
    }
    // methods to manipulate RA and Dummy Sequence IDs
    public int getRaSeqId(){
        return seq_id;
    } 
    public int getRaId(){
        return ra_id;
    } 
    public void setRaSeqId(int id){
        seq_id = id;
    }
    public void setRaId(int id){
        ra_id = id;
    }
}
