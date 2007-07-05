package seg.ucm2csm.implicit;

import ucm.performance.GeneralResource;

/**
 * 
 * @author jack
 *
 */
public class ResourceAttribs {
    private GeneralResource resource;

    private String name = null;

    private String rUnits;

    private final int ACQUIRE = 1; // when defined via responsibility's
    // MetaData

    private final int RELEASE = -1; // when defined via responsibility's
    // MetaData

    private final int BOTH = 0; // default

    private int usage = this.BOTH;

    public ResourceAttribs(GeneralResource genRes) {
        this.resource = genRes;
    }

    public ResourceAttribs(String name) {
        this.name = name;
    }

    public String getResId() {
        return (this.name != null) ? this.name : this.resource.getId();
    }

    public void setRes(GeneralResource genRes) {
        this.resource = genRes;
    }

    public GeneralResource getRes() {
        return this.resource;
    }

    /**
     * 
     * @param qty
     * 		number of resources
     */
    public void setRUnits(String qty) {
        this.rUnits = qty;
    }

    public String getRUnits() {
        return this.rUnits;
    }

    public void setAcquire() {
        this.usage = this.ACQUIRE;
    }

    /**
     * 
     * @return TRUE if this resource deals with ACQUISITION
     */
    public boolean isAcquire() {
        return (this.usage == this.ACQUIRE) || (this.usage == this.BOTH);
    }

    public void setRelease() {
        this.usage = this.RELEASE;
    }

    /**
     * 
     * @return TRUE if this resource deals with RELEASE
     */
    public boolean isRelease() {
        return (this.usage == this.RELEASE) || (this.usage == this.BOTH);
    }
}