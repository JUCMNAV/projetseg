/**
 * 
 */
package implicit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.performance.Demand;
import ucm.performance.ExternalOperation;
import ucm.performance.GeneralResource;
import ucm.performance.PassiveResource;
import ucm.performance.ProcessingResource;
import urncore.Component;
import urncore.ComponentElement;
import urncore.ComponentRegular;
import urncore.Responsibility;

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
    public ArrayList getResourcesUsage(PathNode pathnode) {
	ArrayList components = new ArrayList();
	if (pathnode instanceof RespRef) {
	    RespRef respref = (RespRef) pathnode;
	    if (respref.getRespDef().getDemands().size() != 0) {
		for (int i = 0; i < respref.getRespDef().getDemands().size(); i++) {
		    Responsibility resp = respref.getRespDef();
		    for (int j = 0; j < resp.getDemands().size(); j++) {
			Demand demand = (Demand) resp.getDemands().get(j);
			components = getDemandedResources(demand.getResource());
		    }
		}
	    }

	}
	getContainingComponents((ComponentRef) pathnode.getContRef(), components);
	return components;
    }


    /**
     * Returns an array of components related to a resource (null for external operations)
     * @param res
     * @return
     */
    public ArrayList getDemandedResources(GeneralResource res) {
	ArrayList components = new ArrayList();
        if (res instanceof ExternalOperation) {
            			// ****************************************************
            components = null;  // TODO:  define how to handle external operations.  JS
            			// ****************************************************
        } else if (res instanceof ProcessingResource) { // 0..* components (ComponentRegular)
            for (Iterator comp = ((ProcessingResource) res).getComponents().iterator(); comp.hasNext();) {
		components.add((Component) comp.next());
	    }
        } else if (res instanceof PassiveResource) { // 0..1 component (ComponentElement)
            components.add((Component)((PassiveResource) res).getComponent());
        }
        return components;
    }

    /**
     * Returns the hierarchy of containing componentRef
     * @param compRef
     * @param componentsIn
     */
    public void getContainingComponents(ComponentRef compRef, ArrayList componentsIn) {
	if (compRef != null) {
	    componentsIn.add(compRef.getContDef());
	    getContainingComponents((ComponentRef) compRef.getParent(), componentsIn);
	}
    }
 

    public void copyArray(ArrayList in, ArrayList out) {
	for (int i = 0; i < in.size(); i++) {
	    out.add(in.get(i));
	}
    }
    public String[] getResStringList(GeneralResource res) {
        String[] resource = null; // = new String()[];
        if (res instanceof ExternalOperation) {
            resource = new String[1];
            resource[0] = ((ExternalOperation) res).getDescription();
        } else if (res instanceof ProcessingResource) { // 0..* components (ComponentRegular)
            resource = new String[((ProcessingResource) res).getComponents().size()];
            int i = 0;
            for (Iterator comp = ((ProcessingResource) res).getComponents().iterator(); comp.hasNext();) {
		Component component = (Component) comp.next();
		resource[i] = component.getId();
		i++;
	    }
        } else if (res instanceof PassiveResource) { // 0..* component (ComponentElement)
            resource = new String[1];
            resource[0] = ((PassiveResource) res).getComponent().getId();
        }
        return resource;
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
                demands.add((GeneralResource) ((Demand) ((RespRef) node).getRespDef().getDemands().get(i)).getResource());
            }
        } else {
            demands = null;
        }
        return demands;
    }
    
    public Stack intersectStackDemands(Stack comprefs, ArrayList demands) {
        // returned stack = INTERSCTION of comprefs AND demands
        Stack toRemove = new Stack();
        for (int i = 0; i < demands.size(); i++) {
            GeneralResource res = (GeneralResource) demands.get(i);
            if (res instanceof ExternalOperation) {
                //
            } else if (res instanceof ProcessingResource) { // 0..* components (ComponentRegular)
                for (int j = 0; j < ((ProcessingResource) res).getComponents().size(); j++) {
                    ComponentRegular compreg = (ComponentRegular) ((ProcessingResource) res).getComponents().get(j);
                    if (compreg != null) {
                        for (Iterator elem = comprefs.iterator(); elem.hasNext();) {
                            ComponentRef element = (ComponentRef) elem.next();
                            if (((Component) ((ComponentRef) element).getContDef()).getId() == compreg.getId()) {
                                toRemove.push(compreg);
                            }
                        }
                    }
                }
            } else if (res instanceof PassiveResource) { // 0..* component (ComponentElement)
                ComponentElement compele = ((PassiveResource) res).getComponent();
                if (compele != null) {
                    for (Iterator elem = comprefs.iterator(); elem.hasNext();) {
                        ComponentRef element = (ComponentRef) elem.next();
                        if (((Component) ((ComponentRef) element).getContDef()).getId() == compele.getId()) {
                            toRemove.push(element);
                        }
                    }
                }
            }

        }
        return toRemove;
    }

    public boolean demandsRequiresComponents(ArrayList demandList) {
        boolean resReqComp = false;
        for (int i = 0; !resReqComp && i < demandList.size(); i++) {
            GeneralResource res = (GeneralResource) demandList.get(i);
            if (res instanceof ExternalOperation) {
                //
            } else if (res instanceof ProcessingResource) { // 0..* components (ComponentRegular)
                for (int j = 0; j < ((ProcessingResource) res).getComponents().size(); j++) {
                    if (((ComponentRegular) ((ProcessingResource) res).getComponents().get(j)) != null) {
                        resReqComp = true;
                        // curr_edge_demands.add((ComponentRegular) ((ProcessingResource) res).getComponents().get(j));
                    }
                }
            } else if (res instanceof PassiveResource) { // 0..* component (ComponentElement)
                if (((PassiveResource) res).getComponent() != null) {
                    resReqComp = true;
                    // curr_edge_demands.add(((PassiveResource) res).getComponent());
                }
            }
        }
        return resReqComp;
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
