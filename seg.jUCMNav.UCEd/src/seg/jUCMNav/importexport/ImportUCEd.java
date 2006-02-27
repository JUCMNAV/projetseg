package seg.jUCMNav.importexport;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import seg.jUCMNav.extensionpoints.IURNImport;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.commands.create.AddBranchCommand;
import seg.jUCMNav.model.commands.create.CreateMapCommand;
import seg.jUCMNav.model.commands.create.CreatePathCommand;
import seg.jUCMNav.model.commands.delete.DeleteBranchesCommand;
import seg.jUCMNav.model.commands.delete.DeleteComponentRefCommand;
import seg.jUCMNav.model.commands.delete.DeleteUselessStartNCEndCommand;
import seg.jUCMNav.model.commands.transformations.DividePathCommand;
import seg.jUCMNav.model.commands.transformations.MergeStartEndCommand;
import seg.jUCMNav.model.commands.transformations.SplitLinkCommand;
import seg.jUCMNav.model.commands.transformations.TrimEmptyNodeCommand;
import seg.jUCMNav.model.util.DoesDisconnectImplyDelete;
import seg.jUCMNav.model.util.ParentFinder;
import seg.jUCMNav.model.util.URNElementFinder;
import seg.jUCMNav.model.util.URNNamingHelper;
import uced.domain.AbstractEntityBlock;
import uced.domain.Aggregation;
import uced.domain.Concept;
import uced.domain.ConceptInstance;
import uced.domain.Domain;
import uced.domain.SystemConcept;
import uced.grammar.Entity;
import uced.grammar.NullCondition;
import uced.grammar.ObjectReference;
import uced.grammar.SimpleCondition;
import uced.parser.IncorrectElementException;
import uced.project.ProjectModel;
import uced.timing.AfterDelay;
import uced.timing.BeforeDelay;
import uced.ui.swt.SwtDialogFolder;
import uced.usecase.ExtendRelation;
import uced.usecase.ExtendUseCase;
import uced.usecase.UseCase;
import uced.usecase.description.AbstractProcedureBlock;
import uced.usecase.description.ActionStep;
import uced.usecase.description.AnyExtension;
import uced.usecase.description.ExtensionPoint;
import uced.usecase.description.IOperationInstance;
import uced.usecase.description.IncludeOperation;
import uced.usecase.description.NormalProcedure;
import uced.usecase.description.NormalUseCaseDescription;
import uced.usecase.description.OperationInstance;
import uced.usecase.description.Part;
import uced.usecase.description.ProcedureExtension;
import uced.usecase.description.Redirect;
import uced.util.Block;
import uced.util.Vector;
import ucm.map.ComponentRef;
import ucm.map.DirectionArrow;
import ucm.map.EmptyPoint;
import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.OrFork;
import ucm.map.OrJoin;
import ucm.map.PathNode;
import ucm.map.PluginBinding;
import ucm.map.RespRef;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.Timer;
import ucm.map.UCMmap;
import ucm.map.WaitingPlace;
import urn.URNspec;
import urncore.Component;
import urncore.ComponentKind;
import urncore.IURNContainerRef;
import urncore.IURNNode;
import urncore.Responsibility;


/**
 * Loads a UCEd project and converts it into an instance of URNspec.
 * 
 * @author jkealey
 * 
 */
public class ImportUCEd implements IURNImport {
    /** A command stack to run commands that we've already built. Doesn't need a UI */
    protected CommandStack cs;

    /** A map between objects in the projectmodel and objects in the URN specification */
    protected HashMap hmUseCaseObjectToUseCaseMapObject;

    /** UCEd's internal model */
    protected ProjectModel projectmodel = null;

    /** an instance of UCEd, that does the file loading */
    protected SwtDialogFolder UCEd = null;

    /** jUCMNav's internal model */
    protected URNspec urn;

    /**
     * Starting at root, recursively add all component definitions to the urn model. No references are added here.
     * 
     * @param root
     *            the root of the process. should be a vector of entities.
     * @param level
     *            the depth of recursion; used to give different colors to different subcomponents.
     * 
     * @throws InvocationTargetException
     */
    private void addAllComponentDefinitions(Vector root, int level) throws InvocationTargetException {

        for (Iterator iter = root.iterator(); iter.hasNext();) {
            Object obj = iter.next();

            // Filtering out entities that are not components.
            // uced.domain.OperationSet && uced.domain.PossibleValueSet
            if (!(obj instanceof Entity)) {
                // System.out.println(obj.getClass().toString());
                continue;
            }
            Entity entity = (Entity) obj;

            if (entity instanceof AbstractEntityBlock) {
                AbstractEntityBlock absblock = (AbstractEntityBlock) entity;
                String name = absblock.getFullName();

                // verify that we haven't created this component already (see comments in else clause)
                if (!URNNamingHelper.doesComponentNameExists(urn, name)) {
                    addComponent(absblock, name, level);

                    // recurse. see comments in next else clause
                    addAllComponentDefinitions(absblock.getAllChildren(), level + 1);
                } else {
                    // absblock.getAllChildren() returns the vector of all children.
                    // it is recursively built.
                    // we don't want to use this recursion, we want to do it ourselves, to track the level
                    // therefore, we will get duplicates here that we ignore.
                }
            } else {
                // I don't know if this every occurs.
                // NullEntity, SimpleEntity or ActiveEntity
                System.out.println("Not an AbstractEntityBlock: " + entity.getClass().toString()); //$NON-NLS-1$
            }
        }
    }

    /**
     * Adds a particular component. Assumes that name has already been verified as unique.
     * 
     * @param absblock
     *            the UCEd element corresponding to this component.
     * @param name
     *            the name to give the component in jUCMNav
     * @param level
     *            the recursion level, influences color.
     * @throws InvocationTargetException
     */
    private void addComponent(AbstractEntityBlock absblock, String name, int level) throws InvocationTargetException {
        // create a new component reference ; reusing ModelCreationFactory code to set the kind, but don't care about the actual reference
        ComponentRef cr = (ComponentRef) ModelCreationFactory.getNewObject(urn, ComponentRef.class, getComponentKind(absblock));

        // get its definition
        Component comp = (Component) cr.getContDef();

        // get rid of references
        comp.getContRefs().clear();

        // name it; will be unique.
        comp.setName(name);

        // give it a color according to its type and depth.
        colorComponent(level, comp);

        // add it to urn
        urn.getUrndef().getComponents().add(comp);

        // remember it.
        hmUseCaseObjectToUseCaseMapObject.put(absblock, comp);
    }

    /**
     * The given concept represents a component. We want to add a reference to this component in the given map. We want at most one reference to a component per
     * map.
     * 
     * Will recurse through parents and add them all if needed, creating the binding. Useless ones to be removed later.
     * 
     * @see ImportUCEd#cleanUselessComponentReferences()
     * 
     * @param absconcept
     *            the UCEd concept representing the component.
     * @param map
     *            the map to add a reference to, if needed
     * @param defToRef
     *            mapping between what definitions have been added in this map.
     * @return the component ref, whether we add it or not.
     * @throws InvocationTargetException
     */
    private ComponentRef addCompRefIfNeeded(AbstractEntityBlock absconcept, UCMmap map, HashMap defToRef) throws InvocationTargetException {
        ComponentRef cr;
        // slower O(n)
        // ComponentElement comp = URNElementFinder.findComponentElementByName(urn, name);
        // faster; O(1)
        Component comp = (Component) hmUseCaseObjectToUseCaseMapObject.get(absconcept);

        // does a reference to this component already exist in this map.
        if (defToRef.get(comp) != null) {
            // yes; get it.
            cr = (ComponentRef) defToRef.get(comp);
        } else {
            // no, make a new one.
            cr = (ComponentRef) ModelCreationFactory.getNewObject(urn, ComponentRef.class);
            // avoid overlapping components that cause circular bindings in autolayout.
            cr.setX(-1000);
            cr.setY(ModelCreationFactory.DEFAULT_UCM_COMPONENT_HEIGHT * map.getContRefs().size());
            cr.setContDef(comp);
            map.getContRefs().add(cr);

            // remember that we already have one for this component.
            defToRef.put(comp, cr);
        }

        assert cr.getContDef() != null : "unable to find component"; //$NON-NLS-1$

        // recurse on parent
        Block parent = absconcept.getParent();
        if (parent instanceof AbstractEntityBlock && !(parent instanceof Domain)
                && ((absconcept instanceof Aggregation) || (absconcept instanceof ConceptInstance))) {
            AbstractEntityBlock absconcept_parent = (AbstractEntityBlock) parent;
            ComponentRef parentcr = addCompRefIfNeeded(absconcept_parent, map, defToRef);
            // bind this component to its parent.
            cr.setParent(parentcr);
        }

        return cr;
    }

    /**
     * Not fully implemented. Does not create InBindings nor OutBindings.
     * 
     * Should traverse all maps and find stubs. Static stubs are assumed to have PluginBindings created but not InBindings nor OutBindings. The latter should be
     * created by this method.
     * 
     * @param endPoints
     *            mapping between a map and the end point representing the end of the main scenario.
     */
    private void addPluginBindings(HashMap endPoints) {
        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
            UCMmap map = (UCMmap) iter.next();
            // System.out.println(endPoints.get(map));
            for (Iterator iterator = map.getNodes().iterator(); iterator.hasNext();) {
                PathNode node = (PathNode) iterator.next();
                if (node instanceof Stub) {
                    Stub stub = (Stub) node;
                    if (!stub.isDynamic()) {
//                        PluginBinding pb = (PluginBinding) stub.getBindings().get(0);
//                        UCMmap plugin = pb.getPlugin();

                        // bind stub's in/outs with plugin's start/end
                        // might be more start/ends that in/outs.
                        // what to do? i'm supposing bind with main scenario.

                        // use start point with lowest id and end point given in the hash map.
                        // todo: create in/out bindings

                    } else {
                        // for all use cases
                        for (Iterator it2 = projectmodel.getUseCaseModel().getUseCases().iterator(); it2.hasNext();) {
                            UseCase uc = (UseCase) it2.next();
                            // find the extend use cases
                            if (uc instanceof ExtendUseCase) {
                                ExtendUseCase extendUseCase = (ExtendUseCase) uc;
                                // for all their relations (because one extension can implement extension points with the same name in multiple use cases)
                                for (Iterator it3 = extendUseCase.getExtendRelations().iterator(); it3.hasNext();) {
                                    ExtendRelation extendRelation = (ExtendRelation) it3.next();
                                    UCMmap target = (UCMmap) hmUseCaseObjectToUseCaseMapObject.get(extendRelation.getTarget());
                                    // if this relation is related to the map containg the stub
                                    if (map == target) {
                                        // look at the extension's parts.
                                        for (Iterator it4 = extendUseCase.getUseCaseElements().iterator(); it4.hasNext();) {
                                            Part part = (Part) it4.next();
                                            // if we find one (or many) with the same name as the current stub, create a binding
                                            if (part.getExtensionPointName().equals(stub.getName())) {
                                                // create a binding with the plugin
                                                PluginBinding binding = (PluginBinding) ModelCreationFactory.getNewObject(urn, PluginBinding.class);
                                                UCMmap plugin = (UCMmap) hmUseCaseObjectToUseCaseMapObject.get(extendUseCase);
                                                binding.setPlugin(plugin);
                                                stub.getBindings().add(binding);

                                                urncore.Condition cond = (urncore.Condition) ModelCreationFactory.getNewObject(urn, urncore.Condition.class);
                                                if (extendRelation.getExtendCondition() != null) {
                                                    cond.setLabel(extendRelation.getExtendCondition().toString());
                                                    cond.setExpression(extendRelation.getExtendCondition().toString());
                                                }
                                                binding.setPrecondition(cond);

                                                // todo: create in/out bindings.
                                                // plugin (should) contain start point named stub.getName() + " start"
                                                // plugin (should) contain end point named stub.getName() + " end"

                                            }

                                        }
                                    }

                                }
                            }

                        }
                    }
                }
            }
        }
    }

    /**
     * Go through the given steps and draw their alternatives. Assumption is that the main scenario has already been drawn.
     * 
     * @param map
     *            the map containing everything
     * @param steps
     *            the steps in a use case. the all alternatives are children of these steps.
     * @param defToRef
     *            mapping between component definitions and the references in this map.
     * @throws InvocationTargetException
     */
    private void buildAlternativePaths(UCMmap map, Vector steps, HashMap defToRef) throws InvocationTargetException {
        // for each step.
        for (Iterator iter = steps.iterator(); iter.hasNext();) {

            AbstractProcedureBlock block = (AbstractProcedureBlock) iter.next();
            if (block instanceof ActionStep) {
                ActionStep element = (ActionStep) block;

                if (element.getProcedure_() instanceof NormalProcedure) {
                    NormalProcedure procedure = (NormalProcedure) element.getProcedure_();
                    for (Iterator iterator = procedure.getAnyExtensions(); iterator.hasNext();) {
                        AnyExtension extensionPart = (AnyExtension) iterator.next();

                        if (defToRef.get(extensionPart) == null) {
                            // create a basic path
                            CreatePathCommand cpcmd = new CreatePathCommand(map, 50, 50);
                            cs.execute(cpcmd);

                            // get the first link.
                            NodeConnection link = (NodeConnection) cpcmd.getStart().getSucc().get(0);

                            handleCondition(link, extensionPart.getCondition(), true);
                            cpcmd.getStart().setPrecondition(link.getCondition());
                            link.setCondition(null);

                            defToRef.put(extensionPart, cpcmd.getStart());

                            convertStepSequence(map, extensionPart.getAllChildren(), link, defToRef);
                        }
                    }
                }

                // if this step has children, draw the paths.
                // first need to get the insertion point.
                NodeConnection link = null;
                if (element.getAllChildren().size() > 0) {
                    RespRef rr = (RespRef) hmUseCaseObjectToUseCaseMapObject.get(element);
                    link = (NodeConnection) rr.getSucc().get(0);
                }

                for (Iterator iterator = element.getChildren(); iterator.hasNext();) {
                    // not sure if this is too specific.
                    ProcedureExtension extension = (ProcedureExtension) iterator.next();

                    // cheap implementation because of high abstraction used on timers and conditions
                    // TODO: make better :)
                    if (extension.getBefdelay() != null || extension.getAftdelay() != null) {
                        if (link.getTarget() instanceof Timer) {
                            if (link.getTarget().getSucc().size() == 1) {
                                AddBranchCommand abc = new AddBranchCommand((PathNode) link.getTarget());
                                cs.execute(abc);
                            }
                            link = (NodeConnection) link.getTarget().getSucc().get(1);
                        }
                    }
                    uced.grammar.Condition cond = extension.getCondition();

                    OrFork branchingPoint;
                    NodeConnection newLink;

                    // is there already an or-fork preceeding the source; if yes, re-use it.
                    if (link.getSource() instanceof OrFork) {
                        branchingPoint = (OrFork) link.getSource();
                        AddBranchCommand abc = new AddBranchCommand(branchingPoint);
                        cs.execute(abc);

                        // newest branch
                        newLink = (NodeConnection) branchingPoint.getSucc().get(branchingPoint.getSucc().size() - 1);

                    } else {
                        branchingPoint = (OrFork) ModelCreationFactory.getNewObject(urn, OrFork.class);
                        DividePathCommand dpc = new DividePathCommand(branchingPoint, link, link.getSource().getX() + 25, link.getSource().getY() + 25);
                        cs.execute(dpc);
                        branchingPoint.setContRef(link.getSource().getContRef());
                        // first branch
                        link = (NodeConnection) branchingPoint.getSucc().get(0);
                        // second branch
                        newLink = (NodeConnection) branchingPoint.getSucc().get(1);
                    }

                    // build both conditions; we are extending the existing conditions, and defining a new one for newLink

                    // we don't know if the input conditions are supposed to be mutually exclusive.
                    // this would give more information to the different alternatives that was is given in the input.
                    // for (Iterator it = branchingPoint.getSucc().iterator(); it.hasNext();) {
                    // link = (NodeConnection) it.next();
                    // handleCondition(link, cond, link == newLink);
                    // }

                    handleCondition(link, cond, false);
                    handleCondition(newLink, cond, true);

                    // recurse, even if we know UCEd doesn't (currently) allow alternatives on alternatives.
                    convertStepSequence(map, extension.getAllChildren(), newLink, defToRef);
                }
            } else if (block instanceof ExtensionPoint || block instanceof Part || block instanceof Redirect) {
                // handled in main
                // System.out.println(block);
            } else {
                System.out.println("Unhandled AbstractProcedureBlock subclass: " + block.getClass()); //$NON-NLS-1$
            }

        }
    }

    /**
     * Defines the main path of the sequence of steps in the map.
     * 
     * @param map
     *            the map in which to add content
     * @param steps
     *            the sequence of use case steps from which to extract the main scenario
     * @param link
     *            the link from which to start inserting content
     * @param defToRef
     *            mapping between component definitions and references in this map.
     * @return the node connection where the next step would be added.
     * @throws InvocationTargetException
     */
    private NodeConnection buildMainPath(UCMmap map, Vector steps, NodeConnection link, HashMap defToRef) throws InvocationTargetException {
        // add general sequence
        for (Iterator iter = steps.iterator(); iter.hasNext();) {
            AbstractProcedureBlock block = (AbstractProcedureBlock) iter.next();

            if (block instanceof ActionStep) {
                ActionStep element = (ActionStep) block;
                // get the operation
                IOperationInstance opi = (IOperationInstance) element.getOperation();

                // regular step
                if (opi instanceof OperationInstance) {
                    OperationInstance op = (OperationInstance) opi;
                    // goto
                    if (op.getOperation() instanceof Redirect) {
                        Redirect redir = (Redirect) op.getOperation();
                        uced.grammar.Condition guard = op.getValidatedGuard();
                        link = handleRedirect(map, link, redir, guard, op.getBeforeDelay(), op.getAfterDelay());
                        continue;
                    }

                    // regular steps have components; add it.
                    ComponentRef cr = handleEntity(map, defToRef, op.getEntity());

                    // add the responsibility
                    link = handleRegularStep(map, link, element, op, cr);
                } else if (opi instanceof IncludeOperation) { // include
                    IncludeOperation inc = (IncludeOperation) opi;

                    // add the include stub.
                    link = handleInclude(map, link, inc);
                } else {
                    throw new InvocationTargetException(new Exception("Unknown IOperationInstance type.")); //$NON-NLS-1$
                }
            } else if (block instanceof ExtensionPoint) {
                link = handleExtensionPoint(map, link, (ExtensionPoint) block);
            } else if (block instanceof Redirect) {
                Redirect redir = (Redirect) block;
                // redir in alternative sometimes passed directly??? can't compute guard
                // uced.grammar.Condition guard = op.getValidatedGuard();
                // link = handleRedirect(map, link, redir, guard, op.getBeforeDelay(), op.getAfterDelay());
                link = handleRedirect(map, link, redir, null, null, null);

            } else
                System.out.println("Unhandled AbstractProcedureBlock subclass: " + block.getClass()); //$NON-NLS-1$
        }

        // the position of the next insertion; useful to help finding the main scenario's end point.
        return link;
    }

    /**
     * For each use case given, build a map.
     * 
     * @param usecases
     *            a vector of UseCase instances.
     * @return a mapping between each map and the end point representing the termination of its main scenario.
     * @throws InvocationTargetException
     */
    private HashMap buildMaps(Vector usecases) throws InvocationTargetException {
        UCMmap map;
        // map each use case to a newly created UCM
        for (Iterator iter = usecases.iterator(); iter.hasNext();) {
            UseCase uc = (UseCase) iter.next();
            CreateMapCommand cmp = new CreateMapCommand(urn);
            cs.execute(cmp);
            map = cmp.getMap();
            map.setName(uc.getName());
            hmUseCaseObjectToUseCaseMapObject.put(uc, map);
        }

        HashMap hm = new HashMap();
        // fill each map with its content
        // two passes, so that stubs can link directly.
        for (Iterator iter = usecases.iterator(); iter.hasNext();) {
            UseCase uc = (UseCase) iter.next();
            map = (UCMmap) hmUseCaseObjectToUseCaseMapObject.get(uc);

            EndPoint ep = fillMapContents(map, uc);
            hm.put(map, ep);
        }

        return hm;
    }

    /**
     * Will go through all maps to bind items such as forks, joins, timers, stubs, start points, end points to what makes the most sense, given the path.
     * 
     */
    private void cleanComponentRefBindings() {
        IURNContainerRef ref;

        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
            UCMmap map = (UCMmap) iter.next();
            for (Iterator iterator = map.getNodes().iterator(); iterator.hasNext();) {
                PathNode pn = (PathNode) iterator.next();
                if (pn instanceof StartPoint) {
                    ref = ((NodeConnection) pn.getSucc().get(0)).getTarget().getContRef();
                } else if (pn instanceof EndPoint) {
                    ref = ((NodeConnection) pn.getPred().get(0)).getSource().getContRef();
                } else if (pn instanceof EmptyPoint || pn instanceof WaitingPlace || pn instanceof OrFork || pn instanceof OrJoin || pn instanceof Stub) {
                    IURNContainerRef ref1 = ((NodeConnection) pn.getPred().get(0)).getSource().getContRef();
                    IURNContainerRef ref2 = ((NodeConnection) pn.getSucc().get(0)).getTarget().getContRef();
                    if (ref1 == ref2)
                        ref = ref1;
                    else {
                        ref = ParentFinder.getCommonParent(ref1, ref2);
                    }
                } else {
                    ref = pn.getContRef();
                }
                pn.setContRef(ref);

            }

        }

    }

    /**
     * Each component reference that does not contain any path nodes is removed from the map. It is assumed that component references are added when we need to
     * create a PathNode or ComponentRef that is one of their children. The goal is to remove clutter from the diagrams, especially when multiple levels of
     * components are used.
     * 
     */
    private void cleanUselessComponentReferences() {
        // for each component definition
        for (Iterator iter = urn.getUrndef().getComponents().iterator(); iter.hasNext();) {
            Component def = (Component) iter.next();
            Vector v = new Vector();
            // add all component references for which no pathnodes are bound to v
            for (Iterator iterator = def.getContRefs().iterator(); iterator.hasNext();) {
                ComponentRef ref = (ComponentRef) iterator.next();
                int count = 0;
                for (Iterator it2 = ref.getNodes().iterator(); it2.hasNext();) {
                    PathNode pn = (PathNode) it2.next();
                    if (pn instanceof EmptyPoint || pn instanceof DirectionArrow || pn instanceof OrFork || pn instanceof OrJoin) {
                        count++;
                    } else
                        break;
                }
                if (ref.getNodes().size() == count)
                    v.add(ref);

                RGB rgb = StringConverter.asRGB(ref.getContDef().getFillColor());
                ref.setWidth(rgb.red + rgb.green + rgb.blue);

            }
            // remove all of these references.
            for (Iterator iterator = v.iterator(); iterator.hasNext();) {
                ComponentRef ref = (ComponentRef) iterator.next();

                if (ref.getParent() != null) {
                    Vector children = new Vector();
                    children.addAll(ref.getChildren());
                    for (Iterator it2 = children.iterator(); it2.hasNext();) {
                        ComponentRef child = (ComponentRef) it2.next();
                        child.setParent(ref.getParent());
                    }
                }
                cs.execute(new DeleteComponentRefCommand(ref));
            }
        }
    }

    private void cleanUselessOrForkBranches() {
        for (Iterator iter = urn.getUrndef().getSpecDiagrams().iterator(); iter.hasNext();) {
            UCMmap map = (UCMmap) iter.next();
            Vector ncToRemove = new Vector();
            for (Iterator iterator = map.getNodes().iterator(); iterator.hasNext();) {
                PathNode pn = (PathNode) iterator.next();
                if (pn instanceof OrFork) {
                    OrFork fork = (OrFork) pn;

                    for (Iterator it2 = fork.getSucc().iterator(); it2.hasNext();) {
                        NodeConnection nc = (NodeConnection) it2.next();
                        // until we implement the logic expression library
                        Vector vFalse = new Vector();
                        vFalse.add("false"); //$NON-NLS-1$
                        vFalse.add("not true"); //$NON-NLS-1$
                        vFalse.add("(not true)"); //$NON-NLS-1$
                        if (vFalse.contains(nc.getCondition().getExpression().toLowerCase())) {
                            ncToRemove.add(nc);
                        }

                    }
                }

            }
            for (Iterator iterator = ncToRemove.iterator(); iterator.hasNext();) {
                NodeConnection nc = (NodeConnection) iterator.next();
                Vector v = new Vector();
                v.add(nc);
                DoesDisconnectImplyDelete verification = new DoesDisconnectImplyDelete((OrFork) nc.getSource(), new Vector(), v);
                DeleteBranchesCommand dbc = new DeleteBranchesCommand((OrFork) nc.getSource(), verification, null);
                cs.execute(dbc);
            }

            TrimEmptyNodeCommand tenc = new TrimEmptyNodeCommand(map);
            cs.execute(tenc);
            DeleteUselessStartNCEndCommand dusec = new DeleteUselessStartNCEndCommand(map, null);
            dusec.setNextGlobalID(0);
            cs.execute(dusec);

        }

    }

    /**
     * Colors a component according to its recursion level and kind.
     * 
     * @param level
     *            the recursion level
     * @param comp
     *            the component to color
     */
    private void colorComponent(int level, Component comp) {
        int x = Math.min(level * 20, 80);

        if (comp.getKind() == ComponentKind.ACTOR_LITERAL) {
            // actors are blue-ish
            comp.setFillColor(StringConverter.asString(new RGB(130 + x, 130 + x, 175 + x)));
        } else {
            // system is green-ish
            comp.setFillColor(StringConverter.asString(new RGB(130 + x, 175 + x, 130 + x)));
        }

        comp.setFilled(true);
    }

    /**
     * Convert a sequence of steps into UCM elements and return the main scenario's end point.
     * 
     * @param map
     *            the map to add the elements to
     * @param steps
     *            the steps that represent actions in this map.
     * @param link
     *            the link where the creation should start
     * @param defToRef
     *            mapping between component definitions and their references used in this map.
     * @return the EndPoint of the main scenario.
     * @throws InvocationTargetException
     */
    private EndPoint convertStepSequence(UCMmap map, Vector steps, NodeConnection link, HashMap defToRef) throws InvocationTargetException {

        EndPoint ep = null;

        // memorizing link because buildMainPath might change it
        NodeConnection endLink = buildMainPath(map, steps, link, defToRef);

        if (endLink != null && endLink.getTarget().getSucc().size() > 0) {
        	IURNNode  pn = (IURNNode) ((NodeConnection) endLink.getTarget().getSucc().get(0)).getTarget();
            if (pn instanceof EndPoint) {
                ep = (EndPoint) pn;
            }
        }

        buildAlternativePaths(map, steps, defToRef);

        return ep;
    }

    /**
     * Given a map, fill it using what is provided in the use case.
     * 
     * @param map
     *            the map to fill
     * @param uc
     *            the contents
     * @return the end point terminating the main scenario.
     * @throws InvocationTargetException
     */
    private EndPoint fillMapContents(UCMmap map, UseCase uc) throws InvocationTargetException {
        Vector steps = uc.getUseCaseElements();

        EndPoint end = null;

        Vector iterations = new Vector();
        if (uc instanceof ExtendUseCase)
            iterations.addAll(uc.getUseCaseElements());
        else
            iterations.add(steps);

        // intialize a hash map to define which component definitions have references in this map.
        HashMap defToRef = new HashMap();

        for (Iterator iter = iterations.iterator(); iter.hasNext();) {
            Object obj = (Object) iter.next();
            if (obj instanceof Part)
                steps = (Vector) ((Part) obj).getPartElements();
            else
                steps = (Vector) obj;

            // create a basic path
            CreatePathCommand cpcmd = new CreatePathCommand(map, 50, 50);
            cs.execute(cpcmd);

            // get the first link.
            NodeConnection link = (NodeConnection) cpcmd.getStart().getSucc().get(0);

            StartPoint start = cpcmd.getStart();

            if (start != null && start.getDiagram() != null) {
                if (uc.getDescription() instanceof NormalUseCaseDescription) {
                    NormalUseCaseDescription desc = (NormalUseCaseDescription) uc.getDescription();
                    uced.grammar.Condition pre = desc.getPrecondition();
                    if (pre != null && !(pre instanceof NullCondition)) {
                        handleCondition(link, pre, true);
                        start.setPrecondition(link.getCondition());
                        link.setCondition(null);
                    }
                } else {

                    start.setName(((Part) obj).getExtensionPointName() + Messages.getString("ImportUCEd.start")); //$NON-NLS-1$
                    // no pre-post in ExtendUseCaseDescription; inherit from parent
                    // System.out.println(uc.getDescription());
                }
            }
            // convert all the steps, modifying the path starting at link.
            end = convertStepSequence(map, steps, link, defToRef);

            if (end != null && end.getDiagram() != null) {
                if (uc.getDescription() instanceof NormalUseCaseDescription) {
                    urncore.Condition tmp = link.getCondition();
                    NormalUseCaseDescription desc = (NormalUseCaseDescription) uc.getDescription();
                    uced.grammar.Condition post = desc.getPostcondition();
                    if (post != null && !(post instanceof NullCondition)) {
                        handleCondition(link, post, true);
                        end.setPostcondition(link.getCondition());
                        link.setCondition(tmp);
                    }
                } else {
                    end.setName(((Part) obj).getExtensionPointName() + Messages.getString("ImportUCEd.end")); //$NON-NLS-1$
                    // no pre-post in ExtendUseCaseDescription; inherit from parent
                    // System.out.println(uc.getDescription());
                }
            }
        }

        return end;
    }

    /**
     * Determines if a certain UCEd domain element is an actor or a team.
     * 
     * @param absblock
     *            the UCEd domain elmeent.
     * @return either ComponentKind.ACTOR or ComponentKind.TEAM
     * @throws InvocationTargetException
     */
    private int getComponentKind(Block absblock) throws InvocationTargetException {
        // if the parent is the top level container.
        if (absblock.getParent() instanceof Domain) {
            // concepts are actors, SystemConcepts are teams.
            if (absblock instanceof Concept)
                return ComponentKind.ACTOR;
            else if (absblock instanceof SystemConcept)
                return ComponentKind.TEAM;
            else
                throw new InvocationTargetException(new Exception("Unknown AbstractEntityBlock : " + absblock.getClass().toString())); //$NON-NLS-1$
        } else if (absblock.getParent() == null) // make sure a parent exists
            throw new InvocationTargetException(new Exception("No parent!")); //$NON-NLS-1$
        else
            // recurse; UCEd only has SystemConcepts at the topmost level.
            return getComponentKind(absblock.getParent());
    }

    /**
     * 
     * @return a URNspec without any diagrams.
     */
    private URNspec getEmptyURNspec() {
        URNspec urn;
        urn = (URNspec) ModelCreationFactory.getNewURNspec();
        hmUseCaseObjectToUseCaseMapObject.put(projectmodel, urn);

        // get rid of automatically created diagrams
        // assuming that this is not necessary: empty maps only by default
        // UCMmap map = (UCMmap) urn.getUrndef().getSpecDiagrams().get(0);
        // cs.execute(new DeleteMapCommand(map));
        urn.getUrndef().getSpecDiagrams().clear();

        return urn;
    }

    private OrFork handleAlternative(NodeConnection link) {
        OrFork branchingPoint = (OrFork) ModelCreationFactory.getNewObject(urn, OrFork.class);
        DividePathCommand dpc = new DividePathCommand(branchingPoint, link, link.getSource().getX() + 25, link.getSource().getY() + 25);
        cs.execute(dpc);
        branchingPoint.setContRef(link.getSource().getContRef());
        return branchingPoint;
    }

    /**
     * Given a node connection, add a urn condition from the uced condition.
     * 
     * @param link
     *            the connection on which to add a condition
     * @param cond
     *            the uced condition
     * @param overwrite
     *            if true, apply the condition directly. otherwise, we're adding the negation of the passed condition to the existing condition's conjuncts.
     */
    private void handleCondition(NodeConnection link, uced.grammar.Condition cond, boolean overwrite) {
        // new urn condition
        urncore.Condition urncond = (urncore.Condition) ModelCreationFactory.getNewObject(urn, urncore.Condition.class);

        if (cond == null)
            cond = new SimpleCondition("true"); //$NON-NLS-1$

        // add negation of cond to existing condition's conjuncts
        if (!overwrite) {

            String prefix_lbl = "", prefix_expr = ""; //$NON-NLS-1$ //$NON-NLS-2$

            // if true, don't need to add AND
            if (link.getCondition() != null && !link.getCondition().getExpression().equalsIgnoreCase("true")) { //$NON-NLS-1$
                prefix_expr = link.getCondition().getExpression() + " AND "; //$NON-NLS-1$
            }

            // if empty, don't need to add AND
            if (link.getCondition() != null && link.getCondition().getLabel().length() > 0) {
                prefix_lbl = link.getCondition().getLabel() + " AND "; //$NON-NLS-1$
            }

            // add negation
            urncond.setLabel(prefix_lbl + "(NOT " + cond.toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
            urncond.setExpression(prefix_expr + "(NOT " + cond.toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$

        } else {
            // set directly.
            urncond.setLabel("(" + cond.toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
            urncond.setExpression("(" + cond.toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        // don't forget to save
        link.setCondition(urncond);
    }

    private NodeConnection handleDelay(UCMmap map, NodeConnection link, uced.grammar.Condition beforeDelay, uced.grammar.Condition afterDelay) {
        String wait = ""; //$NON-NLS-1$
        if (afterDelay instanceof AfterDelay) {
            AfterDelay delay = (AfterDelay) afterDelay;
            if (delay.getDurationSec() > 0) {
                wait = Messages.getString("ImportUCEd.ATLEAST") + delay.getValue().toString(); //$NON-NLS-1$
            }
        }

        if (beforeDelay instanceof BeforeDelay) {
            BeforeDelay delay = (BeforeDelay) beforeDelay;
            if (delay.getDurationSec() > 0) {
                if (wait.length() == 0)
                    wait = Messages.getString("ImportUCEd.ATMOST") + delay.getValue().toString(); //$NON-NLS-1$
                else
                    wait += Messages.getString("ImportUCEd.ANDATMOST") + delay.getValue().toString(); //$NON-NLS-1$
            }
        }

        if (wait.length() > 0) {
            wait = Messages.getString("ImportUCEd.WAIT") + wait; //$NON-NLS-1$
            Timer timer = (Timer) ModelCreationFactory.getNewObject(urn, Timer.class);
            timer.setName(wait);
            SplitLinkCommand slc = new SplitLinkCommand(map, timer, link, 40, 40);
            cs.execute(slc);
            timer.setContRef(link.getSource().getContRef());
            link = (NodeConnection) timer.getSucc().get(0);
        }
        return link;
    }

    /**
     * Given an entity, add the relevant component references to the current map. Will add all parents.
     * 
     * @param map
     *            the current map.
     * @param defToRef
     *            mapping between component definitions and their references in this map.
     * @param entity
     *            the uced entity reprensenting a component.
     * @return a component reference that represents this entity.
     * @throws InvocationTargetException
     */
    private ComponentRef handleEntity(UCMmap map, HashMap defToRef, Entity entity) throws InvocationTargetException {
        ComponentRef cr;
        Entity original = entity;

        // if this is a reference,
        // I have seen this with Concept Instances;
        if (entity instanceof ObjectReference) {
            // good
            entity = ((ObjectReference) entity).getConceptInstance();

            // bad
            // entity = ((ObjectReference) entity).getCurrentEntity();
        }

        if (entity instanceof AbstractEntityBlock) {
            AbstractEntityBlock absconcept = (AbstractEntityBlock) entity;

            cr = addCompRefIfNeeded(absconcept, map, defToRef);

            // want distinct instances.
            if (original instanceof ObjectReference)
                cr.setParent(null);
        } else {
            throw new InvocationTargetException(new Exception("Unknown entity type. (This may be legal, but not sure; update code)")); //$NON-NLS-1$
            // cr = null;
        }
        return cr;
    }

    /**
     * Converts an extension point operation into a dynamic stub.
     * 
     * @param map
     *            the map in which to add the include
     * @param link
     *            the link on which to add the include
     * @param inc
     *            the actual include operation itself.
     * @return the node connection after the stub
     * @see #addPluginBindings(HashMap)
     * @throws InvocationTargetException
     */
    private NodeConnection handleExtensionPoint(UCMmap map, NodeConnection link, ExtensionPoint extension) throws InvocationTargetException {
        // use the same name as the plugin for the stub.
        String name = extension.getValue();

        Stub dynamicStub = (Stub) ModelCreationFactory.getNewObject(urn, Stub.class, 1);
        dynamicStub.setName(name);

        // insert it
        SplitLinkCommand slcmd = new SplitLinkCommand(map, dynamicStub, link, 50, 50);
        cs.execute(slcmd);

        // bind to previous parent for lack of a better choice.
        dynamicStub.setContRef(link.getSource().getContRef());

        // remember that this include is represented by this stub.
        hmUseCaseObjectToUseCaseMapObject.put(extension, dynamicStub);

        // get the next link.
        link = (NodeConnection) slcmd.getNode().getSucc().get(0);

        return link;
    }

    /**
     * Converts an include operation into a stub.
     * 
     * @param map
     *            the map in which to add the include
     * @param link
     *            the link on which to add the include
     * @param inc
     *            the actual include operation itself.
     * @return the node connection after the stub
     * @see #addPluginBindings(HashMap)
     * @throws InvocationTargetException
     */
    private NodeConnection handleInclude(UCMmap map, NodeConnection link, IncludeOperation inc) throws InvocationTargetException {
        // use the same name as the plugin for the stub.
        String pluginName = inc.getUseCase().getName();
        Stub staticStub = (Stub) ModelCreationFactory.getNewObject(urn, Stub.class);
        staticStub.setName(pluginName);
        UCMmap plugin = (UCMmap) URNElementFinder.findMapByName(urn, pluginName);
        if (plugin == null)
            throw new InvocationTargetException(new Exception("unable to find plugin")); //$NON-NLS-1$

        // create a binding with the plugin
        PluginBinding binding = (PluginBinding) ModelCreationFactory.getNewObject(urn, PluginBinding.class);
        binding.setPlugin(plugin);
        staticStub.getBindings().add(binding);

        urncore.Condition cond = (urncore.Condition) ModelCreationFactory.getNewObject(urn, urncore.Condition.class);
        if (inc.getCondition() != null) {
            cond.setLabel(inc.getCondition().toString());
            cond.setExpression(inc.getCondition().toString());
        }
        binding.setPrecondition(cond);
        // are not creating InBinding/OutBinding here. Must wait for after everything is built. See addPluginBindings(HashMap)
        // insert it
        SplitLinkCommand slcmd = new SplitLinkCommand(map, staticStub, link, 50, 50);
        cs.execute(slcmd);

        // bind to previous parent for lack of a better choice.
        staticStub.setContRef(link.getSource().getContRef());

        // remember that this include is represented by this stub.
        hmUseCaseObjectToUseCaseMapObject.put(inc, staticStub);

        // get the next link.
        link = (NodeConnection) slcmd.getNode().getSucc().get(0);

        return link;
    }

    /**
     * Handle a redirection; will be translated as an or join.
     * 
     * @param map
     *            the map in which to add the redirection
     * @param link
     *            the origin of the path that we will be manipulating.
     * @param redir
     *            the uced redirect telling us where to redirect.
     * @return the nodeconnection the or join's output branch.
     */
    private NodeConnection handleRedirect(UCMmap map, NodeConnection link, Redirect redir, uced.grammar.Condition guard, uced.grammar.Condition beforeDelay,
            uced.grammar.Condition afterDelay) throws InvocationTargetException {
        NodeConnection newLink = null;

        link = handleDelay(map, link, beforeDelay, afterDelay);

        DividePathCommand dpc;
        OrFork branchingPoint = handleAlternative(link);
        // first branch
        link = (NodeConnection) branchingPoint.getSucc().get(0);
        // second branch
        newLink = (NodeConnection) branchingPoint.getSucc().get(1);

        handleCondition(link, guard, true);
        handleCondition(newLink, guard, false);

        // get destination object
        PathNode resprefOrStub = (PathNode) hmUseCaseObjectToUseCaseMapObject.get(redir.redirectTo());
        if (resprefOrStub == null && redir.redirectTo().getOperation() instanceof IncludeOperation)
            resprefOrStub = (PathNode) hmUseCaseObjectToUseCaseMapObject.get(((IncludeOperation) redir.redirectTo().getOperation()));

        if (resprefOrStub == null)
            throw new InvocationTargetException(new Exception("Not yet implemented: goto a later step, in a main scenario")); //$NON-NLS-1$
        // get the link before it.
        NodeConnection targetLink = (NodeConnection) resprefOrStub.getPred().get(0);

        OrJoin target;
        // if the target or join already exists, reuse it. add a branch.
        if (targetLink.getSource() instanceof OrJoin) {
            target = (OrJoin) targetLink.getSource();
            AddBranchCommand abc = new AddBranchCommand(target);
            cs.execute(abc);

        } else { // otherwise create a new one.
            target = (OrJoin) ModelCreationFactory.getNewObject(urn, OrJoin.class);
            dpc = new DividePathCommand(target, targetLink, resprefOrStub.getX() + 25, resprefOrStub.getY() - 25);
            cs.execute(dpc);
        }

        // relies on the fact that the new branch as an empty point on it.
        targetLink = ((NodeConnection) target.getPred().get(target.getPred().size() - 1));
        targetLink = (NodeConnection) targetLink.getSource().getPred().get(0);
        link = (NodeConnection) link.getTarget().getSucc().get(0);

        // merge current apth with newly created branch.
        MergeStartEndCommand msec = new MergeStartEndCommand(map, (StartPoint) targetLink.getSource(), (EndPoint) link.getTarget(), 50, 50);

        cs.execute(msec);

        // bind to same parent as respref, for lack of a better choice.
        target.setContRef(resprefOrStub.getContRef());
        // if (guard==null || guard instanceof NullCondition)
        // return link;
        // else
        return newLink;
    }

    /**
     * Regular steps are converted into responsibilities.
     * 
     * @param map
     *            the map in which to add it.
     * @param link
     *            where in the map
     * @param element
     *            the uced ActionStep
     * @param op
     *            the steps's operation. represents the responsibilities
     * @param cr
     *            the component reference to bind the responsibility to.
     * @return the node connection after this responsibility
     */
    private NodeConnection handleRegularStep(UCMmap map, NodeConnection link, ActionStep element, OperationInstance op, ComponentRef cr) {
        String respname = op.getOperation().toString();

        link = handleDelay(map, link, op.getBeforeDelay(), op.getAfterDelay());

        NodeConnection newLink=null;

        if (op.getValidatedGuard() != null) {
            OrFork branchingPoint = handleAlternative(link);
            // first branch
            link = (NodeConnection) branchingPoint.getSucc().get(0);
            // second branch
            newLink = (NodeConnection) branchingPoint.getSucc().get(1);

            uced.grammar.Condition guard = op.getValidatedGuard();
            handleCondition(link, guard, true);
            handleCondition(newLink, guard, false);
            
        }
        RespRef respref;
        // find the responsibility associated with the operation. (slow O(n))
        // Responsibility respdef = URNElementFinder.findResponsibilityByName(urn, respname);

        // fast (O(1))
        Responsibility respdef = (Responsibility) hmUseCaseObjectToUseCaseMapObject.get(op.getOperation());
        respref = (RespRef) ModelCreationFactory.getNewObject(urn, RespRef.class);

        // if doesn't exist, use the one that came with the reference.
        if (respdef == null) {
            respdef = respref.getRespDef();
            respdef.setName(respname);
        } else
            // otherwise, use it.
            respref.setRespDef(respdef);

        // save for future use
        hmUseCaseObjectToUseCaseMapObject.put(op.getOperation(), respdef);
        hmUseCaseObjectToUseCaseMapObject.put(element, respref);

        // insert it
        SplitLinkCommand slcmd = new SplitLinkCommand(map, respref, link, 50, 50);
        cs.execute(slcmd);

        // get next link
        link = (NodeConnection) slcmd.getNode().getSucc().get(0);

        // bind it
        if (cr != null) {
            slcmd.getNode().setContRef(cr);
        }
        
        if (newLink!=null) {
            EndPoint end = (EndPoint) ((NodeConnection) newLink.getTarget().getSucc().get(0)).getTarget();
            DividePathCommand dpc = new DividePathCommand(end, link, 59, 43, true);
            cs.execute(dpc);
            link = (NodeConnection) link.getTarget().getSucc().get(0);
        }
        return link;
    }

    /**
     * Initialize the conversion.
     * 
     */
    private void init() {
        projectmodel = null;
        cs = new CommandStack();
        hmUseCaseObjectToUseCaseMapObject = new HashMap();
    }

    /**
     * Given a filename pointing to a (supposed) UCEd project file, load the projectmodel. Verify that it is valid.
     * 
     * @param filename
     *            should map to a UCEd project file.
     * @throws InvocationTargetException
     */
    private void loadProjectModelFromUCEd(String filename) throws InvocationTargetException {
        // init UCEd, but don't display it.
        if (UCEd == null) {
            Shell bogusShell = new Shell(new Display()); // requires to be in a seperate thread
            UCEd = new SwtDialogFolder(bogusShell);
        }
        // use UCEd's file loader.
        UCEd.open(new File(filename));

        // get the model
        try {
            projectmodel = UCEd.getModel();
        } catch (Exception e) {
            throw new InvocationTargetException(e, Messages.getString("ImportUCEd.LoadError")); //$NON-NLS-1$
        }

        // verify that it is valid.
        try {
            if (projectmodel == null) {
                throw new InvocationTargetException(new Exception(Messages.getString("ImportUCEd.LoadError"))); //$NON-NLS-1$
            }
            projectmodel.validate();

        } catch (IncorrectElementException e) {
            throw new InvocationTargetException(e, Messages.getString("ImportUCEd.FileHasNotBeenValidated")); //$NON-NLS-1$
        }
    }

    /**
     * Creates a URNspec instance from a UCEd project. All errors are wrapped inside InvocationTargetExceptions.
     * 
     * @param filename
     *            should map to a UCEd project file.
     * @return an initialized URNspec with no layout information.
     * @throws InvocationTargetException
     */
    public URNspec importURN(String filename) throws InvocationTargetException {
        // initialize all variables.
        init();

        // load+verify projectmodel
        loadProjectModelFromUCEd(filename);

        // create a URNspec that doesn't contain any maps.
        urn = getEmptyURNspec();

        // add all the component definitions, starting with the root of the projectmodel
        addAllComponentDefinitions(projectmodel.getDomain().getAllEntities(), 0);

        // create & fill each map with its content
        HashMap endPoints = buildMaps(projectmodel.getUseCaseModel().getUseCases());

        // once everything has created, build the bindings.
        addPluginBindings(endPoints);

        // get rid of components references that don't contain any pathnodes.
        cleanUselessComponentReferences();

        // get rid of or-fork branches that always false.
        cleanUselessOrForkBranches();

        // refine component ref bindings for items we don't care about so that the autolayout performs better
        cleanComponentRefBindings();

        // doing it twice gives better results since we don't search for things that must strictly remain bound, we just look at neighbours
        cleanComponentRefBindings();

        return urn;

    }

    public URNspec importURN(FileInputStream fis) throws InvocationTargetException {
        // not used
        return null;
    }

    public URNspec importURN(FileInputStream fis, URNspec urn) throws InvocationTargetException {
        //Not used
        return null;
    }

    public URNspec importURN(String filename, URNspec urn) throws InvocationTargetException {
        // Not Used
        return null;
    }
}
