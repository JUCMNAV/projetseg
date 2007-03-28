package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.performance.GeneralResource;
import ucm.performance.PassiveResource;
import urn.URNspec;
import urncore.Metadata;

/**
 * <!-- begin-user-doc --> Inserts Resource Release objects in duplicate map <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */
public class ResourceRelease extends ResourceUtil {

    // RR and Empty Point IDs
    static int rr_id = 3000; // limitation.  js
    static int seq_id = 4000; // limitation.  js
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
     * @param curr_edge
     * 		node associated with the resource release
     * @param dup_map
     * @param dup_map_conn
     * @return
     * 		the number of newly created nodes
     */
    public int releaseResource(PathNode curr_edge, CSMDupNodeList dup_map, CSMDupConnectionList dup_map_conn) {
        // list that will store edges to be parsed (will contain pathnodes only)
        int nodes_inserted = 0; // total nodes inserted since last run
        // Compute resources to be released:
        ArrayList usedResources = null; // requested resources + containing components
        ArrayList resNeededNext; // resources used by upstream path
        ArrayList resToRelease = new ArrayList(); // usedResources - resNeededNext 
        CSMDupNode curr_edge_dupNode = dup_map.get(dup_map.getNodeIndex(curr_edge));
        CSMDupNode nextDupNode = null;
        // EndPoint releases all containing components
        if (curr_edge_dupNode.getType() == CSMDupNode.END) {
            usedResources = curr_edge_dupNode.getResourcesDownstream(); // restrict to those already acquired? js
            copyArray(usedResources, resToRelease);
        // ResponsibilityRef/Stub release what will no longer be required
        } else if ( (curr_edge_dupNode.getType() == CSMDupNode.RESPREF) || (curr_edge_dupNode.getType() == CSMDupNode.STUB) ) {
            usedResources = curr_edge_dupNode.getResourcesDownstream();
            nextDupNode = dup_map_conn.getTargetForSource(curr_edge);
            resNeededNext = nextDupNode.getResourcesUpstream();
            copyArray(firstMinusSecond(usedResources, resNeededNext),resToRelease);
        }
        while (resToRelease.size() != 0) {
            nodes_inserted = addRR(resToRelease, usedResources, dup_map, dup_map_conn, curr_edge, nodes_inserted);
        }
//      RA/RR via MetaData
	if (curr_edge_dupNode.getType() == CSMDupNode.RESPREF) {
	    ArrayList resAttrList = new ArrayList();
	    for (Iterator md = ((RespRef)curr_edge).getMetadata().iterator(); md.hasNext();) {
		Metadata mdElement = (Metadata) md.next();
		if (mdElement.getName().compareTo("RR") == 0) {
		    if (md.hasNext()) {
		    Metadata mdValue = (Metadata) md.next();
		    if (mdValue.getName().compareTo("Qty") == 0) {
			URNspec urn = ((RespRef) curr_edge).getRespDef().getUrndefinition().getUrnspec();
			for (Iterator genRes = urn.getUcmspec().getResources().iterator(); genRes.hasNext();) {
			    GeneralResource genResElement = (GeneralResource) genRes.next();
			    if (genResElement instanceof PassiveResource) {
				if (genResElement.getName().compareTo(mdElement.getValue()) == 0) {
				    PassiveResource pasRes = (PassiveResource) genResElement;
				    ResourceAttribs resAttr = new ResourceAttribs();
				    resAttr.setRes(pasRes);
				    resAttr.setRUnits(mdValue.getValue());
				    resAttrList.add(resAttr);
	                        }
	                    }
	                }		
		    }
		    }
		}
	    }
	    while (resAttrList.size() > 0) {
		nodes_inserted = addRR(resAttrList, null, dup_map, dup_map_conn, curr_edge, nodes_inserted);
	    }
	}
        return nodes_inserted;
    } // function

    // prints XML representation of Resource Release element
    public void releaseRes(ResourceAttribs resAttribs, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String rr_attributes = "<ResourceRelease id=\"" + node.getId() + "\"" + " release=\"" + "r" + (resAttribs.getRes()).getId() + "\""
        	+ " rUnits=\""+ resAttribs.getRUnits() + "\"";

        String rr_predecessor = " predecessor=\"" + "h" + predecessor + "\"";
        String rr_successor = " successor=\"" + "h" + successor + "\"";
        String end_rr = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            rr_predecessor = " predecessor=\"" + predecessor + "\"";
        }
        if (successor.startsWith("G")) {
            rr_successor = " successor=\"" + successor + "\"";
        }

        // printing attributes
        ps.print("            " + rr_attributes);
        ps.print(" " + rr_predecessor);
        ps.print(" " + rr_successor);
        ps.print(" " + end_rr);
        ps.println("");
    }

    public void releaseComp(String res, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String rr_attributes = "<ResourceRelease id=\"" + node.getId() + "\"" + " release=\"" + "r" + res + "\"";

        String rr_predecessor = " predecessor=\"" + "h" + predecessor + "\"";
        String rr_successor = " successor=\"" + "h" + successor + "\"";
        String end_rr = "/>";

        // special naming convention for RR/RA objects
        if (predecessor.startsWith("G")) {
            rr_predecessor = " predecessor=\"" + predecessor + "\"";
        }
        if (successor.startsWith("G")) {
            rr_successor = " successor=\"" + successor + "\"";
        }

        // printing attributes
        ps.print("            " + rr_attributes);
        ps.print(" " + rr_predecessor);
        ps.print(" " + rr_successor);
        ps.print(" " + end_rr);
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

    // inserts RR and Empty Points where necessary in the duplicate map
    public int addRR(ArrayList resToRelease, ArrayList usedResources, CSMDupNodeList map, CSMDupConnectionList conn_map, PathNode curr_edge, int ins_nodes) {

        // create resource release component and insert it in duplicate map
        CSMDupNode rr_node = new CSMDupNode(++rr_id);
        rr_node.setResourcesDownstream(usedResources); // to compute release/acquire sets
        rr_node.setResourcesUpstream(usedResources); // to compute release/acquire sets
        map.add(rr_node);
        ins_nodes++;
        // create empty point and insert it in duplicate map
        // create new links
        CSMDupNode target = conn_map.getTargetForSource(curr_edge);
        if (target != null) { // not EndPoint
            CSMDupNode e_node = new CSMDupNode(++seq_id);
            e_node.setResourcesDownstream(usedResources); // to compute release/acquire sets
            e_node.setResourcesUpstream(usedResources); // to compute release/acquire sets
            map.add(e_node);
            ins_nodes++;
            conn_map.add(new CSMDupConnection(curr_edge, e_node));
            conn_map.add(new CSMDupConnection(e_node, rr_node));
            // add an empty point if immediatly followed by RR/RA/RESPREF node
            if ((target.getType() == CSMDupNode.RR) || (target.getType() == CSMDupNode.RA) || (target.getType() == CSMDupNode.RESPREF)  || (target.getType() == CSMDupNode.STUB)) { //js
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
	    if ((source.getType() == CSMDupNode.RR) || (source.getType() == CSMDupNode.RA) || (source.getType() == CSMDupNode.RESPREF) || (source.getType() == CSMDupNode.STUB)) {
		CSMDupNode e_node = new CSMDupNode(++seq_id);
		e_node.setResourcesDownstream(usedResources); // to compute release/acquire sets
		e_node.setResourcesUpstream(usedResources); // to compute release/acquire sets
		map.add(e_node);
		ins_nodes++;
		conn_map.add(new CSMDupConnection(source, e_node));
		conn_map.add(new CSMDupConnection(e_node, rr_node));
	    } else {
		conn_map.add(new CSMDupConnection(source, rr_node));
	    }
	    conn_map.add(new CSMDupConnection(rr_node, curr_edge));
	    conn_map.remove(source, curr_edge);
        }
        
        
        // if (releaseList.size != 0){ take one out of list } js
        // but first, convert to component use
        if (resToRelease.size() != 0) {
            ResourceAttribs resAttribs = (ResourceAttribs) resToRelease.get(0);
            resToRelease.remove(0);
            rr_node.setResourceToRelease(resAttribs); // for when source wants to get ready to compute release set
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
