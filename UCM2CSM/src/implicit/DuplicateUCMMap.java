package implicit;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.UCMmap;


public class DuplicateUCMMap {
    
    // global variables    
    ArrayList pathList = new ArrayList(1000);
    EList connList; // gets the connections between nodes    

    // constructor
    public void DuplicateUCMMap(){ 
    }

    public void DuplicateHyperEdges(UCMmap map){        
        connList = map.getConnections(); 
        PathNode source_pn = (PathNode) ((NodeConnection) (connList.get(0))).getSource();        
        PathNode target_pn = (PathNode) ((NodeConnection) (connList.get(0))).getTarget();                 
        pathList.add(0,source_pn); 
        pathList.add(1,target_pn);
               
        // trying to associate the target of the first connection with the source of the second connection
        int index = 1;
        boolean done = false;
        while (!done){            
            PathNode node = getNextTarget(target_pn);
            if (node != null){
                ++index;
                // pathList[index] = node; // add node to path list
                pathList.add(index,node); // add node to path list
                target_pn = node;
            }
            else{
                done = true;
            }
        }
        
        // for debug
        for (int i=0; i < pathList.size(); i++) {
            System.out.println("pathList " + i + " = " + pathList.get(i));            
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
    
}
