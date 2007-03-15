package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Stack;

import javax.rmi.CORBA.Stub;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import urncore.Component;

/**
 * <!-- begin-user-doc --> Inserts Resource Acquisition objects in duplicate map <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */

public class ResourceAcquisition extends ResourceUtil {

    // RA and Empty Point IDs
    static int ra_id = 1000; // limitation.  js
    static int seq_id = 2000; // limitation.  js
    PrintStream ps;

    // constructor
    public ResourceAcquisition(PrintStream ps) {
        this.ps = ps;
    }

    // adds all hyperedge parent components to stack
    public void findParentsRA(ComponentRef compRef, Stack edge_stack) {
        // The top of the stack is the outermost component
        ComponentRef parent_compRef = (ComponentRef) compRef.getParent();
        if (parent_compRef != null) {
            edge_stack.push(parent_compRef);
            findParentsRA(parent_compRef, edge_stack);
        }
    }
    
    /**
     * Compute Resources to be acquired
     * @param curr_edge
     * 		node associated with the resource acquisition
     * @param dup_map
     * @param dup_map_conn
     * @return
     * 		the number of newly created nodes
     */
    public int acquireResource(PathNode curr_edge, CSMDupNodeList dup_map, CSMDupConnectionList dup_map_conn) {
	// list that will store edges to be parsed (will contain pathnodes only)
	int nodes_inserted = 0; // total nodes inserted since last run
	// Compute resources to be acquired
	ArrayList usedResources = null; // requested resources + containing components
	ArrayList resToAcquire = new ArrayList(); // usedResources - resPreviouslyNeeded
	ArrayList resPreviouslyNeeded; // resources used by previous node
	CSMDupNode curr_edge_dupNode = dup_map.get(dup_map.getNodeIndex(curr_edge));
	CSMDupNode previousDupNode = null;
	// StartPoint acquires all containing components
	if (curr_edge_dupNode.getType() == CSMDupNode.START) {
	    usedResources = curr_edge_dupNode.getResourcesDownstream();
	    copyArray(usedResources, resToAcquire);
	    // ResponsibilityRef/Stub acquire what was not acquired previously
	} else if ( (curr_edge_dupNode.getType() == CSMDupNode.RESPREF) || (curr_edge_dupNode.getType() == CSMDupNode.STUB) ) {
	    usedResources = curr_edge_dupNode.getResourcesDownstream();
	    previousDupNode = dup_map_conn.getSourceForTarget(curr_edge);
	    resPreviouslyNeeded = previousDupNode.getResourcesDownstream();
	    copyArray(firstMinusSecond(usedResources, resPreviouslyNeeded), resToAcquire);
	}
	while (resToAcquire.size() != 0) {
	    nodes_inserted = addRA(resToAcquire, usedResources, curr_edge, dup_map, dup_map_conn, nodes_inserted);
	}
	return nodes_inserted;
    } // function

    // prints XML representation of Resource Acquire element
    public void acquireComp(Component comp, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" + " acquire=\"" + "c" + ((Component)comp).getId() + "\"";
        String ra_predecessor = " predecessor=\"" + "h" + predecessor + "\"";
        String ra_successor = " successor=\"" + "h" + successor + "\"";
        String end_ra = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            ra_predecessor = " predecessor=\"" + predecessor + "\"";
        }
        if (successor.startsWith("G")) {
            ra_successor = " successor=\"" + successor + "\"";
        }

        // printing attributes
        ps.print("            " + ra_attributes);
        ps.print(" " + ra_predecessor);
        ps.print(" " + ra_successor);
        ps.print(" " + end_ra);
        ps.println("");
    }

    public void acquireComp(String res, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" + " acquire=\"" + "c" + res + "\"";
        String ra_predecessor = " predecessor=\"" + "h" + predecessor + "\"";
        String ra_successor = " successor=\"" + "h" + successor + "\"";
        String end_ra = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            ra_predecessor = " predecessor=\"" + predecessor + "\"";
        }
        if (successor.startsWith("G")) {
            ra_successor = " successor=\"" + successor + "\"";
        }

        // printing attributes
        ps.print("            " + ra_attributes);
        ps.print(" " + ra_predecessor);
        ps.print(" " + ra_successor);
        ps.print(" " + end_ra);
        ps.println("");
    }

    // prints XML representation of Dummy EmptyPoint element
    public void acquireEmptyPoint(CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String target = list.getTargetForSource(node.getId());
        String source = list.getSourceForTarget(node.getId());

        // object attributes
        String epoint_attributes = "<Sequence id=\"" + node.getId() + "\"" + " ";
        String epoint_target = "target= \"h" + target + "\"" + " ";
        String epoint_source = "source= \"h" + source + "\"";
        String epoint_end = "/>";

        // special naming convention for RR/RA objects
        if (source.startsWith("G")) {
            epoint_source = " source=\"" + source + "\"";
        }
        if (target.startsWith("G")) {
            epoint_target = " target=\"" + target + "\"";
        }

        // output to file
        ps.print("            " + epoint_attributes);
        ps.print(" " + epoint_source);
        ps.print(" " + epoint_target);
        ps.print(" " + epoint_end);
        ps.println("");
        ps.flush();
    }

    // inserts RA and Empty Points where necessary in the duplicate map
    public int addRA(ArrayList resToAcquire, ArrayList usedResources, PathNode curr_edge, CSMDupNodeList map, CSMDupConnectionList conn_map, int ins_nodes) {
        // create resource acquire component and insert it in duplicate map
        CSMDupNode ra_node = new CSMDupNode(++ra_id);
        ra_node.setResourcesDownstream(usedResources); // to compute the release set
        ra_node.setResourcesUpstream(usedResources); // to compute the release set
        map.add(ra_node);
        ins_nodes++;
        // create new links
        CSMDupNode source = conn_map.getSourceForTarget(curr_edge);
        // add an empty point if immediatly preceded by RR/RA/RESPREF node

        if (source != null) {

	    if ((source.getType() == CSMDupNode.RR) || (source.getType() == CSMDupNode.RA) || (source.getType() == CSMDupNode.RESPREF) || (source.getType() == CSMDupNode.STUB)) {
		// create empty point and insert it in duplicate map
		CSMDupNode e2_node = new CSMDupNode(++seq_id);
		e2_node.setResourcesDownstream(usedResources); // to compute the release set
		e2_node.setResourcesUpstream(usedResources); // to compute the release set
		map.add(e2_node);
		ins_nodes++;
		conn_map.add(new CSMDupConnection(source, e2_node));
		conn_map.add(new CSMDupConnection(e2_node, ra_node));

	    } else {
		conn_map.add(new CSMDupConnection(source, ra_node));
	    }
	    conn_map.remove(source, map.get(map.getNodeIndex(curr_edge)));

//	    if ((curr_edge instanceof EmptyPoint)) { // leave it alone. NEEDS TESTING... js
//		conn_map.add(new CSMDupConnection(ra_node, curr_edge));
//	    } else {
		// create empty point and insert it in duplicate map
		CSMDupNode e_node = new CSMDupNode(++seq_id);
		e_node.setResourcesDownstream(usedResources); // to compute the release set
		e_node.setResourcesUpstream(usedResources); // to compute the release set
		map.add(e_node);
		ins_nodes++;
		conn_map.add(new CSMDupConnection(ra_node, e_node));
		conn_map.add(new CSMDupConnection(e_node, curr_edge));
//	    }
	} else { // curr_edge is StartPoint (special case)
	    // create empty point and insert it in duplicate map after RA
	    CSMDupNode e_node = new CSMDupNode(++seq_id);
	    e_node.setResourcesDownstream(usedResources); // to compute the release set
	    e_node.setResourcesUpstream(usedResources); // to compute the release set
	    map.add(e_node);
	    ins_nodes++;
	    CSMDupNode nextDupNode = conn_map.getTargetForSource(curr_edge);
	    conn_map.add(new CSMDupConnection(curr_edge, ra_node));
	    conn_map.add(new CSMDupConnection(ra_node, e_node));
	    conn_map.add(new CSMDupConnection(e_node,nextDupNode));
	    conn_map.remove(map.get(map.getNodeIndex(curr_edge)), nextDupNode);
	}

        if (resToAcquire.size() != 0) {
            Component comp = (Component) resToAcquire.get(0);
            resToAcquire.remove(0);
            ra_node.setCompToAcquire(comp); // for when source wants to get ready to compute release set
        }
        return ins_nodes;
    }


    // methods to manipulate RA and Dummy Sequence IDs
    public int getRaSeqId() {
        return seq_id;
    }

    public int getRaId() {
        return ra_id;
    }

    public void setRaSeqId(int id) {
        seq_id = id;
    }

    public void setRaId(int id) {
        ra_id = id;
    }
}
