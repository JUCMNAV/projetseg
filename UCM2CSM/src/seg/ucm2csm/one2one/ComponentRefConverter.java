package seg.ucm2csm.one2one;

import java.io.PrintStream;
import java.util.Iterator;

import ucm.map.ComponentRef;
import ucm.performance.ProcessingResource;
import urncore.Component;
import urncore.ComponentKind;
import urncore.ComponentRegular;

/**
 * Creates the CSM representation(Component) of the Component-Ref object.
 * 
 * @see seg.ucm2csm.one2one
 */
public class ComponentRefConverter {

    // component references
    public ComponentRef compRef;

    private ComponentRef parentCompRef;

    private ComponentRef childrenCompRef;

    // component definitions
    private ComponentRegular compDef;

    private ComponentRegular parentCompDef;

    private ComponentRegular childrenCompDef;

    // other variables
    private String childrenIDs = new String();

    private String parentID = new String();

    private boolean activeProcess;

    private boolean activeProcStatusDefined;

    public String host = new String();

    // constructors
    public ComponentRefConverter(ComponentRef compRef) {
        this.compRef = compRef;
        this.compDef = (ComponentRegular) compRef.getContDef();

        // processing active_process
        this.activeProcess = false;

        // set is_active_process to true if component is Process or Agent, false
        // if Team or Object, undefined otherwise
        this.activeProcStatusDefined = false;
        if ((this.compDef.getKind() == ComponentKind.PROCESS_LITERAL) || (this.compDef.getKind() == ComponentKind.AGENT_LITERAL)) {
            this.activeProcess = true;
            this.activeProcStatusDefined = true;
        } else if ((this.compDef.getKind() == ComponentKind.TEAM_LITERAL) || (this.compDef.getKind() == ComponentKind.OBJECT_LITERAL)) {
            this.activeProcess = false;
            this.activeProcStatusDefined = true;
        }

        // initialize parentID only if a reference to the parentID component exists
        if (((ComponentRef) compRef.getParent()) != null) {
            this.parentCompRef = (ComponentRef) compRef.getParent();
            this.parentCompDef = (ComponentRegular) this.parentCompRef.getContDef();
            this.parentID += "c" + this.parentCompDef.getId();
        } else {
            this.parentID += " ";
        }

        // retrieve childrenIDs
        for (Iterator iter = compRef.getChildren().listIterator(); iter.hasNext();) {
            this.childrenCompRef = (ComponentRef) iter.next();
            this.childrenCompDef = (ComponentRegular) this.childrenCompRef.getContDef();
            this.childrenIDs += "c" + this.childrenCompDef.getId() + " ";
        }

    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps) {

        /*
         * Only convert Process, Agent, Team and Object components to CSM components. For all of those, activeProcStatusDefined is true.
         * 
         * NOT! What if some activeProcStatusDefined() component is contained (parentID) within a !activeProcStatusDefined()??? Answer: There is no ID/IDREF binding for IDREF
         * 'cNNN'.
         */
        // if (!activeProcStatusDefined) return;
        String comp_host = "";
        // resources do not exist yet. js
        if (this.compRef.getContDef() != null) {
            if (this.compRef.getContDef() instanceof ComponentRegular) {
                if (((ComponentRegular) this.compRef.getContDef()).getHost() != null) {
                    ProcessingResource procRes = ((ComponentRegular) this.compRef.getContDef()).getHost();
                    comp_host = "host=\"" + "r" + procRes.getId() + "\" ";
                }
            }
        }

        // object attributes --- host attribute to be implemanteds
        String id = ((Component) this.compRef.getContDef()).getId();
        String name = ((Component) this.compRef.getContDef()).getName();
        String comp_attributes = "<Component id=\"" + "c" + id + "\" " + "name=\"" + name + "\" " + comp_host + " ";
        String traceabilityLink = "traceabilityLink=\"" + this.compRef.getId() + "\" ";
        String close = "/>";

        String comp_attributes_sub = "sub=\"" + this.childrenIDs + "\" ";
        String comp_attributes_parent = "parentID=\"" + this.parentID + "\" ";
        String comp_attributes_active_process;
        if (this.activeProcStatusDefined) {
            comp_attributes_active_process = "isActiveProcess=\"" + this.activeProcess + "\" ";
        } else {
            comp_attributes_active_process = "";
        }

        ps.print("        " + comp_attributes + traceabilityLink);
        ps.print(" " + comp_attributes_active_process);

        if (this.parentID.compareTo(" ") != 0) {
            ps.print(comp_attributes_parent);
        }
        if (this.childrenIDs.compareTo("") != 0) {
            ps.print(comp_attributes_sub);
        }
        ps.println(" " + close);
        ps.flush();

    }
}
