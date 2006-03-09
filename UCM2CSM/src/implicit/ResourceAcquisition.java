package implicit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.UCMmap;

public class ResourceAcquisition {
              
    // other variables    
    // private ComponentRef prev_edge_comp_ref;
       
    // constructor 
    public ResourceAcquisition(){        
    }
    
    // adds all hyperedge parent components to stack
    public void findParentsRA(ComponentRef component_ref, Stack edge_stack){
        // The top of the stack is the outermost component
        System.out.println("componentRef: " + (ComponentRef) component_ref);
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null){
            edge_stack.push(parent_ref);
            findParentsRA(parent_ref, edge_stack);
        }                
    }
  
    // Resource Acquire algorithm
    public void acquireResource(PathNode curr_edge, UCMmap map){
        
        // local variables                  
        Stack curr_edge_stack = new Stack ();
        ArrayList prev_edge_list = new ArrayList();
        // populate local prev_edge_list -- PROBLEM: How to populate this list (in which order?)
        boolean done = false;
        for (Iterator iter = map.getNodes().iterator(); iter.hasNext() && !done;) {
            PathNode node = (PathNode) iter.next();
            if (node == curr_edge){
               done = true; 
            }
            else{
                prev_edge_list.add(node);
                System.out.println("Prev. Edges: " + prev_edge_list.toString());
            }
        }
        
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();
        System.out.println("curr_edge: " + curr_edge);
        System.out.println("curr_edge_comp_ref: " + curr_edge_comp_ref);
        
        // current edge is inside component 
        if (curr_edge_comp_ref != null ){
            // find the parent component of current edge                                        
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);
            
            if (!prev_edge_list.isEmpty()){
                for (int j = 0; j < prev_edge_list.size(); j++){                      
                    // Previous edge must be in a different component
                    PathNode prev_edge = (PathNode) prev_edge_list.get(j);
                    System.out.println("prev_edge: " + prev_edge_list.get(j));
                    ComponentRef prev_edge_comp_ref = (ComponentRef) prev_edge.getContRef(); 
                    System.out.println("prev_edge_comp_ref: " + prev_edge_comp_ref);
                    
                    if (prev_edge_comp_ref != curr_edge_comp_ref){
                        
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack prev_edge_stack = new Stack ();
                        prev_edge_stack.push(prev_edge_comp_ref);
                        findParentsRA(prev_edge_comp_ref, prev_edge_stack);
                        
                        // Difference, keeps outside components
                        Stack outside_comp_stack = new Stack ();
                        
                        for (int i=0; i < prev_edge_stack.size(); i++){
                            for (int k=0; k < curr_edge_stack.size(); k++){
                                if (prev_edge_stack.get(i) == curr_edge_stack.get(k)){
                                    outside_comp_stack.push(curr_edge_stack.get(k));
                                } // if
                            } // for    
                        } // for
                        
                        // debug - prev_edge_stack contents
                        for (int a = 0; a < prev_edge_stack.size(); a ++){ 
                            System.out.println("prev_edge_stack " + a + " " + prev_edge_stack.get(a));
                        } // for 
                        
                        // debug - curr_edge_stack contents
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                             System.out.println("curr_edge_stack " + b + " " + curr_edge_stack.get(b));
                        } // for
                        
                        // debug - outside_comp_stack contents
                        for (int c = 0; c < outside_comp_stack.size(); c ++){ 
                             System.out.println("outside_comp_stack " + c + " " + outside_comp_stack.get(c));
                        } //for    
                        
                        // Acquire the components of the parents
                    }// if
                    
                }// for                
            } // if                            
            else {
                // Must be a start point, acquire the components
                System.out.println("acquireResource:  This is a StartPoint");
            } // else            
        } // if
    } // function
    
    // prints XML representation of Resource Acquire element
    public void acquireComp(){
        
    }
    
}
