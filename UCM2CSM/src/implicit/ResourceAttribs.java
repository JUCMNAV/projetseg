package implicit;

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

    private int usage = BOTH;

    public ResourceAttribs(GeneralResource genRes) {
        this.resource = genRes;
    }

    public ResourceAttribs(String name) {
        this.name = name;
    }

    public String getResId() {
        return (name != null) ? name : resource.getId();
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
        this.usage = ACQUIRE;
    }

    /**
     * 
     * @return TRUE if this resource deals with ACQUISITION
     */
    public boolean isAcquire() {
        return (this.usage == ACQUIRE) || (this.usage == BOTH);
    }

    public void setRelease() {
        this.usage = RELEASE;
    }

    /**
     * 
     * @return TRUE if this resource deals with RELEASE
     */
    public boolean isRelease() {
        return (this.usage == RELEASE) || (this.usage == BOTH);
    }
}