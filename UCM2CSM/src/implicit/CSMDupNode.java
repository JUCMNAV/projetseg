package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import one2one.AbstractConverter;
import one2one.AndForkConverter;
import one2one.AndJoinConverter;
import one2one.EmptyPointConverter;
import one2one.EndPointConverter;
import one2one.OrForkConverter;
import one2one.OrJoinConverter;
import one2one.PluginBindingConverter;
import one2one.ProcessingResourceConverter;
import one2one.ResponsibilityRefConverter;
import one2one.StartPointConverter;
import one2one.StubConverter;
import ucm.map.AndFork;
import ucm.map.AndJoin;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.PluginBinding;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.performance.ProcessingResource;
/**
 * <!-- begin-user-doc -->
 * A CSMDupNode is a reference to a node in the original UCMmap
 * <!-- end-user-doc -->
 * @see implicit 
 * @generated
 */
public class CSMDupNode {//extends PathNodeImpl {
    
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
    static public final int CSMEMPTY=19; // new Empty Point
    static public final int CSMDUMMY=20; // new Dummy Step
    
    // Reference to the PathNode in jUCMNav's UCM model
    private PathNode node;
    
    // id for ra, rr or sequence
    private String node_id; 
              
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
      // RA,RR/Seq/Dummy Step to be inserted
      if (raORrrORseq >= 100 && raORrrORseq < 200 ){  
          type = RA;
      }
      else if ((raORrrORseq >= 200 && raORrrORseq < 300)
           ||  (raORrrORseq >= 400 && raORrrORseq < 500)){  
          type = CSMEMPTY;
      }    
      else if (raORrrORseq >= 300 && raORrrORseq < 400 ){  
          type = RR;
      }
      else if (raORrrORseq >= 500 && raORrrORseq < 600){
          type = CSMDUMMY;
      }
      node_id = "G" + raORrrORseq;      
    }
    
    // return the id of the node
    public String getId(){
        if (node == null)
            return node_id;
        else 
            return node.getId();
    }
    
    // return the id of the node if node is a Pathnode, else return null
    public PathNode getNode(){
        if (type == RA || type == RR || type == CSMEMPTY){
            return null;
        }
        else{
            return this.node;
        }
    }
    
    public boolean isPathNode(){
        if (type == RA || type == RR || type == CSMEMPTY){
            return false;
        }
        else {
            return true;
        }
    }
    //  Converts object through polymorphism (dynamic binding)
    public void doConvert(AbstractConverter pn,
                          PrintStream ps,
                          ArrayList source,
                          ArrayList target){
        pn.Convert(ps, source, target);
    }
    
    // prints CSM representation for attribute node 
    public void printPathNode(PrintStream ps,
                              ArrayList source,
                              ArrayList target){
        // guard against non-path node elements (RA/RR)
        if (node==null)
            return;        
        //  if UCM object is found, generate CSM representation
        if(node instanceof OrJoin){
           OrJoinConverter obj = new OrJoinConverter((OrJoin)node); 
           doConvert(obj,ps, source, target);               
        }           
        else if(node instanceof AndJoin){
            AndJoinConverter obj = new AndJoinConverter((AndJoin)node); 
            doConvert(obj,ps, source, target);
        }
        else if(node instanceof OrFork){
            OrForkConverter obj = new OrForkConverter((OrFork)node); 
            doConvert(obj,ps, source, target);
        }
        else if(node instanceof AndFork){
            AndForkConverter obj = new AndForkConverter((AndFork)node); 
            doConvert(obj,ps, source, target);
        }            
        else if(node instanceof StartPoint){
            StartPointConverter obj = new StartPointConverter((StartPoint)node); 
            doConvert(obj,ps, source, target);
        }
        else if(node instanceof EndPoint){
            EndPointConverter obj = new EndPointConverter((EndPoint)node); 
            doConvert(obj,ps, source, target);
        } 
        else if(node instanceof EmptyPoint){
            EmptyPointConverter obj = new EmptyPointConverter((EmptyPoint)node);
            doConvert(obj,ps, source, target);
        }
        else if(node instanceof Stub){
            StubConverter obj = new StubConverter((Stub)node);            
            doConvert(obj,ps, source, target);                
            // process bindings
            for (Iterator iter = ((Stub) node).getBindings().iterator(); iter.hasNext();){
                PluginBinding binding = (PluginBinding) iter.next();                       
                if(binding instanceof PluginBinding){
                    PluginBindingConverter bind_obj = new PluginBindingConverter(binding);
                    doConvert(bind_obj,ps, source, target);
                }
            }            
        }
        else if(node instanceof RespRef){
            ResponsibilityRefConverter obj = new ResponsibilityRefConverter((RespRef)node);
            doConvert(obj,ps, source, target);
        }
        // **** To be implemented ****        
        else if(node instanceof ProcessingResource){            
        }        
        else{
            System.out.println("Node not implemented.");
        }                     
    }
}
