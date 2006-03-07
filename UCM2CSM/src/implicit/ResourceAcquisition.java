package implicit;

import java.util.ArrayList;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.UCMmap;

public class ResourceAcquisition {
    
          
    // other variables    
    private String prev_edge_comp;
    
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
    public void acquireResource(PathNode curr_edge, UCMmap map){
        // local variables
        ArrayList prev_edge_list = new ArrayList(1000);
        Stack curr_edge_stack = new Stack ();        
        
        // current edge is inside component 
        if (curr_edge.getContRef()!= null ){
            // find the parent component of current edge
            ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();                    
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);
            
            // debug - curr_edge_stack contents
            for (int j = 0; j < curr_edge_stack.size(); j ++){ 
                System.out.println("curr_edge_stack " + j + " " + curr_edge_stack.get(j));
            }            
           
 /*                       
            if (!prev_edge_list.isEmpty()){
                for (int i = 0 ; i < prev_edge_list.size(); i++){ // Iterator list_iterator = prev_edge_list.iterator();list_iterator.hasNext();){
                    // Previous edge must be in a different component
                    prev_edge_comp = ((ComponentElement)((PathNode)prev_edge_list.get(i-1))).getId();
                    if (prev_edge_comp != curr_edge_comp){
                        //find which parents of curr_edge are not included in those prev_edge
                        // difference, keeps outside components
                        // Acquire the components of the parents
                    }
                }                
            }            
        }
*/
        }
        else {
            // Must be a start point, acquire the components
            System.out.println("acquireResource:  This is a StartPoint");
        }
    }
    
    // prints XML representation of Resource Acquire element
    public void acquireComp(){
        
    }
    
}
