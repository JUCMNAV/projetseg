package implicit;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import ucm.map.AndFork;
import ucm.map.AndJoin;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.UCMmap;
/**
 * <!-- begin-user-doc -->
 * Used to define existing PathNodes and new nodes such as Resource Acquire, 
 * Resource Release and Sequence.
 * <!-- end-user-doc -->
 * @see implicit 
 * @generated
 */
public class CSMDupNode {
    
    // The various types of PathNode elements in jUCMNav

    static public final int RESPREF=1;
    static public final int START=2;
    static public final int END=3;
    static public final int EMPTY=4;
    static public final int TIMESTAMP=5;
    static public final int FAILURE=6;
    static public final int ARROW=7;
    static public final int CONNECT=8;
    static public final int STUB=9;
    static public final int ABORT=10;
    static public final int WAIT=11;
    static public final int ORFORK=12;
    static public final int ANDFORK=13;
    static public final int ORJOIN=14;
    static public final int ANDJOIN=15;
    static public final int LOOP=16;
    static public final int UNDEFINED=0;
    private int type=UNDEFINED;
    
    //  New types of elements
    static public final int RA=17; // Resource Allocate 
    static public final int RR=18; // Resource Release
    
    // Reference to the PathNode in jUCMNav's UCM model
    private PathNode node;
    
    // id for ra, rr or sequence
    private String node_id = "";
    
    // Constructors
    public CSMDupNode(PathNode node)
    {
        this.node = node;    
        // Set the node type          
        if(node instanceof OrJoin){
            type = ORJOIN;
        }           
        else if(node instanceof AndJoin){
            type = ANDJOIN;
        }
        else if(node instanceof OrFork){
            type = ORFORK;
        }
        else if(node instanceof AndFork){
            type = ANDFORK;
        }            
        else if(node instanceof StartPoint){
            type = START;
        }
        else if(node instanceof EndPoint){
            type = END;
        }
        else if(node instanceof EmptyPoint){
            type = EMPTY;
        }
        else if(node instanceof Stub){
            type = STUB;
        }
        else if(node instanceof RespRef){
            type = RESPREF;
       }                 
       else{
            type = UNDEFINED;
       }
      
    }
    
    // return pathnode type
    public int getType(){
        return type;
    }

    public CSMDupNode(int raORrrORseq)
    {
      // RA or RR to be inserted      
      type = RA;
      node_id = "G" + raORrrORseq;
    }
    
    // return the id of the node
    public String getId(){
        return node_id;
    }
}
