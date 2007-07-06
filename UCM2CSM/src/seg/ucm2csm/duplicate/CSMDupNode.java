package seg.ucm2csm.duplicate;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import seg.ucm2csm.implicit.CSMResource;
import seg.ucm2csm.implicit.CSMResourceSet;
import seg.ucm2csm.one2one.AbstractConverter;
import seg.ucm2csm.one2one.AndForkConverter;
import seg.ucm2csm.one2one.AndJoinConverter;
import seg.ucm2csm.one2one.ConnectConverter;
import seg.ucm2csm.one2one.CsmExportWarning;
import seg.ucm2csm.one2one.DirectionArrowConverter;
import seg.ucm2csm.one2one.EmptyPointConverter;
import seg.ucm2csm.one2one.EndPointConverter;
import seg.ucm2csm.one2one.OrForkConverter;
import seg.ucm2csm.one2one.OrJoinConverter;
import seg.ucm2csm.one2one.ResponsibilityRefConverter;
import seg.ucm2csm.one2one.StartPointConverter;
import seg.ucm2csm.one2one.StubConverter;
import seg.ucm2csm.one2one.TimerConverter;
import seg.ucm2csm.one2one.WaitingPlaceConverter;
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
import ucm.performance.Timestamp;

/**
 * A CSMDupNode is a reference to a node in the original UCMmap.
 * 
 * @see seg.ucm2csm.implicit
 */
public class CSMDupNode {

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

    // Types of new elements, necessary to produce CSM
    static public final int RA = 17; // Resource Allocate

    static public final int RR = 18; // Resource Release

    static public final int CSMEMPTY = 19; // new Empty Point

    static public final int CSMDUMMY = 20; // new Dummy Step

    static public final int CSMSTEP = 21; // EmptyPoint into DummyStep

    private int type = UNDEFINED;

    private CSMResourceSet resourcesDownstream = null;

    private CSMResourceSet resourcesUpstream = null;

    private CSMResource resourceToAcquire = null;

    private CSMResource resourceToRelease = null;

    private String res = null;

    /**
     * 
     * @param resource
     */
    public void setResToAcquire(String resource) {
        this.res = resource;
    }

    /**
     * 
     * @return the resource to be acquired
     */
    public String getResToAcquire() {
        return this.res;
    }

    /**
     * 
     * @param resAttribs
     */
    public void setResourceToAcquire(CSMResource resAttribs) {
	this.resourceToAcquire = resAttribs;
    }

    public CSMResource getResourceToAcquire() {
        return this.resourceToAcquire;
    }

    public void setResToRelease(String res) {
        this.res = res;
    }

    public String getResToRelease() {
        return this.res;
    }

    public void setResourceToRelease(CSMResource resAttribs) {
	this.resourceToRelease = resAttribs;
    }

    public CSMResource getResourceToRelease() {
        return this.resourceToRelease;
    }

    /**
     * Converts TypeOfNode(int) to String (for debugging purposes)
     * 
     * @return string corresponding to the node type
     */
    public String getTypeString() {
        String textual;
        if (this.type == RESPREF) {
            textual = "RESPREF"; //$NON-NLS-1$
        } else if (this.type == START) {
            textual = "START"; //$NON-NLS-1$
        } else if (this.type == END) {
            textual = "END"; //$NON-NLS-1$
        } else if (this.type == EMPTY) {
            textual = "EMPTY"; //$NON-NLS-1$
        } else if (this.type == TIMESTAMP) {
            textual = "TIMESTAMP"; //$NON-NLS-1$
        } else if (this.type == FAILURE) {
            textual = "FAILURE"; //$NON-NLS-1$
        } else if (this.type == ARROW) {
            textual = "ARROW"; //$NON-NLS-1$
        } else if (this.type == CONNECT) {
            textual = "CONNECT"; //$NON-NLS-1$
        } else if (this.type == STUB) {
            textual = "STUB"; //$NON-NLS-1$
        } else if (this.type == ABORT) {
            textual = "ABORT"; //$NON-NLS-1$
        } else if (this.type == WAIT) {
            textual = "WAIT"; //$NON-NLS-1$
        } else if (this.type == ORFORK) {
            textual = "ORFORK"; //$NON-NLS-1$
        } else if (this.type == ANDFORK) {
            textual = "ANDFORK"; //$NON-NLS-1$
        } else if (this.type == ORJOIN) {
            textual = "ORJOIN"; //$NON-NLS-1$
        } else if (this.type == ANDJOIN) {
            textual = "ANDJOIN"; //$NON-NLS-1$
        } else if (this.type == LOOP) {
            textual = "LOOP"; //$NON-NLS-1$
        } else if (this.type == UNDEFINED) {
            textual = "UNDEFINED"; //$NON-NLS-1$
        } else if (this.type == RA) {
            textual = "RA"; //$NON-NLS-1$
        } else if (this.type == RR) {
            textual = "RR"; //$NON-NLS-1$
        } else if (this.type == CSMEMPTY) {
            textual = "CSMEMPTY"; //$NON-NLS-1$
        } else if (this.type == CSMDUMMY) {
            textual = "CSMDUMMY"; //$NON-NLS-1$
        } else if (this.type == CSMSTEP) {
            textual = "CSMSTEP"; //$NON-NLS-1$
        } else {
            textual = "NOT DEFINED IN SYSTEM"; //$NON-NLS-1$
        }
        return textual;
    }

    // Reference to the PathNode in jUCMNav's UCM model
    private PathNode node;

    // id for ra, rr or sequence
    private String node_id;

    /**
     * Constructor
     * @param node
     * @param warnings
     */
    public CSMDupNode(PathNode node, Vector warnings) {
        this.node = node;
        // Set the node type
        if (node instanceof OrJoin) {
            this.type = ORJOIN;
        } else if (node instanceof AndJoin) {
            this.type = ANDJOIN;
        } else if (node instanceof OrFork) {
            this.type = ORFORK;
        } else if (node instanceof AndFork) {
            this.type = ANDFORK;
        } else if (node instanceof StartPoint) {
            this.type = START;
            // resourcesDownstream = new CSMResourceSet(node);
            // resourcesUpstream = resourcesDownstream;
        } else if (node instanceof EndPoint) {
            this.type = END;
            // resourcesDownstream = new CSMResourceSet(node);
            // resourcesUpstream = resourcesDownstream;
        } else if (node instanceof EmptyPoint) {
            this.type = EMPTY;
        } else if (node instanceof Stub) {
            this.type = STUB;
            this.resourcesDownstream = new CSMResourceSet(node, warnings);
            this.resourcesUpstream = this.resourcesDownstream;
        } else if (node instanceof RespRef) {
            this.type = RESPREF;
            this.resourcesDownstream = new CSMResourceSet(node, warnings);
            this.resourcesUpstream = this.resourcesDownstream;
        } else if (node instanceof OrJoin) {
            this.type = ORJOIN;
        } else if (node instanceof Timestamp) {
            this.type = TIMESTAMP;
        } else if (node instanceof FailurePoint) {
            this.type = FAILURE;
        } else if (node instanceof DirectionArrow) {
            this.type = ARROW;
        } else if (node instanceof Connect) {
            this.type = CONNECT;
        } else if (node instanceof Abort) {
            this.type = ABORT;
        } else if (node instanceof WaitingPlace) {
            this.type = WAIT;
        } else if (node instanceof Loop) {
            this.type = LOOP;
        } else {
            this.type = UNDEFINED;
        }
    }

    public CSMResourceSet getResourcesDownstream() {
        return this.resourcesDownstream;
    }

    public void setResourcesDownstream(CSMResourceSet usedResources) {
        this.resourcesDownstream = usedResources;
    }

    public CSMResourceSet getResourcesUpstream() {
        return this.resourcesUpstream;
    }

    public void setResourcesUpstream(CSMResourceSet usedResources) {
        this.resourcesUpstream = usedResources;
    }


    /**
     * 
     * @return the type of node
     */
    public int getType() {
        return this.type;
    }

    /**
     * Set the type of node.
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Set the nodeId
     * @param nodeId
     */
    public void setID(String nodeId) {
        this.node_id = nodeId;
    }

    /**
     * The new node is entirely defined by its ID; this is typically a node added to
     * obtain a CSM-compliant structure or to add RA/RR nodes.
     * <BR>
     * TODO: wave limitations
     * 
<<<<<<< .mine
     * @param raORrrORseq 
     * 				node ID, of an RA, RR, Dummy Sequence or Dummy Step
=======
     * @param raORrrORseq is the node ID of an RA, RR, Dummy Sequence or Dummy Step
>>>>>>> .r1280
     */
    public CSMDupNode(int raORrrORseq) {
        // RA,RR/Seq/Dummy Step to be inserted
        if (raORrrORseq >= 1000 && raORrrORseq < 2000) {
            this.type = RA;
        } else if ((raORrrORseq >= 2000 && raORrrORseq < 3000) || (raORrrORseq >= 4000 && raORrrORseq < 5000)) {
            this.type = CSMEMPTY;
        } else if (raORrrORseq >= 3000 && raORrrORseq < 4000) {
            this.type = RR;
        } else if (raORrrORseq >= 5000 && raORrrORseq < 6000) {
            this.type = CSMDUMMY;
        }
        this.node_id = "G" + raORrrORseq; //$NON-NLS-1$
    }

    // return the id of the node
    public String getId() {
        String id;
        if (this.node == null) {
            id = this.node_id;
        } else {
            id = this.node.getId();
        }
        return id;
    }

    // return the id of the node if node is a Pathnode, else return null
    public PathNode getNode() {
        PathNode pn;
        if (this.type == RA || this.type == RR || this.type == CSMEMPTY) {
            pn = null;
        } else {
            pn = this.node;
        }
        return pn;
    }

    public boolean isPathNode() {
        boolean notPathnodeKind = (this.type == RA || this.type == RR || this.type == CSMEMPTY);
        return !notPathnodeKind;
    }

    // Converts object through polymorphism (dynamic binding)
    public void doConvert(AbstractConverter pn, PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        pn.Convert(ps, source, target, warnings);
    }

    /**
     * Prints CSM representation for attribute node
     * 
     * @param ps
     * @param source
     * @param target
     * @param warnings
     */
    public void printPathNode(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {
        // guard against non-path node elements (RA/RR)
        if (this.node == null)
            return;
        // if UCM object is found, generate CSM representation
        if (this.node instanceof OrJoin) {
            OrJoinConverter obj = new OrJoinConverter((OrJoin) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof AndJoin) {
            AndJoinConverter obj = new AndJoinConverter((AndJoin) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof OrFork) {
            OrForkConverter obj = new OrForkConverter((OrFork) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof AndFork) {
            AndForkConverter obj = new AndForkConverter((AndFork) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof StartPoint) {
            StartPointConverter obj = new StartPointConverter((StartPoint) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof EndPoint) {
            EndPointConverter obj = new EndPointConverter((EndPoint) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof EmptyPoint) {
            EmptyPointConverter obj = new EmptyPointConverter((EmptyPoint) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof Stub) {
            StubConverter obj = new StubConverter((Stub) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof RespRef) {
            ResponsibilityRefConverter obj = new ResponsibilityRefConverter((RespRef) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof DirectionArrow) {
            DirectionArrowConverter obj = new DirectionArrowConverter((DirectionArrow) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof Timer) {
            TimerConverter obj = new TimerConverter((Timer) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof Connect) {
            ConnectConverter obj = new ConnectConverter((Connect) this.node);
            doConvert(obj, ps, source, target, warnings);
        } else if (this.node instanceof WaitingPlace) {
            WaitingPlaceConverter obj = new WaitingPlaceConverter((WaitingPlace) this.node);
            doConvert(obj, ps, source, target, warnings);
        }
        // **** There should not remain any unimplemented node type ****
        else {
            warnings.add(new CsmExportWarning(Messages.getString("CSMDupNode.NoTypeNotImplemented") + this.node.getClass().getName(), this.node)); //$NON-NLS-1$
        }
    }
}
