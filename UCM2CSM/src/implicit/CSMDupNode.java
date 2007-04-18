package implicit;

import java.io.PrintStream;
import java.util.ArrayList;

import one2one.AbstractConverter;
import one2one.AndForkConverter;
import one2one.AndJoinConverter;
import one2one.ConnectConverter;
import one2one.DirectionArrowConverter;
import one2one.EmptyPointConverter;
import one2one.EndPointConverter;
import one2one.OrForkConverter;
import one2one.OrJoinConverter;
import one2one.ResponsibilityRefConverter;
import one2one.StartPointConverter;
import one2one.StubConverter;
import one2one.TimerConverter;
import one2one.WaitingPlaceConverter;
import ucm.map.Abort;
import ucm.map.AndFork;
import ucm.map.AndJoin;
import ucm.map.Connect;
import ucm.map.DirectionArrow;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.FailurePoint;
import ucm.map.Loop;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.Timer;
import ucm.map.WaitingPlace;
import ucm.performance.ProcessingResource;
import ucm.performance.Timestamp;

/**
 * <!-- begin-user-doc --> A CSMDupNode is a reference to a node in the original UCMmap <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */
public class CSMDupNode {// extends PathNodeImpl {

    // The various types of PathNode elements in jUCMNav

    static public final int RESPREF = 1;
    static public final int START = 2;
    static public final int END = 3;
    static public final int EMPTY = 4;
    static public final int TIMESTAMP = 5;
    static public final int FAILURE = 6;
    static public final int ARROW = 7;
    static public final int CONNECT = 8;
    static public final int STUB = 9;
    static public final int ABORT = 10;
    static public final int WAIT = 11;
    static public final int ORFORK = 12;
    static public final int ANDFORK = 13;
    static public final int ORJOIN = 14;
    static public final int ANDJOIN = 15;
    static public final int LOOP = 16;
    static public final int UNDEFINED = 0;
    private int type = UNDEFINED;
    private ArrayList resourcesDownstream = new ArrayList();
    private ArrayList resourcesUpstream = new ArrayList();
    private ResourceAttribs resourceToAcquire = null;
    private ResourceAttribs resourceToRelease = null;

    private String res = null;
    
    public void setResToAcquire(String res) {
	this.res = res;
    }

    public String getResToAcquire() {
	return res;
    }

    public void setResourceToAcquire(ResourceAttribs resAttribs) {
	resourceToAcquire = resAttribs;
    }

    public ResourceAttribs getResourceToAcquire() {
	return resourceToAcquire;
    }

    public void setResToRelease(String res) {
	this.res = res;
    }

    public String getResToRelease() {
	return res;
    }
    public void setResourceToRelease(ResourceAttribs resAttribs) {
	resourceToRelease = resAttribs;
    }

    public ResourceAttribs getResourceToRelease() {
	return resourceToRelease;
    }

    // New types of elements
    static public final int RA = 17; // Resource Allocate
    static public final int RR = 18; // Resource Release
    static public final int CSMEMPTY = 19; // new Empty Point
    static public final int CSMDUMMY = 20; // new Dummy Step
    static public final int CSMSTEP = 21; // EmptyPoint into DummyStep

    // Convert (int) Type to String (for debugging purposes) Js
    public String getTypeString() {
	String textual;
	if (type == RESPREF) {
	    textual = "RESPREF";
	} else if (type == START) {
	    textual = "START";
	} else if (type == END) {
	    textual = "END";
	} else if (type == EMPTY) {
	    textual = "EMPTY";
	} else if (type == TIMESTAMP) {
	    textual = "TIMESTAMP";
	} else if (type == FAILURE) {
	    textual = "FAILURE";
	} else if (type == ARROW) {
	    textual = "ARROW";
	} else if (type == CONNECT) {
	    textual = "CONNECT";
	} else if (type == STUB) {
	    textual = "STUB";
	} else if (type == ABORT) {
	    textual = "ABORT";
	} else if (type == WAIT) {
	    textual = "WAIT";
	} else if (type == ORFORK) {
	    textual = "ORFORK";
	} else if (type == ANDFORK) {
	    textual = "ANDFORK";
	} else if (type == ORJOIN) {
	    textual = "ORJOIN";
	} else if (type == ANDJOIN) {
	    textual = "ANDJOIN";
	} else if (type == LOOP) {
	    textual = "LOOP";
	} else if (type == UNDEFINED) {
	    textual = "UNDEFINED";
	} else if (type == RA) {
	    textual = "RA";
	} else if (type == RR) {
	    textual = "RR";
	} else if (type == CSMEMPTY) {
	    textual = "CSMEMPTY";
	} else if (type == CSMDUMMY) {
	    textual = "CSMDUMMY";
	} else if (type == CSMSTEP) {
	    textual = "CSMSTEP";
	} else {
	    textual = "NOT DEFINED IN SYSTEM";
	}
	return textual;
    }
    
    // Reference to the PathNode in jUCMNav's UCM model
    private PathNode node;

    // id for ra, rr or sequence
    private String node_id;

    // Constructors
    public CSMDupNode(PathNode node) {
        this.node = node;
        // Set the node type
        if (node instanceof OrJoin) {
            type = ORJOIN;
        } else if (node instanceof AndJoin) {
            type = ANDJOIN;
        } else if (node instanceof OrFork) {
            type = ORFORK;
        } else if (node instanceof AndFork) {
            type = ANDFORK;
        } else if (node instanceof StartPoint) {
            type = START;
            resourcesDownstream = (new ResourceUtil()).getResourcesNeeded(node);
            resourcesUpstream = resourcesDownstream;
        } else if (node instanceof EndPoint) {
            type = END;
            resourcesDownstream = (new ResourceUtil()).getResourcesNeeded(node);
            resourcesUpstream = resourcesDownstream;
        } else if (node instanceof EmptyPoint) {
            type = EMPTY;
        } else if (node instanceof Stub) {
            type = STUB;
            resourcesDownstream = (new ResourceUtil()).getResourcesNeeded(node);
            resourcesUpstream = resourcesDownstream;
        } else if (node instanceof RespRef) {
            type = RESPREF;
            resourcesDownstream = (new ResourceUtil()).getResourcesNeeded(node);
            resourcesUpstream = resourcesDownstream;
        } else if (node instanceof OrJoin) {
            type = ORJOIN; // js
        } else if (node instanceof Timestamp) {
            type = TIMESTAMP; // js
        } else if (node instanceof FailurePoint) {
            type = FAILURE; // js
        } else if (node instanceof DirectionArrow) {
            type = ARROW; // js
        } else if (node instanceof Connect) {
            type = CONNECT; // js
        } else if (node instanceof Abort) {
            type = ABORT; // js
        } else if (node instanceof WaitingPlace) {
            type = WAIT; // js
        } else if (node instanceof Loop) {
            type = LOOP; // js
        } else {
            type = UNDEFINED;
        }
    }

    public ArrayList getResourcesDownstream() {
	return resourcesDownstream;
    }

    public void setResourcesDownstream(ArrayList usedResources) {
	this.resourcesDownstream =  usedResources;
    }
    
    public ArrayList getResourcesUpstream() {
	return resourcesUpstream;
    }

    public void setResourcesUpstream(ArrayList usedResources) {
	this.resourcesUpstream =  usedResources;
    }
    
    // return pathnode type
    public int getType() {
        return type;
    }

    // return pathnode type. js
    public void setType(int type) {
        this.type = type;
    }

    // set ID. js
    public void setID(String id) {
    	this.node_id = id;
    }

    public CSMDupNode(int raORrrORseq) {  // limitation.  js
        // RA,RR/Seq/Dummy Step to be inserted
        if (raORrrORseq >= 1000 && raORrrORseq < 2000) {
            type = RA;
        } else if ((raORrrORseq >= 2000 && raORrrORseq < 3000) || (raORrrORseq >= 4000 && raORrrORseq < 5000)) {
            type = CSMEMPTY;
        } else if (raORrrORseq >= 3000 && raORrrORseq < 4000) {
            type = RR;
        } else if (raORrrORseq >= 5000 && raORrrORseq < 6000) {
            type = CSMDUMMY;
        }
        node_id = "G" + raORrrORseq;
    }

    // return the id of the node
    public String getId() {
	String id;
        if (node == null) {
            id = node_id;
        }
        else {
            id = node.getId();
        }
        return id;
    }

    // return the id of the node if node is a Pathnode, else return null
    public PathNode getNode() {
	PathNode pn;
        if (type == RA || type == RR || type == CSMEMPTY) {
            pn =  null;
        } else {
            pn = this.node;
        }
        return pn;
    }

    // return the pathnode if node is a Pathnode, else return null. js
    public PathNode getNode2() {
	PathNode pn;
        if (type == RA || type == RR) {
            pn =  null;
        } else {
            pn = this.node;
        }
        return pn;
    }

    public boolean isPathNode() {
	boolean notPathnodeKind = (type == RA || type == RR || type == CSMEMPTY);
	return !notPathnodeKind;
    }

    // Converts object through polymorphism (dynamic binding)
    public void doConvert(AbstractConverter pn, PrintStream ps, ArrayList source, ArrayList target) {
        pn.Convert(ps, source, target);
    }

    // prints CSM representation for attribute node
    public void printPathNode(PrintStream ps, ArrayList source, ArrayList target) {
        // guard against non-path node elements (RA/RR)
        if (node == null)
            return;
        // if UCM object is found, generate CSM representation
        if (node instanceof OrJoin) {
            OrJoinConverter obj = new OrJoinConverter((OrJoin) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof AndJoin) {
            AndJoinConverter obj = new AndJoinConverter((AndJoin) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof OrFork) {
            OrForkConverter obj = new OrForkConverter((OrFork) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof AndFork) {
            AndForkConverter obj = new AndForkConverter((AndFork) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof StartPoint) {
            StartPointConverter obj = new StartPointConverter((StartPoint) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof EndPoint) {
            EndPointConverter obj = new EndPointConverter((EndPoint) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof EmptyPoint) {
            EmptyPointConverter obj = new EmptyPointConverter((EmptyPoint) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof Stub) {
            StubConverter obj = new StubConverter((Stub) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof RespRef) {
            ResponsibilityRefConverter obj = new ResponsibilityRefConverter((RespRef) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof DirectionArrow) {
            DirectionArrowConverter obj = new DirectionArrowConverter((DirectionArrow) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof Timer) {
            TimerConverter obj = new TimerConverter((Timer) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof Connect) {
            ConnectConverter obj = new ConnectConverter((Connect) node);
            doConvert(obj, ps, source, target);
        } else if (node instanceof WaitingPlace) {
            WaitingPlaceConverter obj = new WaitingPlaceConverter((WaitingPlace) node);
            doConvert(obj, ps, source, target);
        }
        // **** To be implemented ****
        else if (node instanceof ProcessingResource) {
        } else {
            System.out.println("Node type not implemented: " + node.getClass().getName());
        }
    }
}
