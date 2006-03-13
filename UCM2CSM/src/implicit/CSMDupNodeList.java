package implicit;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

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
    ArrayList pathList = new ArrayList(1000);    
    EList connList; // gets the connections between nodes  
    
    //  create links to map
    public void DuplicateHyperEdges(UCMmap map){        
        connList = map.getConnections(); 
        PathNode source_pn = (PathNode) ((NodeConnection) (connList.get(0))).getSource();        
        PathNode target_pn = (PathNode) ((NodeConnection) (connList.get(0))).getTarget();
        // will contain CSMDupNodes
        pathList.add(0, source_pn); 
        pathList.add(1, target_pn);
               
        // trying to associate the target of the first connection with the source of the second connection
        int index = 1;
        boolean done = false;
        while (!done){            
            PathNode node = getNextTarget(target_pn);
            if (node != null){
                ++index;               
                pathList.add(index, node); // add node to path list
                target_pn = node;
            }
            else{
                done = true;
            }
        }
        for (int i = 0; i<pathList.size(); i++){
            System.out.println("PathList " + i + " : " + pathList.get(i).toString());
        }
    }
        
        // identifies a connection (of type "Source Connnection Target") having StartPoint=Source and returns the target
        public PathNode getNextTarget(PathNode source){        
            for (int i=0; i < connList.size(); i++) {
                if (source == (PathNode) ((NodeConnection)(connList.get(i))).getSource()){
                    return (PathNode) ((NodeConnection)(connList.get(i))).getTarget();                
                }            
            }
            return null;
        }
        
        // size of path list
        public int size(){
            return pathList.size();
        }
        
        // get node
        public CSMDupNode get(int i){
            return (CSMDupNode) pathList.get(i);
        }
        
               
        // add node
        public void add(PathNode node){
            pathList.add(pathList.size(),node);
        }
        
        // checks if list is empty
        public boolean isEmpty(){
            return pathList.isEmpty();                
        }
        

        public PathNode getNode(int i){
            return (PathNode) pathList.get(i);                
        }
    
}
