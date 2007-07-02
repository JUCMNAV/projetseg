package implicit;

import ucm.map.ComponentRef;
import ucm.performance.ExternalOperation;
import ucm.performance.GeneralResource;
import ucm.performance.PassiveResource;
import ucm.performance.ProcessingResource;
import urncore.ComponentRegular;

/**
 * Provides supports for the management of (UCM elements converted to) CSM resources. A CSM resource may be deduced implicitly from some UCM components and
 * explictly from UCM demands and RA/RA instructions embeded in responsibility metadata.
 * 
 * @author jack
 */
public class CSMResource {

    private GeneralResource genRes; // components->() +
    // responsibility->demand->(external
    // operations)

    private ComponentRef compRef; // implicit resources

    private ResourceAttribs resAtr; // explicit RA/RR within resp. metadata

    private final int UNKNOWN = 0; // the types of resource being handled

    public final int GENRES = 1;

    public final int COMPREF = 2;

    public final int RESATR = 3;

    private int type = UNKNOWN;

    public int getType() {
        return this.type;
    }

    private String name;

    private String quantity;

    public CSMResource(GeneralResource genRes) {
        this.genRes = genRes;
        this.type = GENRES;
        this.name = genRes.getId();
        this.quantity = this.genRes.getMultiplicity();
    }

    public CSMResource(ComponentRef compRef) {
        this.compRef = compRef;
        this.type = COMPREF;
        this.name = ((ComponentRegular) compRef.getContDef()).getId();
        this.quantity = "" + this.compRef.getReplicationFactor(); // TODO: or "1" as suggested by Murray. JS
    }

    public CSMResource(ResourceAttribs resAtr) {
        this.resAtr = resAtr;
        this.type = RESATR;
        this.name = this.resAtr.getResId();
        this.quantity = "" + this.resAtr.getRUnits();
    }

    public boolean equivalent(CSMResource compRes) {
        return this.name == compRes.name; // TODO: should this be stronger? js
    }

    public String getResource() {
        return this.name;
    }

    public String getQty() {
        return this.quantity;
    }

    public boolean isAcquire() {
        return !((resAtr != null) && (resAtr.isRelease()));
    }

    public boolean isRelease() {
        return !((resAtr != null) && (resAtr.isAcquire()));
    }

    public String getResourcePrefix() {
        String resType = null;
        if (this.getType() == this.COMPREF) {
            resType = "c";
        } else if (this.getType() == this.GENRES) {
            if (this.genRes instanceof ExternalOperation) {
                resType = "e";
            } else if (this.genRes instanceof ProcessingResource) {
                resType = "r";
            } else if (this.genRes instanceof PassiveResource) {
                resType = "p";
            } else {
                resType = "u"; // unforeseen case...
            }
        } else if (this.getType() == this.RESATR) {
            // resType = "a";
            if (this.resAtr.getRes() instanceof ExternalOperation) {
                resType = "e";
            } else if (this.resAtr.getRes() instanceof ProcessingResource) {
                resType = "r";
            } else if (this.resAtr.getRes() instanceof PassiveResource) {
                resType = "p";
            } else {
                resType = "u"; // unforeseen case...
            }
        }
        return resType;
    }
}