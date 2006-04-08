package implicit;

import java.util.ArrayList;
import java.util.Iterator;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.UCMmap;

/**
 * <!-- begin-user-doc -->
 * Creates a list of CSMDupNodes, that is meant to replicate the UCM map 
 * <!-- end-user-doc -->
 * @see implicit 
 * @generated
 */
public class CSMDupNodeList {
    //  will contain CSMDupNodes (which in turn may point to a PathNode or an RA node)
    ArrayList nodeList = new ArrayList(1000);          
    
    // create list of PathNodes 
    public void DuplicateHyperEdges(UCMmap map){        
        
        
        for (Iterator iter = map.getNodes().iterator(); iter.hasNext();){
            nodeList.add(new CSMDupNode ((PathNode)iter.next()));
        }
        /*
        CSMDupNode source_pn = new CSMDupNode ((PathNode) ((NodeConnection) (connList.get(0))).getSource());        
        CSMDupNode target_pn = new CSMDupNode ((PathNode) ((NodeConnection) (connList.get(0))).getTarget());
        pathList.add(0, source_pn); 
        pathList.add(1, target_pn);
               
        // trying to associate the target of the first connection with the source of the second connection
        int index = 1;
        boolean done = false;
        while (!done){                        
            CSMDupNode node = getNextTarget(target_pn);
            if (node != null){
                ++index;               
                pathList.add(index, node); // add node to path list
                target_pn = node;
            }
            else{
                done = true;
            }
        }// while   
        */             
    } // function
        /*
    // identifies a connection (of type "Source Connnection Target") having StartPoint=Source and returns the target
    public CSMDupNode getNextTarget(CSMDupNode source){        
        for (int i=0; i < connList.size(); i++) {
            if (source.getNode() == (PathNode)((NodeConnection)(connList.get(i))).getSource()){                                                    
               return new CSMDupNode ((PathNode) ((NodeConnection)(connList.get(i))).getTarget());                                                
            }            
        } // for
        return null;
    } // function
        */
    
    /* The following are methods used to access the CSMDupNodeList */
    
    // size of path list
    public int size(){
       return nodeList.size();
    }
        
    // get node
    public CSMDupNode get(int i){
       return (CSMDupNode) nodeList.get(i);
    }          
       
    // add node at the end of list
    public void add(CSMDupNode node){
        nodeList.add(nodeList.size(),node);
    }
        
    // add node at a specific point in map
    public void add(int position, CSMDupNode node){
        nodeList.add(position,node);              
    }
        
    // checks if list is empty
    public boolean isEmpty(){
       return nodeList.isEmpty();                
    }
        
    // return a PathNode from the Duplicate Graph
    public PathNode getListNode(int i){            
       return ((CSMDupNode) (nodeList.get(i))).getNode();                
    }
   /* 
    // returns the id of the node following to this one
    public String getPredecessor(int i){  
       if (i <= 0){
           return "null";
       }
       else{    
           // if previous node is an RA or RR return its id
           int type = ((CSMDupNode)(nodeList.get(i-1))).getType();
           if (type == CSMDupNode.RA || type == CSMDupNode.EMPTY || type == CSMDupNode.RR )
               return ((CSMDupNode)(nodeList.get(i-1))).getId();
           // if previous node is a pathnode return its id
           else 
               return ((CSMDupNode)(nodeList.get(i-1))).getNode().getId();
       }
    }
    
    
    // returns the node previous to this one
    public String getSuccessor(int i){
        
        if (i >= pathList.size()-1){
            return "null";
        }
        else{    
            // if previous node is an RA or RR return its id
            int type = ((CSMDupNode)(pathList.get(i+1))).getType();
            if (type == CSMDupNode.RA || type == CSMDupNode.EMPTY || type == CSMDupNode.RR )            
                return ((CSMDupNode)(pathList.get(i+1))).getId();
            // if previous node is a pathnode return its id
            else 
                return ((CSMDupNode)(pathList.get(i+1))).getNode().getId();
        }   
    }
    */
    // for debug - prints ids of all elements in list
    public void printDupList(){
        System.out.println("----------Printing duplicate Node List-------");
        System.out.println("List size: " + nodeList.size());        
        for(int i=0; i<nodeList.size();i++){
            int type = ((CSMDupNode)(nodeList.get(i))).getType();                        
            //System.out.println("PathList Element : " + (CSMDupNode)(pathList.get(i)));
            // System.out.println("Type : " + type);
            
            if (type == CSMDupNode.RA || type == CSMDupNode.RR || type == CSMDupNode.CSMEMPTY){
                String id = ((CSMDupNode)(nodeList.get(i))).getId();
                /*
                // already existing empty point, get its id
                if (type == CSMDupNode.EMPTY && id.compareTo("") == 0){
                    String node_id = ((CSMDupNode)(nodeList.get(i))).getNode().getId();                
                    System.out.println("Index " + i + " id: " + node_id);
                }
                // new empty point, get its id
                else
                */                
                    System.out.println("Index " + i + " id: " + id);
            }                
            else{
                System.out.println("Node : " + ((CSMDupNode)(nodeList.get(i))).getNode());
                String node_id = ((CSMDupNode)(nodeList.get(i))).getId();                
                System.out.println("Index " + i + " id: " + node_id);
            }
            
        }
    }
    
    // returns the position of the node in the list of dup nodes
    public int getNodeIndex(PathNode node){
        for(int i=0; i<nodeList.size();i++){
            if (((CSMDupNode)(nodeList.get(i))).getNode() == node)
               return i;            
        }
        return -1; // not found
    }    
    
    // removes a node from the node list
    public void remove(CSMDupNode node){
        for(int i=0; i<nodeList.size();i++){
            if (((CSMDupNode)(nodeList.get(i))).getNode().getId() == node.getId()){
                nodeList.remove(i);
                System.out.println("Node: " + node + " deleted!");
            }
                          
        }
    }
    
    public void remove(PathNode node){
        for(int i=0; i<nodeList.size();i++){
            if (((CSMDupNode)(nodeList.get(i))).getNode() == node){
                nodeList.remove(i);
                System.out.println("Node: " + node + " deleted!");
            }          
        }
    }    
}
