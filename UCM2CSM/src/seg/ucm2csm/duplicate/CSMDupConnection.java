package seg.ucm2csm.duplicate;

import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * A CSMDupConnection is a reference to a connection in the original UCMmap
 * 
 * @see seg.ucm2csm.implicit
 */

public class CSMDupConnection {

    private NodeConnection connection;

    private String target_id;

    private String source_id;

    private CSMDupNode source_node;

    private CSMDupNode target_node;

    // Constructors

    public CSMDupConnection(NodeConnection connection, CSMDupNodeList dupNodeList) {
        this.connection = connection;
        this.source_id = ((PathNode) connection.getSource()).getId();
        this.target_id = ((PathNode) connection.getTarget()).getId();
        this.source_node = dupNodeList.get(dupNodeList.getNodeIndex((PathNode) connection.getSource()));
        this.target_node = dupNodeList.get(dupNodeList.getNodeIndex((PathNode) connection.getTarget()));
    }

    public CSMDupConnection(String source, String target) {
        this.connection = null;
        this.source_id = source;
        this.target_id = target;
        this.source_node = null; // js
        this.target_node = null; // js
    }

    public CSMDupConnection(PathNode source, String target, CSMDupNodeList dupNodeList) {
        this.connection = null;
        this.source_id = source.getId();
        this.target_id = target;
        this.source_node = dupNodeList.get(dupNodeList.getNodeIndex(source));
        this.target_node = null; // js
    }

    public CSMDupConnection(PathNode source, CSMDupNode target, CSMDupNodeList dupNodeList) {
        this.connection = null;
        this.source_id = source.getId();
        this.target_id = target.getId();
        this.source_node = dupNodeList.get(dupNodeList.getNodeIndex(source));
        this.target_node = target;
    }

    public CSMDupConnection(CSMDupNode source, PathNode target, CSMDupNodeList dupNodeList) {
        this.connection = null;
        this.source_id = source.getId();
        this.target_id = target.getId();
        this.source_node = source;
        this.target_node = dupNodeList.get(dupNodeList.getNodeIndex(target));
    }

    public CSMDupConnection(String source, PathNode target, CSMDupNodeList dupNodeList) {
        this.connection = null;
        this.source_id = source;
        this.target_id = target.getId();
        this.source_node = null; // js
        this.target_node = dupNodeList.get(dupNodeList.getNodeIndex(target));
    }

    public CSMDupConnection(CSMDupNode source, CSMDupNode target) {
        this.connection = null;
        this.source_id = source.getId();
        this.target_id = target.getId();
        this.source_node = source;
        this.target_node = target;
    }

    // methods to acquire target/source elements of a connection
    public PathNode getTarget() {
        PathNode pn = null;
        if (this.connection != null) {
            pn = (PathNode) this.connection.getTarget();
        }
        return pn;
    }

    public CSMDupNode getCSMTarget() {
        return this.target_node;
    }

    public PathNode getSource() {
        PathNode pn = null;
        if (this.connection != null) {
            pn = (PathNode) this.connection.getSource();
        }
        return pn;
    }

    public CSMDupNode getCSMSource() {
        return this.source_node;
    }

    public String getTargetStr() {
        return this.target_id;
    }

    public String getSourceStr() {
        return this.source_id;
    }

    public void setTarget(CSMDupNode target) {
	this.target_node = target;
    }

    // checks validity of node connection
    public boolean isNodeConnection() {
        if (this.connection == null) {
            return false;
        }
        return true;
    }
}
