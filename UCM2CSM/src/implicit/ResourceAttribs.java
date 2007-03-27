package implicit;

import ucm.performance.GeneralResource;

public class ResourceAttribs  {
    private GeneralResource resource;
    private String rUnits;

    public void setRes(GeneralResource genRes) {
	this.resource = genRes;
    }
    
    public GeneralResource getRes() {
	return this.resource;
    }
    
    public void setRUnits(String qty) {
	this.rUnits = qty;
    }

    public String getRUnits() {
	return this.rUnits;
    }

}