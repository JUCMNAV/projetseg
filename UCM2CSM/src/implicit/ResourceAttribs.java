package implicit;

import ucm.performance.GeneralResource;

public class ResourceAttribs  {
    private GeneralResource resource;
    private int rUnits;

    public void setRes(GeneralResource genRes) {
	this.resource = genRes;
    }
    
    public GeneralResource getRes() {
	return this.resource;
    }
    
    public void setRUnits(int qty) {
	this.rUnits = qty;
    }

    public int getRUnits() {
	return this.rUnits;
    }

}