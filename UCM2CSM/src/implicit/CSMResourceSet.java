package implicit;

import java.util.Iterator;

import ucm.map.ComponentRef;
import ucm.map.PathNode;
import ucm.map.RespRef;
import ucm.performance.Demand;
import ucm.performance.GeneralResource;
import ucm.performance.PassiveResource;
import urn.URNspec;
import urncore.ComponentElement;
import urncore.ComponentKind;
import urncore.ComponentRegular;
import urncore.Metadata;
import urncore.Responsibility;

/**
 * Provides supports for the management of sets of CSM resources.
 * 
 * @author jack
 */
public class CSMResourceSet {
    private final int RESLIMIT = 200; // TODO: remove limitation *** MAXIMUM NUMBER OF RESOURCES ***

    private CSMResource[] resources = new CSMResource[RESLIMIT];

    private int resources_count = 0;

    public CSMResourceSet(PathNode pathnode) {
	if (pathnode instanceof RespRef) {
	    RespRef respref = (RespRef) pathnode;
	    // Add resources commanded by demands tied to respnsibilities (external opn)
	    if (respref.getRespDef().getDemands().size() != 0) {
		for (int i = 0; i < respref.getRespDef().getDemands().size(); i++) {
		    Responsibility resp = respref.getRespDef();
		    for (int j = 0; j < resp.getDemands().size(); j++) {
			Demand demand = (Demand) resp.getDemands().get(j);
			resources[resources_count++] = new CSMResource(demand.getResource());
		    }
		}
	    }
	    // Add resources commanded by MetaData tied to responsibilities
	    for (Iterator md = respref.getMetadata().iterator(); md.hasNext();) {
		Metadata mdElement = (Metadata) md.next();
		if (mdElement.getName().compareTo("RR") == 0) {
		    if (md.hasNext()) {
			Metadata mdValue = (Metadata) md.next();
			if (mdValue.getName().compareTo("Qty") == 0) {
			    URNspec urn = respref.getRespDef().getUrndefinition().getUrnspec();
			    for (Iterator genRes = urn.getUcmspec().getResources().iterator(); genRes.hasNext();) {
				GeneralResource genResElement = (GeneralResource) genRes.next();
				if (genResElement instanceof PassiveResource) {
				    if (genResElement.getName().compareTo(mdElement.getValue()) == 0) {
					ResourceAttribs resAttr = new ResourceAttribs(genResElement);
					resAttr.setRUnits(mdValue.getValue());
					resAttr.setRelease();
					resources[resources_count++] = new CSMResource(resAttr);
					// resources[resources_count++] = new CSMResource(genResElement);
				    }
				}
			    }
			}
		    }
		} else if (mdElement.getName().compareTo("RA") == 0) {
		    if (md.hasNext()) {
			Metadata mdValue = (Metadata) md.next();
			if (mdValue.getName().compareTo("Qty") == 0) {
			    URNspec urn = respref.getRespDef().getUrndefinition().getUrnspec();
			    for (Iterator genRes = urn.getUcmspec().getResources().iterator(); genRes.hasNext();) {
				GeneralResource genResElement = (GeneralResource) genRes.next();
				if (genResElement instanceof PassiveResource) {
				    if (genResElement.getName().compareTo(mdElement.getValue()) == 0) {
					ResourceAttribs resAttr = new ResourceAttribs(genResElement);
					resAttr.setRUnits(mdValue.getValue());
					resAttr.setAcquire();
					resources[resources_count++] = new CSMResource(resAttr);
					// resources[resources_count++] = new CSMResource(genResElement);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	// Add the resources bound to components, implicitly and explicitly
	ComponentRef compRef0 = (ComponentRef) pathnode.getContRef();
	getContainingComponentsAndResources(compRef0, resources);
    }

    public CSMResourceSet(CSMResource[] resArrayList, int size) {
	resources = resArrayList;
	resources_count = size;
    }

    public CSMResource get(int n) {
	return resources[n];
    }

    public void remove(int n) {
	if (n < resources_count) { // TODO: replace with assert? JS
	    for (int i = 0; i < resources_count; i++) {
		if (i > n) {
		    resources[i - 1] = resources[i];
		} else {
		    resources[i] = resources[i];
		}
	    }
	    resources_count--;
	}
    }

    /**
         * Returns the hierarchy of containing componentRef
         * 
         * @param compRef
         * @param resourcesIn
         */
    public void getContainingComponentsAndResources(ComponentRef compRef, CSMResource[] resourcesIn) {
	if (compRef != null) {
	    if (compRef.getContDef() instanceof ComponentRegular) {
		if (((ComponentRegular) compRef.getContDef()).getHost() != null) {
		    resourcesIn[resources_count++] = new CSMResource(((ComponentRegular) compRef.getContDef()).getHost());
		}
		// TODO: check that only ComponentRegular has a *kind* ?
		if (((ComponentRegular) compRef.getContDef()).getKind().equals(ComponentKind.TEAM_LITERAL)
			|| ((ComponentRegular) compRef.getContDef()).getKind().equals(ComponentKind.OBJECT_LITERAL)
			|| ((ComponentRegular) compRef.getContDef()).getKind().equals(ComponentKind.PROCESS_LITERAL)
			|| ((ComponentRegular) compRef.getContDef()).getKind().equals(ComponentKind.AGENT_LITERAL)) {
		    resourcesIn[resources_count++] = new CSMResource(compRef);
		}
	    } else if (compRef.getContDef() instanceof ComponentElement) {
		if (((ComponentElement) compRef.getContDef()).getResource() != null) {
		    resourcesIn[resources_count++] = new CSMResource(((ComponentElement) compRef.getContDef()).getResource());
		}
	    }
	    getContainingComponentsAndResources((ComponentRef) compRef.getParent(), resourcesIn);
	}
    }

    public int size() {
	return resources_count;
    }

    public void add(CSMResourceSet addedRes) {
	for (int i = 0; i < addedRes.resources_count; i++) {
	    if (!this.contains(addedRes.resources[i])) {
		this.resources[this.resources_count++] = addedRes.resources[i];
	    }
	}
    }

    public CSMResourceSet toAcquire() {
	CSMResource[] temp = new CSMResource[RESLIMIT];
	int count = 0;
	for (int i = 0; i < resources_count; i++) {
	    if (resources[i].isAcquire()) {
		temp[count++] = resources[i];
	    }
	}
	return new CSMResourceSet(temp, count);
    }

    public CSMResourceSet toRelease() {
	CSMResource[] temp = new CSMResource[RESLIMIT];
	int count = 0;
	for (int i = 0; i < resources_count; i++) {
	    if (resources[i].isRelease()) {
		temp[count++] = resources[i];
	    }
	}
	return new CSMResourceSet(temp, count);
    }

    /**
         * Returns elements of the object which are not in the second one
         * 
         * @param second
         * @return
         */
    public CSMResourceSet minus(CSMResourceSet second) {
	CSMResource[] curMinusSecond = new CSMResource[RESLIMIT];
	int count = 0;
	for (int i = this.resources_count; i > 0; i--) {
	    if ((second == null) || (!second.contains(this.resources[i - 1]))) {
		curMinusSecond[count++] = this.resources[i - 1];
	    }
	}
	return new CSMResourceSet(curMinusSecond, count);
    }

    private boolean contains(CSMResource res) {
	boolean found = false;
	for (int i = 0; (i < resources_count) && (!found); i++) {
	    if (resources[i].equivalent(res)) {
		found = true;
	    }
	}
	return found;
    }
}
