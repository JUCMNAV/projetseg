/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.map.impl;

import intermediateWorkflow.IntermediateWorkflowFactory;
import intermediateWorkflow.IwWorkflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ucm.map.EndPoint;
import ucm.map.InBinding;
import ucm.map.MapPackage;
import ucm.map.OutBinding;
import ucm.map.PathNode;
import ucm.map.PluginBinding;
import ucm.map.StartPoint;
import ucm.map.Stub;
import ucm.map.UCMmap;

import urn.URNspec;
import urncore.Comment;
import urncore.Concern;
import urncore.IURNConnection;
import urncore.IURNContainerRef;
import urncore.IURNDiagram;
import urncore.IURNNode;
import urncore.URNdefinition;
import urncore.UrncorePackage;

import urncore.impl.UCMmodelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Mmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getUrndefinition <em>Urndefinition</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getContRefs <em>Cont Refs</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getConcern <em>Concern</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link ucm.map.impl.UCMmapImpl#getParentStub <em>Parent Stub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UCMmapImpl extends UCMmodelElementImpl implements UCMmap {
	
	private IwWorkflow iwWorkflow;
	public IwWorkflow getIwWorkflow() {
		return iwWorkflow;
	}

	@Override
	public void build() {
		if(isPointcutExpression()==false) {
			for(PathNode pn : pathNodes())
				pn.build();
			iwWorkflow = IntermediateWorkflowFactory.eINSTANCE.createIwWorkflow();
			iwWorkflow.setName(nameOrPrefixId(getName()));
		}	
	}

	@Override
	public void link() {
		if(isPointcutExpression()==false) {
			linkWorkflowToConcern();
			for(PathNode pn : pathNodes()){
				pn.link();
			}
		}
	}

	@Override
	public void linkWorkflowToConcern() {
		if(concern == null) 
			iwWorkflow.setConcern(urnSpec().iwWithoutConcern()); 
		else
			iwWorkflow.setConcern(getConcern().iwConcern());
	}

	@Override
	public List<PathNode> pathNodes() {
		List<PathNode> pathNodes = new ArrayList<PathNode>();
		for(IURNNode node : getNodes()){
			if(node instanceof PathNode){
				pathNodes.add((PathNode)node);
			}
		}
		return pathNodes;
	}

	@Override
	public URNspec urnSpec() {
		return getUrndefinition().getUrnspec();
	}

	@Override
	public List<UCMmap> plugins() {
		List<UCMmap> pluginMaps = new ArrayList<UCMmap>();
	    
		for(Stub stub : getStubs()){
			List<PluginBinding> pluginBindings = stub.getBindings();
	    	for(PluginBinding pluginBinding : pluginBindings) {
	    		EList<InBinding> inBindings = pluginBinding.getIn(); 
	    		if(!inBindings.isEmpty()) {
	    			InBinding inBinding = inBindings.get(0);
	    			
	    			UCMmap map = null;
	    			StartPoint strtPnt = inBinding.getStartPoint();
	    			
	    			if(strtPnt != null) 
	    				map = (UCMmap)strtPnt.getDiagram();	
	    			else 
	    				map = (UCMmap)inBinding.getPointcutExit().getDiagram();
	    			
	    			pluginMaps.add(map);
	    		}
	    	}
	    }
		return pluginMaps;
	}

	@Override
	public List<Stub> getStubs() {
		List<Stub> stubs = new ArrayList<Stub>();
		for(IURNNode node : getNodes()){
			if(node instanceof Stub){
				stubs.add((Stub)node);
			}
		}
		return stubs;
	}

	@Override
	public boolean isPointcutExpression() {
		for(Stub stub : boundAsPluginInStubs()) {
			if(!stub.isPointcutStub() || stub.getConcern() != getConcern())
				return false;
	   }		
	   return boundAsPluginInStubs().size() > 0 && plugins().size() == 0;
	}

	@Override
	public LinkedHashSet<Stub> boundAsPluginInStubs() {
		LinkedHashSet<Stub> stubs = new LinkedHashSet<Stub>();
		for(PluginBinding pb : boundAsPluginInPluginBindings()){
			stubs.add(pb.getStub());
		}
		//boundAsPluginInPluginBindings.collect{pluginBinding|pluginBinding.stub}.asOrderedSet
		return stubs;
	}

	@Override
	public LinkedHashSet<PluginBinding> boundAsPluginInPluginBindings() {
		/*List<PluginBinding> pluginBindings = collect(boundAsPluginInInBindings(), on(InBinding.class).getBinding());
		pluginBindings.addAll(collect(boundAsPluginInOutBindings(), on(OutBinding.class).getBinding()));
		
		return pluginBindings;*/
		LinkedHashSet<PluginBinding> pbs = new LinkedHashSet<PluginBinding>();
		
		for(InBinding ib :  boundAsPluginInInBindings()){
			pbs.add(ib.getBinding());
		}
		for(OutBinding ob: boundAsPluginInOutBindings()){
			pbs.add(ob.getBinding());
		}
		return pbs;
	}

	@Override
	public LinkedHashSet<InBinding> boundAsPluginInInBindings() {
		//result:=OrderedSet<InBinding>.new
		//startPoints.each{startPoint|result.addAll(startPoint.inBindings)}
		
		LinkedHashSet<InBinding> ibs = new LinkedHashSet<InBinding>();
		
		for(StartPoint sp: startPoints()){
			for(InBinding ib : sp.getInBindings()){
				ibs.add(ib);
			}
		}
		return ibs;
	}

	@Override
	public List<StartPoint> startPoints() {
		//return flatten(collect(getNodes(StartPoint.class), on(StartPoint.class).getInBindings()));
		List<StartPoint> startPoints = new ArrayList<StartPoint>();
		for(IURNNode node : getNodes()){
			if(node instanceof StartPoint){
				startPoints.add((StartPoint)node);
			}
		}
		return startPoints;
	}

	@Override
	public LinkedHashSet<OutBinding> boundAsPluginInOutBindings() {
		//return flatten(collect(getNodes(EndPoint.class), on(EndPoint.class).getOutBindings()));
		LinkedHashSet<OutBinding> ibs = new LinkedHashSet<OutBinding>();
		
		for(EndPoint ep: getEndPoints()){
			for(OutBinding ib : ep.getOutBindings()){
				ibs.add(ib);
			}
		}
		return ibs;
	}

	@Override
	public List<EndPoint> getEndPoints() {
		List<EndPoint> endPoints = new ArrayList<EndPoint>();
		for(IURNNode node : getNodes()){
			if(node instanceof EndPoint){
				endPoints.add((EndPoint)node);
			}
		}
		return endPoints;
	}
	
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IURNNode> nodes;

	/**
	 * The cached value of the '{@link #getContRefs() <em>Cont Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<IURNContainerRef> contRefs;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<IURNConnection> connections;

	/**
	 * The cached value of the '{@link #getConcern() <em>Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected Concern concern;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentStub() <em>Parent Stub</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStub()
	 * @generated
	 * @ordered
	 */
	protected EList<PluginBinding> parentStub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCMmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapPackage.Literals.UC_MMAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URNdefinition getUrndefinition() {
		if (eContainerFeatureID() != MapPackage.UC_MMAP__URNDEFINITION) return null;
		return (URNdefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrndefinition(URNdefinition newUrndefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUrndefinition, MapPackage.UC_MMAP__URNDEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrndefinition(URNdefinition newUrndefinition) {
		if (newUrndefinition != eInternalContainer() || (eContainerFeatureID() != MapPackage.UC_MMAP__URNDEFINITION && newUrndefinition != null)) {
			if (EcoreUtil.isAncestor(this, newUrndefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUrndefinition != null)
				msgs = ((InternalEObject)newUrndefinition).eInverseAdd(this, UrncorePackage.UR_NDEFINITION__SPEC_DIAGRAMS, URNdefinition.class, msgs);
			msgs = basicSetUrndefinition(newUrndefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.UC_MMAP__URNDEFINITION, newUrndefinition, newUrndefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IURNNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<IURNNode>(IURNNode.class, this, MapPackage.UC_MMAP__NODES, UrncorePackage.IURN_NODE__DIAGRAM);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IURNContainerRef> getContRefs() {
		if (contRefs == null) {
			contRefs = new EObjectContainmentWithInverseEList<IURNContainerRef>(IURNContainerRef.class, this, MapPackage.UC_MMAP__CONT_REFS, UrncorePackage.IURN_CONTAINER_REF__DIAGRAM);
		}
		return contRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IURNConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<IURNConnection>(IURNConnection.class, this, MapPackage.UC_MMAP__CONNECTIONS, UrncorePackage.IURN_CONNECTION__DIAGRAM);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concern getConcern() {
		if (concern != null && concern.eIsProxy()) {
			InternalEObject oldConcern = (InternalEObject)concern;
			concern = (Concern)eResolveProxy(oldConcern);
			if (concern != oldConcern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapPackage.UC_MMAP__CONCERN, oldConcern, concern));
			}
		}
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concern basicGetConcern() {
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcern(Concern newConcern, NotificationChain msgs) {
		Concern oldConcern = concern;
		concern = newConcern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.UC_MMAP__CONCERN, oldConcern, newConcern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(Concern newConcern) {
		if (newConcern != concern) {
			NotificationChain msgs = null;
			if (concern != null)
				msgs = ((InternalEObject)concern).eInverseRemove(this, UrncorePackage.CONCERN__SPEC_DIAGRAMS, Concern.class, msgs);
			if (newConcern != null)
				msgs = ((InternalEObject)newConcern).eInverseAdd(this, UrncorePackage.CONCERN__SPEC_DIAGRAMS, Concern.class, msgs);
			msgs = basicSetConcern(newConcern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.UC_MMAP__CONCERN, newConcern, newConcern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, MapPackage.UC_MMAP__COMMENTS, UrncorePackage.COMMENT__DIAGRAM);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.UC_MMAP__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PluginBinding> getParentStub() {
		if (parentStub == null) {
			parentStub = new EObjectWithInverseResolvingEList<PluginBinding>(PluginBinding.class, this, MapPackage.UC_MMAP__PARENT_STUB, MapPackage.PLUGIN_BINDING__PLUGIN);
		}
		return parentStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUrndefinition((URNdefinition)otherEnd, msgs);
			case MapPackage.UC_MMAP__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONT_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContRefs()).basicAdd(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONCERN:
				if (concern != null)
					msgs = ((InternalEObject)concern).eInverseRemove(this, UrncorePackage.CONCERN__SPEC_DIAGRAMS, Concern.class, msgs);
				return basicSetConcern((Concern)otherEnd, msgs);
			case MapPackage.UC_MMAP__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
			case MapPackage.UC_MMAP__PARENT_STUB:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentStub()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				return basicSetUrndefinition(null, msgs);
			case MapPackage.UC_MMAP__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONT_REFS:
				return ((InternalEList<?>)getContRefs()).basicRemove(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case MapPackage.UC_MMAP__CONCERN:
				return basicSetConcern(null, msgs);
			case MapPackage.UC_MMAP__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case MapPackage.UC_MMAP__PARENT_STUB:
				return ((InternalEList<?>)getParentStub()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				return eInternalContainer().eInverseRemove(this, UrncorePackage.UR_NDEFINITION__SPEC_DIAGRAMS, URNdefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				return getUrndefinition();
			case MapPackage.UC_MMAP__NODES:
				return getNodes();
			case MapPackage.UC_MMAP__CONT_REFS:
				return getContRefs();
			case MapPackage.UC_MMAP__CONNECTIONS:
				return getConnections();
			case MapPackage.UC_MMAP__CONCERN:
				if (resolve) return getConcern();
				return basicGetConcern();
			case MapPackage.UC_MMAP__COMMENTS:
				return getComments();
			case MapPackage.UC_MMAP__SINGLETON:
				return isSingleton();
			case MapPackage.UC_MMAP__PARENT_STUB:
				return getParentStub();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				setUrndefinition((URNdefinition)newValue);
				return;
			case MapPackage.UC_MMAP__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends IURNNode>)newValue);
				return;
			case MapPackage.UC_MMAP__CONT_REFS:
				getContRefs().clear();
				getContRefs().addAll((Collection<? extends IURNContainerRef>)newValue);
				return;
			case MapPackage.UC_MMAP__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends IURNConnection>)newValue);
				return;
			case MapPackage.UC_MMAP__CONCERN:
				setConcern((Concern)newValue);
				return;
			case MapPackage.UC_MMAP__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case MapPackage.UC_MMAP__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case MapPackage.UC_MMAP__PARENT_STUB:
				getParentStub().clear();
				getParentStub().addAll((Collection<? extends PluginBinding>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				setUrndefinition((URNdefinition)null);
				return;
			case MapPackage.UC_MMAP__NODES:
				getNodes().clear();
				return;
			case MapPackage.UC_MMAP__CONT_REFS:
				getContRefs().clear();
				return;
			case MapPackage.UC_MMAP__CONNECTIONS:
				getConnections().clear();
				return;
			case MapPackage.UC_MMAP__CONCERN:
				setConcern((Concern)null);
				return;
			case MapPackage.UC_MMAP__COMMENTS:
				getComments().clear();
				return;
			case MapPackage.UC_MMAP__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case MapPackage.UC_MMAP__PARENT_STUB:
				getParentStub().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MapPackage.UC_MMAP__URNDEFINITION:
				return getUrndefinition() != null;
			case MapPackage.UC_MMAP__NODES:
				return nodes != null && !nodes.isEmpty();
			case MapPackage.UC_MMAP__CONT_REFS:
				return contRefs != null && !contRefs.isEmpty();
			case MapPackage.UC_MMAP__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case MapPackage.UC_MMAP__CONCERN:
				return concern != null;
			case MapPackage.UC_MMAP__COMMENTS:
				return comments != null && !comments.isEmpty();
			case MapPackage.UC_MMAP__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case MapPackage.UC_MMAP__PARENT_STUB:
				return parentStub != null && !parentStub.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IURNDiagram.class) {
			switch (derivedFeatureID) {
				case MapPackage.UC_MMAP__URNDEFINITION: return UrncorePackage.IURN_DIAGRAM__URNDEFINITION;
				case MapPackage.UC_MMAP__NODES: return UrncorePackage.IURN_DIAGRAM__NODES;
				case MapPackage.UC_MMAP__CONT_REFS: return UrncorePackage.IURN_DIAGRAM__CONT_REFS;
				case MapPackage.UC_MMAP__CONNECTIONS: return UrncorePackage.IURN_DIAGRAM__CONNECTIONS;
				case MapPackage.UC_MMAP__CONCERN: return UrncorePackage.IURN_DIAGRAM__CONCERN;
				case MapPackage.UC_MMAP__COMMENTS: return UrncorePackage.IURN_DIAGRAM__COMMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IURNDiagram.class) {
			switch (baseFeatureID) {
				case UrncorePackage.IURN_DIAGRAM__URNDEFINITION: return MapPackage.UC_MMAP__URNDEFINITION;
				case UrncorePackage.IURN_DIAGRAM__NODES: return MapPackage.UC_MMAP__NODES;
				case UrncorePackage.IURN_DIAGRAM__CONT_REFS: return MapPackage.UC_MMAP__CONT_REFS;
				case UrncorePackage.IURN_DIAGRAM__CONNECTIONS: return MapPackage.UC_MMAP__CONNECTIONS;
				case UrncorePackage.IURN_DIAGRAM__CONCERN: return MapPackage.UC_MMAP__CONCERN;
				case UrncorePackage.IURN_DIAGRAM__COMMENTS: return MapPackage.UC_MMAP__COMMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (singleton: ");
		result.append(singleton);
		result.append(')');
		return result.toString();
	}

} //UCMmapImpl
