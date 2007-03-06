package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.EmptyPoint;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc --> Inserts Resource Acquisition objects in duplicate map <!-- end-user-doc -->
 * 
 * @see implicit
 * @generated
 */

public class ResourceAcquisition {

    // RA and Empty Point IDs
    static int ra_id = 1000; // limitation.  js
    static int seq_id = 2000; // limitation.  js
    PrintStream ps;

    // constructor
    public ResourceAcquisition(PrintStream ps) {
        this.ps = ps;
    }

    // adds all hyperedge parent components to stack
    public void findParentsRA(ComponentRef component_ref, Stack edge_stack) {
        // The top of the stack is the outermost component
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null) {
            edge_stack.push(parent_ref);
            findParentsRA(parent_ref, edge_stack);
        }
    }
    
    // Resource Acquire algorithm
    public int acquireResource(PathNode curr_edge, CSMDupNodeList dup_map, CSMDupConnectionList dup_map_conn, Hashtable component_acquire) {

        // list that will store edges to be parsed (will contain pathnodes only)
        int nodes_inserted = 0; // total nodes inserted since last run
        Stack curr_edge_stack = new Stack(); // will hold all the parent components of current edge
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();

        // current edge is inside component
        if (curr_edge_comp_ref != null) {
            ArrayList prev_edge_list = new ArrayList(1000);
            String curr_edge_id = curr_edge.getId();
            dup_map_conn.getPrevEdgeList(curr_edge_id, prev_edge_list);

            // find the parent component of current edge
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);

            if (!prev_edge_list.isEmpty()) {
                // only look at the last two elements of the prev_edge_list
                for (int j = prev_edge_list.size() - 1; j < prev_edge_list.size(); j++) {
                    // Previous edge must be in a different component
                    PathNode prev_edge = (PathNode) prev_edge_list.get(j);
                    ComponentRef prev_edge_comp_ref = (ComponentRef) prev_edge.getContRef();
                    Stack outside_comp_stack = new Stack();
                    // prev edge is a start point
                    if (prev_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b++) {
                            outside_comp_stack.push(curr_edge_stack.get(b));
                        } // for

                        // for every component in the outside stack, add an RA and an Empty Point
                        while (!outside_comp_stack.isEmpty()) {
                            nodes_inserted = addRA(outside_comp_stack, curr_edge, dup_map, dup_map_conn, nodes_inserted, component_acquire, prev_edge);
                        }
                    } else if (prev_edge_comp_ref != curr_edge_comp_ref) {
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack prev_edge_stack = new Stack();
                        prev_edge_stack.push(prev_edge_comp_ref);
                        findParentsRA(prev_edge_comp_ref, prev_edge_stack);

                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack, prev_edge_stack);

                        // Acquire the components of the parents
                        while (!outside_comp_stack.isEmpty()) {
                            nodes_inserted = addRA(outside_comp_stack, curr_edge, dup_map, dup_map_conn, nodes_inserted, component_acquire, prev_edge);
                        }
                    }// if
                }// for
            } // if
        } // if
        else {
            // Must be a start point, acquire the components
            while (!curr_edge_stack.isEmpty()) {
                nodes_inserted = addRA(null, curr_edge, dup_map, dup_map_conn, nodes_inserted, component_acquire, null);
            }
        } // else
        return nodes_inserted;
    } // function

    // prints XML representation of Resource Acquire element
    public void acquireComp(ComponentRef comp, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" + " acquire=\"" + "c" + comp.getId() + "\"";
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

    // calculates the difference between two stacks
    public Stack stackDifference(Stack stack_one, Stack stack_two) {
        Stack stack_three = new Stack();
        for (int i = 0; i < stack_one.size(); i++) {
            if (!stack_two.contains(stack_one.get(i))) {
                stack_three.push(stack_one.get(i));
            }
        }
        return stack_three;
    }

    // inserts RA and Empty Points where necessary in the duplicate map
    public int addRA(Stack comp_stack, PathNode curr_edge, CSMDupNodeList map, CSMDupConnectionList conn_map, int ins_nodes, Hashtable aquire, PathNode prev_edge) {
        // create resource acquire component and insert it in duplicate map
        CSMDupNode ra_node = new CSMDupNode(++ra_id);
        map.add(ra_node);
        ins_nodes++;
        // create new links
	CSMDupNode source = conn_map.getSourceForTargetTowardNode(curr_edge.getId(), prev_edge);
        
        // add an empty point if immediatly followed by RR node
        
        if ((source.getType() == CSMDupNode.RR) || (source.getType() == CSMDupNode.RA) || (source.getType() == CSMDupNode.RESPREF)) { //js
            // create empty point and insert it in duplicate map
            CSMDupNode e2_node = new CSMDupNode(++seq_id);
            map.add(e2_node);
            ins_nodes++;
            conn_map.add(new CSMDupConnection(source, e2_node));
            conn_map.add(new CSMDupConnection(e2_node, ra_node));
        	
        } else {
            conn_map.add(new CSMDupConnection(source, ra_node));        	
        }

        if ((curr_edge instanceof EmptyPoint)) { // leave it alone.  NEEDS TESTING... js
            conn_map.add(new CSMDupConnection(ra_node, curr_edge));
        } else {
            // create empty point and insert it in duplicate map
            CSMDupNode e_node = new CSMDupNode(++seq_id);
            map.add(e_node);
            ins_nodes++;
            conn_map.add(new CSMDupConnection(ra_node, e_node));
            conn_map.add(new CSMDupConnection(e_node, curr_edge));            
        }
        
        conn_map.remove(source, curr_edge);
        if (!comp_stack.isEmpty()) {
            ComponentRef comp = (ComponentRef) comp_stack.pop();
            aquire.put(new String(ra_node.getId()), comp);
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
