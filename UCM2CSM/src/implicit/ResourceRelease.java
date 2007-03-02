package implicit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;
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
    static int rr_id = 300;
    static int seq_id = 400;
    PrintStream ps;

    // constructor
    public ResourceRelease(PrintStream ps) {
        this.ps = ps;
    }

    // adds all hyperedge parent components to stack
    public void findParentsRR(ComponentRef component_ref, Stack edge_stack) {
        // The top of the stack is the outermost component
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null) {
            findParentsRR(parent_ref, edge_stack);
            edge_stack.push(parent_ref);
        }
    }

    // Resource Release algorithm
    public int releaseResource(PathNode curr_edge, CSMDupNodeList dup_map, CSMDupConnectionList dup_map_conn, Hashtable component_release) {
        // list that will store edges to be parsed (will contain pathnodes only)
        ArrayList next_edge_list = new ArrayList();

        int nodes_inserted = 0; // total nodes inserted since last run
        Stack curr_edge_stack = new Stack(); // will hold all the parent components of current edge
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();

        // current edge is inside component
        if (curr_edge_comp_ref != null) {
            String curr_edge_id = curr_edge.getId();
            dup_map_conn.getNextEdgeList(curr_edge_id, next_edge_list);

            // find the parent component of current edge
            findParentsRR(curr_edge_comp_ref, curr_edge_stack);
            curr_edge_stack.push(curr_edge_comp_ref);

            if (!next_edge_list.isEmpty()) {
                for (int j = next_edge_list.size() - 1; j < next_edge_list.size(); j++) {
                    // Next edge must be in a different component
                    PathNode next_edge = (PathNode) next_edge_list.get(j);
                    ComponentRef next_edge_comp_ref = (ComponentRef) next_edge.getContRef();
                    Stack outside_comp_stack = new Stack();

                    // next edge is an end-point
                    if (next_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b++) {
                            outside_comp_stack.push(curr_edge_stack.get(b));
                        } // for

                        outside_comp_stack = reverseStack(outside_comp_stack);

                        while (!outside_comp_stack.isEmpty()) {
                            nodes_inserted = addRR(outside_comp_stack, dup_map, dup_map_conn, curr_edge, nodes_inserted, component_release);
                        }// while
                    }// if

                    else if (next_edge_comp_ref != curr_edge_comp_ref) {
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack next_edge_stack = new Stack();
                        findParentsRR(next_edge_comp_ref, next_edge_stack);
                        next_edge_stack.push(next_edge_comp_ref);

                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack, next_edge_stack);

                        // Acquire the components of the parents
                        while (!outside_comp_stack.isEmpty()) {
                            nodes_inserted = addRR(outside_comp_stack, dup_map, dup_map_conn, curr_edge, nodes_inserted, component_release);
                        }
                    }// if
                }// for
            } // if
        } // if
        else {
            // Must be an end point, acquire the components
            while (!curr_edge_stack.isEmpty()) {
                nodes_inserted = addRR(null, dup_map, dup_map_conn, curr_edge, nodes_inserted, component_release);
            }
        } // else
        return nodes_inserted;
    } // function

    // prints XML representation of Resource Release element
    public void releaseComp(ComponentRef comp, CSMDupNode node, CSMDupConnectionList list) {

        // initializing attributes
        String successor = list.getTargetForSource(node.getId());
        String predecessor = list.getSourceForTarget(node.getId());

        // object attributes
        String rr_attributes = "<ResourceRelease id=\"" + node.getId() + "\"" + " release=\"" + "c" + comp.getId() + "\"";

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

    // calculates the difference between two stacks
    public Stack stackDifference(Stack stack_one, Stack stack_two) {
        Stack stack_three = new Stack();
        for (int i = 0; i < stack_one.size(); i++) {
            if (!stack_two.contains(stack_one.get(i))) {
                stack_three.push(stack_one.get(i));
            }
        }
        return reverseStack(stack_three);
    }

    // restructures the given stack so that the first element in is not the last element in
    public Stack reverseStack(Stack stack) {
        Stack reversed_stack = new Stack();
        for (int i = stack.size() - 1; i >= 0; i--) {
            reversed_stack.add(stack.get(i));
        }
        return reversed_stack;
    }

    // inserts RR and Empty Points where necessary in the duplicate map
    public int addRR(Stack comp_stack, CSMDupNodeList map, CSMDupConnectionList conn_map, PathNode curr_edge, int ins_nodes, Hashtable release) {

        // create resource acquire component and insert it in duplicate map
        CSMDupNode rr_node = new CSMDupNode(++rr_id);
        map.add(rr_node);
        ins_nodes++;
        // create empty point and insert it in duplicate map
        CSMDupNode e_node = new CSMDupNode(++seq_id);
        map.add(e_node);
        ins_nodes++;
        // create new links
        CSMDupNode target = conn_map.getTargetForSource(curr_edge);
        conn_map.add(new CSMDupConnection(curr_edge, e_node));
        conn_map.add(new CSMDupConnection(e_node, rr_node));
        // add an empty point if immediatly followed by RA node
        if (target.getType() == CSMDupNode.RA) {
            // create empty point and insert it in duplicate map
            CSMDupNode e2_node = new CSMDupNode(++seq_id);
            map.add(e2_node);
            ins_nodes++;
            conn_map.add(new CSMDupConnection(rr_node, e2_node));
            conn_map.add(new CSMDupConnection(e2_node, target));
        } else {
            conn_map.add(new CSMDupConnection(rr_node, target));	
        }
        
        conn_map.remove(curr_edge, target);
        if (!comp_stack.isEmpty()) {
            ComponentRef comp = (ComponentRef) comp_stack.pop();
            release.put(new String(rr_node.getId()), comp);
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
