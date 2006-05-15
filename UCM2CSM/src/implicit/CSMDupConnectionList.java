package implicit;

import java.util.ArrayList;
import java.util.Iterator;

import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.UCMmap;

/**
 * <!-- begin-user-doc --> A CSMDupConnectionList is a list of references to all the connections in the UCMap <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */

public class CSMDupConnectionList {
    // will contain CSMDupConnection
    ArrayList connList = new ArrayList(1000);

    // create list of NodeConnections
    public void DuplicateConnection(UCMmap map) {
        for (Iterator iter = map.getConnections().iterator(); iter.hasNext();) {
            connList.add(new CSMDupConnection((NodeConnection) iter.next()));
        }
    }

    /* The following are methods used to access the CSMDupNodeList */

    // size of connection list
    public int size() {
        return connList.size();
    }

    // get connection
    public CSMDupConnection get(int i) {
        return (CSMDupConnection) connList.get(i);
    }

    // add connection at the end of list
    public void add(CSMDupConnection conn) {
        connList.add(conn);
    }

    // remove connection
    public void remove(int i) {
        connList.remove(i);
    }

    public void remove(CSMDupConnection conn) {
        connList.remove(conn);
    }

    // scans connections list and remove connection having the given target and source
    public void remove(CSMDupNode source, PathNode target) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source.getId() && ((CSMDupConnection) connList.get(i)).getTargetStr() == target.getId()) {
                connList.remove(i);
            }
        }
    }

    public void remove(PathNode source, CSMDupNode target) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source.getId() && ((CSMDupConnection) connList.get(i)).getTargetStr() == target.getId()) {
                connList.remove(i);
            }
        }
    }

    public void remove(CSMDupNode source, CSMDupNode target) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source.getId() && ((CSMDupConnection) connList.get(i)).getTargetStr() == target.getId()) {
                connList.remove(i);
            }
        }
    }

    public void remove(PathNode source, PathNode target) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source.getId() && ((CSMDupConnection) connList.get(i)).getTargetStr() == target.getId()) {
                connList.remove(i);
            }
        }
    }

    // returns the source of a given target
    public CSMDupNode getSourceForTarget(PathNode target) {
        for (int i = 0; i < connList.size(); i++) {
            if ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMTarget() != null
                    && (PathNode) ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMTarget()).getNode() != null) {
                if ((PathNode) ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMTarget()).getNode() == target) {
                    CSMDupNode source = ((CSMDupConnection) connList.get(i)).getCSMSource();
                    // return new CSMDupNode (source);
                    return source;
                }
            }
        }
        return null;
    }

    public String getSourceForTarget(String target) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getTargetStr() == target) {
                return ((CSMDupConnection) connList.get(i)).getSourceStr();
            }
        }
        return null;
    }

    // returns the target of a given source
    public CSMDupNode getTargetForSource(PathNode source) {
        for (int i = 0; i < connList.size(); i++) {
            if ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMSource() != null
                    && (PathNode) ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMSource()).getNode() != null) {
                if ((PathNode) ((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMSource()).getNode() == source) {
                    CSMDupNode target = ((CSMDupConnection) connList.get(i)).getCSMTarget();
                    return target;
                }
            }
        }
        return null;
    }

    public String getTargetForSource(String source) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source) {
                return ((CSMDupConnection) connList.get(i)).getTargetStr();
            }
        }
        return null;
    }

    // checks if list is empty
    public boolean isEmpty() {
        return connList.isEmpty();
    }

    // recursively builds list of previous edges
    public void getPrevEdgeList(String target, ArrayList sources) {
        for (int i = 0; i < connList.size(); i++) {
            String target_str = ((CSMDupConnection) connList.get(i)).getTargetStr();
            if (target_str == target) {
                String source_str = ((CSMDupConnection) connList.get(i)).getSourceStr();
                getPrevEdgeList(source_str, sources); // recursive call
                if (((CSMDupConnection) connList.get(i)).getCSMSource().isPathNode()) {
                    sources.add(((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMSource()).getNode());
                } // if
            } // if
        } // for
    } // method

    // recursively builds list of next edges
    public void getNextEdgeList(String source, ArrayList targets) {
        for (int i = 0; i < connList.size(); i++) {
            String source_str = ((CSMDupConnection) connList.get(i)).getSourceStr();
            if (source_str == source) {
                String target_str = ((CSMDupConnection) connList.get(i)).getTargetStr();
                getNextEdgeList(target_str, targets); // recursive call
                if (((CSMDupConnection) connList.get(i)).getCSMTarget().isPathNode()) {
                    targets.add(((CSMDupNode) ((CSMDupConnection) connList.get(i)).getCSMTarget()).getNode());
                } // if
            } // if
        } // for
    } // method

    // reverses any given list
    public ArrayList reverseList(ArrayList list) {
        ArrayList reversed_list = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            reversed_list.add(i, list.get(j));
        }
        return reversed_list;
    }

    // given a source node, searches the list for the target nodes associated to that source
    public ArrayList getTargetFromList(String source) {
        ArrayList targets = new ArrayList(1000);
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) connList.get(i)).getSourceStr() == source) {
                targets.add(((CSMDupConnection) connList.get(i)).getTargetStr());
            }
        }
        return targets;
    }

    // returns the position of the node in the list of dup nodes
    public int getConnectionIndex(String source) {
        for (int i = 0; i < connList.size(); i++) {
            if (((CSMDupConnection) (connList.get(i))).getSourceStr() == source)
                ;
            return i;
        }
        return -1; // not found
    }

    // for debug - prints source/target of all elements in list
    public void printDupList() {
        System.out.println("----------Printing duplicate Connection List-------");
        System.out.println("List size: " + connList.size());
        for (int i = 0; i < connList.size(); i++) {
            System.out.println("Connection " + i + ": " + " Source: " + ((CSMDupConnection) connList.get(i)).getSourceStr() + " Target: "
                    + ((CSMDupConnection) connList.get(i)).getTargetStr());
        }
    }

    // checks to see if a connection exists for a given source
    public boolean existsConnectionForSource(CSMDupNode source) {
        for (int i = 0; i < connList.size(); i++) {
            String conn_source_id = (((CSMDupConnection) (connList.get(i)))).getSourceStr();
            if (conn_source_id.compareTo(source.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    // given a source method returns a connection
    public CSMDupConnection getConnectionForSource(CSMDupNode source) {
        for (int i = 0; i < connList.size(); i++) {
            String conn_source_id = (((CSMDupConnection) (connList.get(i)))).getSourceStr();
            if (conn_source_id.compareTo(source.getId()) == 0)
                return (CSMDupConnection) (connList.get(i));
        }
        return null;
    }
}
