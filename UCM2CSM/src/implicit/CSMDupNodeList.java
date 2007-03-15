package implicit;

import java.util.ArrayList;
import java.util.Iterator;

import ucm.map.PathNode;
import ucm.map.UCMmap;

/**
 * <!-- begin-user-doc --> Creates a list of CSMDupNodes, that is meant to replicate the UCM map <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */
public class CSMDupNodeList {
    // will contain CSMDupNodes (which in turn may point to a PathNode or an RA node)
    ArrayList nodeList = new ArrayList(1000);

    // create list of PathNodes
    public void DuplicateHyperEdges(UCMmap map) {
        for (Iterator iter = map.getNodes().iterator(); iter.hasNext();) {
            nodeList.add(new CSMDupNode((PathNode) iter.next()));
        }
    }

    /* The following are methods used to access the CSMDupNodeList */

    // size of path list
    public int size() {
        return nodeList.size();
    }

    // get node
    public CSMDupNode get(int i) {
        return (CSMDupNode) nodeList.get(i);
    }

    // add node at the end of list
    public void add(CSMDupNode node) {
        nodeList.add(nodeList.size(), node);
    }

    // add node at a specific point in map
    public void add(int position, CSMDupNode node) {
        nodeList.add(position, node);
    }

    // checks if list is empty
    public boolean isEmpty() {
        return nodeList.isEmpty();
    }

    // return a PathNode from the Duplicate Graph
    public PathNode getListNode(int i) {
        return ((CSMDupNode) (nodeList.get(i))).getNode();
    }

    // for debug - prints ids of all elements in list
    public void printDupList() {
        System.out.println("----------Printing duplicate Node List-------");
        System.out.println("List size: " + nodeList.size());
        String typeName;
        for (int i = 0; i < nodeList.size(); i++) {
            int type = ((CSMDupNode) (nodeList.get(i))).getType();
            typeName = " (" + ((CSMDupNode) (nodeList.get(i))).getTypeString() + ")";
            if (type == CSMDupNode.RA || type == CSMDupNode.RR || type == CSMDupNode.CSMEMPTY) {
                String id = ((CSMDupNode) (nodeList.get(i))).getId();
                System.out.println("Index " + i + " id: " + id + typeName);
            } else {
                System.out.println("Node : " + ((CSMDupNode) (nodeList.get(i))).getNode());
                String node_id = ((CSMDupNode) (nodeList.get(i))).getId();
                System.out.println("Index " + i + " id: " + node_id + typeName);
            }
        }
    }

    // returns the position of the node in the list of dup nodes
    public int getNodeIndex(PathNode node) {
        for (int i = 0; i < nodeList.size(); i++) {
            if (((CSMDupNode) (nodeList.get(i))).getNode() == node)
                return i;
        }
        return -1; // not found
    }

    // removes a node from the node list
    public void remove(CSMDupNode node) {
        for (int i = 0; i < nodeList.size(); i++) {
            if (((CSMDupNode) (nodeList.get(i))).getNode() != null) {
                if (((CSMDupNode) (nodeList.get(i))).getNode().getId() == node.getId()) {
                    nodeList.remove(i);
                } // if
            } // if
        } // for
    } // method

    public void remove(PathNode node) {
        for (int i = 0; i < nodeList.size(); i++) {
            if (((CSMDupNode) (nodeList.get(i))).getNode() == node) {
                nodeList.remove(i);
            } // if
        } // for
    } // method

    /**
     * 
     * @param dupMapConnList
     */
    public void computeNodesResources(CSMDupConnectionList dupMapConnList) {
	boolean done = false;
	// propagate resources - forward and backward - from nodes START, RESPRES, STUB and END
	while (!done) {
	    done = true;
	    for (int i = 0; i < dupMapConnList.size(); i++) {
		CSMDupConnection conn = dupMapConnList.get(i);
		CSMDupNode source = conn.getCSMSource();
		int srcType = source.getType();
		CSMDupNode target = conn.getCSMTarget();
		int tgtType = target.getType();
		// propagate upward
		if ((srcType == CSMDupNode.START) || (srcType == CSMDupNode.RESPREF) || (srcType == CSMDupNode.STUB)) {
		    if ((tgtType != CSMDupNode.RESPREF) || (tgtType != CSMDupNode.STUB) || (tgtType != CSMDupNode.END)) {
			if (target.getResourcesDownstream() != source.getResourcesDownstream()) {
			    target.setResourcesDownstream(source.getResourcesDownstream());
			    done = false;
			} // if
		    } // if
		} // if
		// propagate downard
		if ((tgtType == CSMDupNode.RESPREF) || (tgtType == CSMDupNode.STUB) || (tgtType == CSMDupNode.END)) {
		    if ((srcType != CSMDupNode.START) || (srcType != CSMDupNode.RESPREF) || (srcType != CSMDupNode.STUB)) {
			if (source.getResourcesUpstream() != target.getResourcesUpstream()) {
			    source.setResourcesUpstream(target.getResourcesUpstream());
			    done = false;
			} // if
		    } // if
		} // if
	    } // for
	} // while
    } // method
}
