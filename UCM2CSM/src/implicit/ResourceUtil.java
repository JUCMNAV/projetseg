/**
 * 
 */
package implicit;

import java.util.ArrayList;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.performance.Demand;
import urncore.ComponentElement;
import urncore.ComponentRegular;

/**
 * @author jack
 *
 */
public class ResourceUtil {

    /**
     * Computes the hierarchy of containing componentRef in all cases;
     * also computes the list of requested resources for responsibilityRef.
     * @param respref
     * @return
     */
    public ArrayList getResourcesNeeded(PathNode pathnode) {
	ArrayList resources = new ArrayList();
	// Don't add resources tied to demands (external opn)
	// otherwise, add corresponding Component.
	/*
	if (pathnode instanceof RespRef) {
	    RespRef respref = (RespRef) pathnode;
	    if (respref.getRespDef().getDemands().size() != 0) {
		for (int i = 0; i < respref.getRespDef().getDemands().size(); i++) {
		    Responsibility resp = respref.getRespDef();
		    for (int j = 0; j < resp.getDemands().size(); j++) {
			Demand demand = (Demand) resp.getDemands().get(j);
			resources.add(demand.getResource());
		    }
		}
	    }
	}
	*/
	// add the resources bound to components
	getContainingComponentsWithResources((ComponentRef) pathnode.getContRef(), resources);
	return resources;
    }

    /**
     * Returns the hierarchy of containing componentRef
     * @param compRef
     * @param resourcesIn
     */
    public void getContainingComponentsWithResources(ComponentRef compRef, ArrayList resourcesIn) {
	ResourceAttribs resAttribs = new ResourceAttribs();
	if (compRef != null) {
	    resAttribs.setRUnits("" + compRef.getReplicationFactor());
	    if (compRef.getContDef() instanceof ComponentElement) {
		if (((ComponentElement)compRef.getContDef()).getResource() != null) {
		    resAttribs.setRes(((ComponentElement)compRef.getContDef()).getResource());
		    resourcesIn.add(resAttribs);
		}
	    }
	    if (compRef.getContDef() instanceof ComponentRegular) {
		if (((ComponentRegular)compRef.getContDef()).getHost() != null) {
		    resAttribs.setRes(((ComponentRegular)compRef.getContDef()).getHost());
		    resourcesIn.add(resAttribs);
		}
	    }
	    getContainingComponentsWithResources((ComponentRef) compRef.getParent(), resourcesIn);
	}
    }
 

    public void copyArray(ArrayList in, ArrayList out) {
	for (int i = 0; i < in.size(); i++) {
	    out.add(in.get(i));
	}
    }

    /**
     * Collect the list of requested resources
     *
     * @author jack
     * @param node
     */
    public ArrayList collectDemands(PathNode node) {
        ArrayList demands = new ArrayList();
        if (node instanceof RespRef) {
            for (int i = 0; i < ((RespRef) node).getRespDef().getDemands().size(); i++) {
                demands.add(((Demand) ((RespRef) node).getRespDef().getDemands().get(i)).getResource());
            }
        } else {
            demands = null;
        }
        return demands;
    }
    
    /**
     * Returns elements of the first array which are not in the second
     * @param first
     * @param second
     * @return
     */
    public ArrayList firstMinusSecond(ArrayList first, ArrayList second) {
        ArrayList curMinusPrev = new ArrayList();
        for (int i = first.size(); i > 0; i--) {
            if (!second.contains(first.get(i-1))) {
                curMinusPrev.add(first.get(i-1));
            }
        }
        return curMinusPrev;
    }

    // calculates the difference between two stacks
    public Stack reverseStackDifference(Stack stack_one, Stack stack_two) {
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

    // calculates the difference between ... js
    public Stack stackResDifference(Stack stack_one, ArrayList stack_two) {
        Stack stack_three = new Stack();
        for (int i = 0; i < stack_one.size(); i++) {
            if (!stack_two.contains(stack_one.get(i))) {
                stack_three.push(stack_one.get(i));
            }
        }
        return stack_three;
    }
    
}
