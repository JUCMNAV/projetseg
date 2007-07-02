package implicit;

import java.io.PrintStream;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc --> Inserts Resource Release objects in duplicate map <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */
public class ResourceRelease {

    // RR and Empty Point IDs
    static int rr_id = 3000; // limitation. js

    static int seq_id = 4000; // limitation. js

    PrintStream ps;

    // constructor
    public ResourceRelease(PrintStream ps) {
        this.ps = ps;
    }

    // adds all hyperedge parent components to stack
    public void findParentsRR(ComponentRef compRef, Stack edge_stack) {
        // The top of the stack is the outermost component
        ComponentRef parent_compRef = (ComponentRef) compRef.getParent();
        if (parent_compRef != null) {
            findParentsRR(parent_compRef, edge_stack);
            edge_stack.push(parent_compRef);
        }
    }

    /**
     * Compute the resources to be released
     * 
     * @param curr_edge
     *            node associated with the resource release
     * @param dup_map
     * @param dup_map_conn
     * @return the number of newly created nodes
     */
    public int releaseResource(PathNode curr_edge, CSMDupNodeList dup_map, CSMDupConnectionList dup_map_conn) {
        // list that will store edges to be parsed (will contain pathnodes only)
        int nodes_inserted = 0; // total nodes inserted since last run
        // Compute resources to be released:
        CSMResourceSet usedResources = null; // requested resources +
        // containing components
        CSMResourceSet resToRelease = null; // usedResources - resNeededNext
        CSMDupNode curr_edge_dupNode = dup_map.get(dup_map.getNodeIndex(curr_edge));
        CSMDupNode nextDupNode = null;
        // EndPoint releases all containing components (minus those previously
        // released)
        if ((curr_edge_dupNode.getType() == CSMDupNode.RESPREF) || (curr_edge_dupNode.getType() == CSMDupNode.STUB)) {
            if (curr_edge_dupNode.getResourcesDownstream() != null) {
                usedResources = curr_edge_dupNode.getResourcesDownstream().toRelease();
            } else {
                usedResources = null;
            }
            nextDupNode = dup_map_conn.getTargetForSource(curr_edge);
            if ((nextDupNode != null) && (nextDupNode.getResourcesUpstream() != null)) {
                resToRelease = usedResources.minus(nextDupNode.getResourcesUpstream().toAcquire());
            } else {
                resToRelease = usedResources;
            }
        }
        while ((resToRelease != null) && (resToRelease.size() != 0)) {
            nodes_inserted = addRR(resToRelease, usedResources, dup_map, dup_map_conn, curr_edge, nodes_inserted);
        }
        return nodes_inserted;
    } // function

    // prints XML representation of Resource Release element
    public void releaseRes(CSMResource resource, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String resType = resource.getResourcePrefix();
        String rr_attributes = "<ResourceRelease id=\"" + node.getId() + "\" " + "release=\"" + resType + resource.getResource() + "\" " + "rUnits=\""
                + resource.getQty() + "\" ";

        String rr_predecessor = "predecessor=\"" + "h" + predecessor + "\" ";
        String rr_successor = "successor=\"" + "h" + successor + "\" ";
        String end_rr = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            rr_predecessor = "predecessor=\"" + predecessor + "\" ";
        }
        if (successor.startsWith("G")) {
            rr_successor = "successor=\"" + successor + "\" ";
        }

        // printing attributes
        ps.print("            " + rr_attributes);
        ps.print(rr_predecessor);
        ps.print(rr_successor);
        ps.print(end_rr);
        ps.println("");
    }

    public void releaseComp(String res, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String rr_attributes = "<ResourceRelease id=\"" + node.getId() + "\" " + "release=\"" + "r" + res + "\" ";

        String rr_predecessor = "predecessor=\"" + "h" + predecessor + "\" ";
        String rr_successor = "successor=\"" + "h" + successor + "\" ";
        String end_rr = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            rr_predecessor = "predecessor=\"" + predecessor + "\" ";
        }
        if (successor.startsWith("G")) {
            rr_successor = "successor=\"" + successor + "\" ";
        }

        // printing attributes
        ps.print("            " + rr_attributes);
        ps.print(rr_predecessor);
        ps.print(rr_successor);
        ps.print(end_rr);
        ps.println("");
    }

    // prints XML representation of Dummy EmptyPoint element
    public void acquireEmptyPoint(CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String target = list.getTargetForSource(node.getId());
        String source = list.getSourceForTarget(node.getId());

        // object attributes
        String epoint_attributes = "<Sequence id=\"" + node.getId() + "\" ";
        String epoint_target = "target=\"h" + target + "\" ";
        String epoint_source = "source=\"h" + source + "\" ";
        String epoint_end = "/>";

        // special naming convention for RR/RA objects
        if (source.startsWith("G")) {
            epoint_source = "source=\"" + source + "\" ";
        }
        if (target.startsWith("G")) {
            epoint_target = "target=\"" + target + "\" ";
        }

        // output to file
        ps.print("            " + epoint_attributes);
        ps.print(epoint_source);
        ps.print(epoint_target);
        ps.print(epoint_end);
        ps.println("");
        ps.flush();
    }

    // inserts RR and Empty Points where necessary in the duplicate map
    public int addRR(CSMResourceSet resToRelease, CSMResourceSet usedResources, CSMDupNodeList map, CSMDupConnectionList conn_map, PathNode curr_edge,
            int ins_nodes) {

        // create resource release component and insert it in duplicate map
        CSMDupNode rr_node = new CSMDupNode(++rr_id);
        rr_node.setResourcesDownstream(usedResources); // to compute
        // release/acquire sets
        rr_node.setResourcesUpstream(usedResources); // to compute
        // release/acquire sets
        map.add(rr_node);
        ins_nodes++;
        // create empty point and insert it in duplicate map
        // create new links
        CSMDupNode target = conn_map.getTargetForSource(curr_edge);
        if (target != null) { // not EndPoint
            CSMDupNode e_node = new CSMDupNode(++seq_id);
            e_node.setResourcesDownstream(usedResources); // to compute
            // release/acquire
            // sets
            e_node.setResourcesUpstream(usedResources); // to compute
            // release/acquire sets
            map.add(e_node);
            ins_nodes++;
            conn_map.add(new CSMDupConnection(curr_edge, e_node, map));
            conn_map.add(new CSMDupConnection(e_node, rr_node));
            // add an empty point if immediatly followed by RR/RA/RESPREF node
            if ((target.getType() == CSMDupNode.RR) || (target.getType() == CSMDupNode.RA) || (target.getType() == CSMDupNode.RESPREF)
                    || (target.getType() == CSMDupNode.STUB)) { // js
                // create empty point and insert it in duplicate map
                CSMDupNode e2_node = new CSMDupNode(++seq_id);
                e2_node.setResourcesDownstream(usedResources);
                e2_node.setResourcesUpstream(usedResources);
                map.add(e2_node);
                ins_nodes++;
                conn_map.add(new CSMDupConnection(rr_node, e2_node));
                conn_map.add(new CSMDupConnection(e2_node, target));
            } else {
                conn_map.add(new CSMDupConnection(rr_node, target));
            }

            conn_map.remove(curr_edge, target);
        } else { // EndPoint
            // for each connection source-EndPoint? js
            CSMDupNode source = conn_map.getSourceForTarget(curr_edge);
            if ((source.getType() == CSMDupNode.RR) || (source.getType() == CSMDupNode.RA) || (source.getType() == CSMDupNode.RESPREF)
                    || (source.getType() == CSMDupNode.STUB)) {
                CSMDupNode e_node = new CSMDupNode(++seq_id);
                e_node.setResourcesDownstream(usedResources); // to compute
                // release/acquire
                // sets
                e_node.setResourcesUpstream(usedResources); // to compute
                // release/acquire
                // sets
                map.add(e_node);
                ins_nodes++;
                conn_map.add(new CSMDupConnection(source, e_node));
                conn_map.add(new CSMDupConnection(e_node, rr_node));
            } else {
                conn_map.add(new CSMDupConnection(source, rr_node));
            }
            conn_map.add(new CSMDupConnection(rr_node, curr_edge, map));
            conn_map.remove(source, curr_edge);
        }

        if (resToRelease.size() != 0) { // this ought to be non-empty
            rr_node.setResourceToRelease(resToRelease.get(0)); // the resource
            // to be
            // released
            resToRelease.remove(0);
        }
        return ins_nodes;
    }

    // methods to manipulate RR and Dummy Sequence IDs
    public int getRrSeqId() {
        return seq_id;
    }

    public int getRrId() {
        return rr_id;
    }

    public void setRrSeqId(int id) {
        seq_id = id;
    }

    public void setRrId(int id) {
        rr_id = id;
    }
}
