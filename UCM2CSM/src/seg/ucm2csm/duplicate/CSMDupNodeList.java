package seg.ucm2csm.duplicate;

import java.util.Iterator;
import java.util.Vector;

import ucm.map.PathNode;
import ucm.map.UCMmap;

/**
 * Creates a list of CSMDupNodes, that is meant to replicate the UCM map.
 * 
 * @see implicit
 */
public class CSMDupNodeList {
    // will contain CSMDupNodes (which in turn may point to a PathNode or an RA
    // node)
    private CSMDupNode[] nodeList = new CSMDupNode[1000]; // TODO: remove size
    // limitation.

    private int length = 0;

    // create list of PathNodes
    public void DuplicateHyperEdges(UCMmap map, Vector warnings) {
        for (Iterator iter = map.getNodes().iterator(); iter.hasNext();) {
            this.nodeList[this.length++] = new CSMDupNode((PathNode) iter.next(), warnings);
        }
    }

    /* The following are methods used to access the CSMDupNodeList */

    // size of path list
    public int size() {
        return this.length;
    }

    // get node
    public CSMDupNode get(int i) {
        return this.nodeList[i];
    }

    // add node at the end of list
    public void add(CSMDupNode node) {
        this.nodeList[this.length++] = node;
    }

    // add node at a specific point in map
    public void add(int position, CSMDupNode node) {
        this.nodeList[position] = node;
    }

    // checks if list is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // return a PathNode from the Duplicate Graph
    public PathNode getListNode(int i) {
        return this.nodeList[i].getNode();
    }

    // for debug - prints ids of all elements in list
    public void printDupList() {
        System.out.println("----------Printing duplicate Node List-------");
        System.out.println("List size: " + this.length);
        String typeName;
        for (int i = 0; i < this.length; i++) {
            int type = this.nodeList[i].getType();
            typeName = " (" + this.nodeList[i].getTypeString() + ")";
            if (type == CSMDupNode.RA || type == CSMDupNode.RR || type == CSMDupNode.CSMEMPTY) {
                String id = this.nodeList[i].getId();
                System.out.println("Index " + i + " id: " + id + typeName);
            } else {
                System.out.println("Node : " + this.nodeList[i].getNode());
                String node_id = this.nodeList[i].getId();
                System.out.println("Index " + i + " id: " + node_id + typeName);
            }
        }
    }

    // returns the position of the node in the list of dup nodes
    public int getNodeIndex(PathNode node) {
        for (int i = 0; i < this.length; i++) {
            if (this.nodeList[i].getNode() == node)
                return i;
        }
        return -1; // not found
    }

    // removes a node from the node list (and just one)
    public void remove(CSMDupNode node) {
        boolean found = false;
        for (int i = 0; i < this.length; i++) {
            if (this.nodeList[i].getNode() != null) {
                if (this.nodeList[i].getNode().getId() == node.getId()) {
                    found = true;
                    // this.nodeList.remove(i);
                } // if
                if (found && ((i + 1) < this.length)) {
                    this.nodeList[i] = this.nodeList[i + 1];
                }
            } // if
        } // for
        if (found) {
            this.length--;
        }
    } // method

    public void remove(PathNode node) {
        boolean found = false;
        for (int i = 0; i < this.length; i++) {
            if (this.nodeList[i].getNode() == node) {
                found = true;
                // this.nodeList.remove(i);
            } // if
            if (found && ((i + 1) < this.length)) {
                this.nodeList[i] = this.nodeList[i + 1];
            }
        } // for
        if (found) {
            this.length--;
        }
    } // method

    /**
     * 
     * @param dupMapConnList
     */
    public void computeNodesResources(CSMDupConnectionList dupMapConnList) {
        boolean done = false;
        // propagate resources - forward and backward - from nodes START,
        // RESPRES, STUB and END
        while (!done) {
            done = true;
            for (int i = 0; i < dupMapConnList.size(); i++) {
                CSMDupConnection conn = dupMapConnList.get(i);
                CSMDupNode source = conn.getCSMSource();
                int srcType = source.getType();
                CSMDupNode target = conn.getCSMTarget();
                int tgtType = target.getType();
                // propagate upward
                if ((tgtType != CSMDupNode.RESPREF) && (tgtType != CSMDupNode.STUB)) {
                    if ((source.getResourcesDownstream() != null) && (source.getResourcesDownstream().size() != 0)) {
                        if ((target.getNode().getPred().size() == 1) && (target.getNode().getSucc().size() == 1)) {
                            if (target.getResourcesDownstream() != source.getResourcesDownstream()) {
                                target.setResourcesDownstream(source.getResourcesDownstream());
                                done = false;
                            }
                        } else {
                            /*
                             * Unpredictable incoming multipath node: empty downstream resources (as if none were requested previously), actually forcing a
                             * "request all"
                             */
                            target.setResourcesDownstream(null);
                        }
                    } // if
                } // if
                // propagate downard
                if ((srcType != CSMDupNode.RESPREF) && (srcType != CSMDupNode.STUB)) {
                    if ((target.getResourcesUpstream() != null) && (target.getResourcesUpstream().size() != 0)) {
                        if ((source.getNode().getPred().size() == 1) && (source.getNode().getSucc().size() == 1)) {
                            if (source.getResourcesUpstream() != target.getResourcesUpstream()) {
                                source.setResourcesUpstream(target.getResourcesUpstream());
                                done = false;
                            }
                        } else {
                            /*
                             * Unpredictable outgoing multipath node: empty upstream resources (as if none were needed thereafter), actually forcing a "release
                             * all"
                             */
                            source.setResourcesUpstream(null);
                        }
                    } // if
                } // if
            } // for
        } // while
    } // method

    /**
     * Change the type of a CSMDupNode
     * 
     * @param oldNode
     *            the node to be changed
     * @param type
     *            the new type of the node
     */
    public void retype(CSMDupNode oldNode, int type) {
        int nodeIndex = getNodeIndex(oldNode.getNode());
        this.nodeList[nodeIndex].setType(type);
    }
}
