package seg.jUCMNav.views.property;

import grl.EvaluationStrategy;
import grl.StrategiesGroup;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import seg.jUCMNav.Messages;
import seg.jUCMNav.model.ModelCreationFactory;
import seg.jUCMNav.model.util.EObjectClassNameComparator;
import seg.jUCMNav.model.util.ParentFinder;
import seg.jUCMNav.scenarios.ScenarioUtils;
import seg.jUCMNav.views.property.descriptors.MetadataPropertyDescriptor;
import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.OrFork;
import ucm.map.PathNode;
import ucm.map.StartPoint;
import ucm.map.WaitingPlace;
import ucm.performance.Workload;
import ucm.scenario.Initialization;
import ucm.scenario.ScenarioDef;
import ucm.scenario.ScenarioGroup;
import ucm.scenario.ScenarioStartPoint;
import urn.URNspec;
import urncore.Condition;
import urncore.IURNContainerRef;
import urncore.IURNNode;
import urncore.Label;
import urncore.Metadata;
import urncore.URNmodelElement;

/**
 * URNElementPropertySource adds code to replace the parent attribute in ucm model elements to represent the ComponentRef to which this ucm element is bound to.
 * Both ComponentRefs and PathNodes are bound to the parent.
 * 
 * @author jkealey, etremblay
 * 
 */
public class URNElementPropertySource extends EObjectPropertySource {

    /**
     * @param obj
     */
    public URNElementPropertySource(EObject obj) {
        super(obj);
    }

    public void addPropertyToDescriptor(Collection descriptors, EStructuralFeature attr, EClass c) {
        // Get type for the structural feature
        EClassifier type = getFeatureType(attr);
        PropertyID propertyid = new PropertyID(c, attr);

        if (type.getInstanceClass() == IURNContainerRef.class && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef)
                && attr.getUpperBound() == 1) {
            componentRefDescriptor(descriptors, attr, propertyid);
        } else if (type.getInstanceClass() == Workload.class) {
            workloadDescriptor(descriptors, propertyid);
        } else if (type.getInstanceClass() == Condition.class && !(getEditableValue() instanceof Label) && attr.getUpperBound() != -1) { // not a list.
            if (getEditableValue() instanceof NodeConnection) {
                NodeConnection nc = (NodeConnection) getEditableValue();
                // only on node connections that follow an or fork or a waitingplace/timer
                if (nc.getSource() instanceof OrFork || nc.getSource() instanceof WaitingPlace) {
                    conditionDescriptor(descriptors, propertyid);
                }
            } else
                conditionDescriptor(descriptors, propertyid);
        } else if (type.getInstanceClass().getSuperclass() == AbstractEnumerator.class) {
            // these are enums created by EMF
            enumerationDescriptor(descriptors, propertyid);
        } else if (type.getInstanceClass() == ScenarioGroup.class && getEditableValue() instanceof ScenarioDef) {
            scenarioGroupDescriptor(descriptors, propertyid);
        } else if (type.getInstanceClass() == StrategiesGroup.class && getEditableValue() instanceof EvaluationStrategy) {
            strategyGroupDescriptor(descriptors, propertyid);
        } else if (getEditableValue() instanceof Initialization && attr.getName().equals("value")) { //$NON-NLS-1$
            Initialization init = (Initialization) getEditableValue();
            if (init.getVariable() != null && init.getVariable().getType().equals(ScenarioUtils.sTypeInteger))
                intDescriptor(descriptors, attr, propertyid);
            else if (init.getVariable() != null && init.getVariable().getType().equals(ScenarioUtils.sTypeBoolean))
                booleanDescriptor(descriptors, attr, propertyid);
            else if (init.getVariable() != null && init.getVariable().getType().equals(ScenarioUtils.sTypeEnumeration)) {
                if (((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues() != null)
                    enumerationDescriptor(descriptors, propertyid, ((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues().split(
                            ",")); //$NON-NLS-1$
            }
        } else if (type.getInstanceClass() == Metadata.class) {
            metadataDescriptor(descriptors, attr, propertyid);
        } else {
            super.addPropertyToDescriptor(descriptors, attr, c);
        }
    }

    /**
     * @param descriptors
     * @param propertyid
     */
    private void metadataDescriptor(Collection descriptors, EStructuralFeature attr, PropertyID propertyid) {
        PropertyDescriptor pd;
        String name = attr.getName().toLowerCase();
        if (name.indexOf("metadata") >= 0 && getEditableValue() instanceof URNmodelElement) { //$NON-NLS-1$
            // urn model elements have metadata
            pd = new MetadataPropertyDescriptor(propertyid, (URNmodelElement) getEditableValue());
            pd.setCategory(Messages.getString("URNElementPropertySource.metadata")); //$NON-NLS-1$
        } else {
            pd = new TextPropertyDescriptor(propertyid, attr.getName());
        }

        descriptors.add(pd);
    }

    /**
     * @param descriptors
     * @param propertyid
     */
    private void enumerationDescriptor(Collection descriptors, PropertyID propertyid) {
        EClassifier type = getFeatureType(propertyid.getFeature());
        Class enumer = type.getInstanceClass();
        String[] values = getEnumerationValues(enumer);
        // String name = enumer.getName().substring(enumer.getName().lastIndexOf('.') + 1);
        String name = propertyid.getFeature().getName();
        ComboBoxPropertyDescriptor pd = new ComboBoxPropertyDescriptor(propertyid, name, values);
        pd.setCategory(Messages.getString("EObjectPropertySource.misc")); //$NON-NLS-1$
        descriptors.add(pd);

    }

    /**
     * @param descriptors
     * @param propertyid
     */
    private void enumerationDescriptor(Collection descriptors, PropertyID propertyid, String[] values) {
        EClassifier type = getFeatureType(propertyid.getFeature());
        Class enumer = type.getInstanceClass();
        String name = propertyid.getFeature().getName();
        ComboBoxPropertyDescriptor pd = new ComboBoxPropertyDescriptor(propertyid, name, values);
        pd.setCategory(Messages.getString("EObjectPropertySource.misc")); //$NON-NLS-1$
        descriptors.add(pd);

    }

    /**
     * @param enumer
     *            A class having a VALUES field returning a List of AbstractEnumerators.
     * @return A sorted list of strings corresponding to the names of the values.
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     */
    private String[] getEnumerationValues(Class enumer) {
        try {
            List VALUES;

            VALUES = (List) enumer.getField("VALUES").get(null); //$NON-NLS-1$
            String[] values = new String[VALUES.size()];
            for (int i = 0; i < VALUES.size(); i++)
                values[i] = ((AbstractEnumerator) (VALUES.get(i))).getName();

            return values;

        } catch (Exception e) {
            e.printStackTrace();
            return new String[] {};
        }
    }

    /**
     * @param descriptors
     * @param propertyid
     */
    private void workloadDescriptor(Collection descriptors, PropertyID propertyid) {
        PropertyDescriptor pd = new PropertyDescriptor(propertyid, Messages.getString("URNElementPropertySource.workload")); //$NON-NLS-1$
        pd.setCategory(Messages.getString("URNElementPropertySource.performance")); //$NON-NLS-1$
        pd.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                return ""; //$NON-NLS-1$
            }
        });

        descriptors.add(pd);
    }

    /**
     * @param descriptors
     * @param propertyid
     */
    private void conditionDescriptor(Collection descriptors, PropertyID propertyid) {
        PropertyDescriptor pd;

        pd = new PropertyDescriptor(propertyid, propertyid.getFeature().getName());

        pd.setCategory(Messages.getString("URNElementPropertySource.ScenarioStrategy")); //$NON-NLS-1$
        pd.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                return ""; //$NON-NLS-1$
            }
        });

        descriptors.add(pd);
    }

    /**
     * Creates a drop down list for scenario groups.
     * 
     * @param descriptors
     * @param propertyid
     */
    private void scenarioGroupDescriptor(Collection descriptors, PropertyID propertyid) {
        if (((ScenarioDef) getEditableValue()).getGroup() == null || ((ScenarioDef) getEditableValue()).getGroup().getUcmspec() == null)
            return;
        URNspec urn = ((ScenarioDef) getEditableValue()).getGroup().getUcmspec().getUrnspec();
        Vector list;
        list = new Vector(urn.getUcmspec().getScenarioGroups());
        Collections.sort(list, new EObjectClassNameComparator());

        String[] values = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {

            values[i] = EObjectClassNameComparator.getSortableElementName((ScenarioGroup) list.get(i));
            if (values[i] == null)
                values[i] = Messages.getString("URNElementPropertySource.unnamed"); //$NON-NLS-1$
        }

        ComboBoxPropertyDescriptor pd = new ComboBoxPropertyDescriptor(propertyid, "group", values); //$NON-NLS-1$
        pd.setCategory(Messages.getString("URNElementPropertySource.ScenarioStrategy")); //$NON-NLS-1$
        descriptors.add(pd);

    }

    /**
     * Creates a drop down list for strategy groups.
     * 
     * @param descriptors
     * @param propertyid
     */
    private void strategyGroupDescriptor(Collection descriptors, PropertyID propertyid) {
        if (((EvaluationStrategy) getEditableValue()).getGroup() == null || ((EvaluationStrategy) getEditableValue()).getGroup().getGrlspec() == null)
            return;
        URNspec urn = ((EvaluationStrategy) getEditableValue()).getGroup().getGrlspec().getUrnspec();
        Vector list;
        list = new Vector(urn.getGrlspec().getGroups());
        Collections.sort(list, new EObjectClassNameComparator());

        String[] values = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {

            values[i] = EObjectClassNameComparator.getSortableElementName((StrategiesGroup) list.get(i));
            if (values[i] == null)
                values[i] = Messages.getString("URNElementPropertySource.unnamed"); //$NON-NLS-1$
        }

        ComboBoxPropertyDescriptor pd = new ComboBoxPropertyDescriptor(propertyid, "group", values); //$NON-NLS-1$
        pd.setCategory(Messages.getString("URNElementPropertySource.ScenarioStrategy")); //$NON-NLS-1$
        descriptors.add(pd);

    }

    protected Object returnPropertyValue(EStructuralFeature feature, Object result) {
        if (feature instanceof EReference && ((EReference) feature).getEReferenceType().getInstanceClass() == IURNContainerRef.class
                && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef)) {
            // && feature.getName().toLowerCase().indexOf("parent") >= 0) {
            Vector list = ParentFinder.getPossibleParents((URNmodelElement) getEditableValue());
            Collections.sort(list, new EObjectClassNameComparator());

            for (int i = 0; i < list.size(); i++) {
                IURNContainerRef parent;
                if (getEditableValue() instanceof IURNContainerRef)
                    parent = (IURNContainerRef) ((IURNContainerRef) getEditableValue()).getParent();
                else
                    parent = (IURNContainerRef) ((IURNNode) getEditableValue()).getContRef();
                if (list.get(i).equals(parent))
                    result = new Integer(i + 1);
            }
            if (result == null)
                result = new Integer(0);

        } else if (getFeatureType(feature).getInstanceClass() == Workload.class) {
            StartPoint pt = null;

            if (result == null) {
                if (getEditableValue() instanceof StartPoint)
                    pt = (StartPoint) getEditableValue();
                if (getEditableValue() instanceof ScenarioStartPoint)
                    pt = ((ScenarioStartPoint) getEditableValue()).getStartPoint();

                if (pt != null) {
                    URNspec urn = pt.getDiagram().getUrndefinition().getUrnspec();
                    result = (Workload) ModelCreationFactory.getNewObject(urn, Workload.class);
                }
            }
            if (result != null)
                result = new URNElementPropertySource((EObject) result);
        } else if (getFeatureType(feature).getInstanceClass() == Condition.class) {
            if (result == null) {
                URNspec urn;
                if (getEditableValue() instanceof NodeConnection)
                    urn = ((NodeConnection) getEditableValue()).getDiagram().getUrndefinition().getUrnspec();
                else
                    urn = ((PathNode) getEditableValue()).getDiagram().getUrndefinition().getUrnspec();

                result = (Condition) ModelCreationFactory.getNewObject(urn, Condition.class);

                if (getEditableValue() instanceof NodeConnection) {

                    NodeConnection connection = (NodeConnection) getEditableValue();
                    if (connection.getSource() instanceof WaitingPlace) {
                        ((Condition) result).setExpression("false"); //$NON-NLS-1$
                    }
                    ((Condition) result).setNodeConnection(connection);
                } else if (getEditableValue() instanceof StartPoint)
                    ((Condition) result).setStartPoint((StartPoint) getEditableValue());
                else if (getEditableValue() instanceof EndPoint)
                    ((Condition) result).setEndPoint((EndPoint) getEditableValue());

                // TODO: any other cases where we should initialize it?

            }
            result = new URNElementPropertySource((EObject) result);
        } else if (getFeatureType(feature).getInstanceClass() == ScenarioGroup.class && getEditableValue() instanceof ScenarioDef) {
            URNspec urn = ((ScenarioDef) getEditableValue()).getGroup().getUcmspec().getUrnspec();
            Vector list = new Vector(urn.getUcmspec().getScenarioGroups());

            Collections.sort(list, new EObjectClassNameComparator());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(((ScenarioDef) getEditableValue()).getGroup()))
                    result = new Integer(i);
            }
        } else if (getFeatureType(feature).getInstanceClass() == StrategiesGroup.class && getEditableValue() instanceof EvaluationStrategy) {
            URNspec urn = ((EvaluationStrategy) getEditableValue()).getGroup().getGrlspec().getUrnspec();
            Vector list = new Vector(urn.getGrlspec().getGroups());

            Collections.sort(list, new EObjectClassNameComparator());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(((EvaluationStrategy) getEditableValue()).getGroup()))
                    result = new Integer(i);
            }
        } else if ((getEditableValue() instanceof Initialization && feature.getName().equals("value")) && ((Initialization) getEditableValue()).getVariable().getEnumerationType() != null && ((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues() != null) { //$NON-NLS-1$)
            String[] values = ((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues().split(","); //$NON-NLS-1$
            String value = super.returnPropertyValue(feature, result) != null ? super.returnPropertyValue(feature, result).toString() : ""; //$NON-NLS-1$
            for (int i = 0; i < values.length; i++) {
                if (values[i].equalsIgnoreCase(value))
                    return new Integer(i);
            }

            return new Integer(0);
        } else if (result instanceof AbstractEnumerator) {
            // if this is an EMF enumeration
            int i = getEnumerationIndex((AbstractEnumerator) result);
            result = new Integer(i);
        } else {
            result = super.returnPropertyValue(feature, result);
        }

        return result;
    }

    /**
     * @param result
     * @return the index of an AbstractEnumerator in its sorted list.
     */
    private int getEnumerationIndex(AbstractEnumerator result) {
        String[] values = getEnumerationValues(result.getClass());
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(((AbstractEnumerator) result).getName()))
                return i;
        }
        return -1;
    }

    public void setPropertyValue(Object id, Object value) {
        PropertyID propertyid = (PropertyID) id;
        EStructuralFeature feature = propertyid.getFeature();

        Object result = getPropertyValue(id);

        if (feature instanceof EReference && ((EReference) feature).getEReferenceType().getInstanceClass() == IURNContainerRef.class
                && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef)) {
            Vector list = ParentFinder.getPossibleParents((URNmodelElement) getEditableValue());
            Collections.sort(list, new EObjectClassNameComparator());
            if (((Integer) value).equals(new Integer(0)))
                result = null;
            else
                result = list.get(((Integer) value).intValue() - 1);
            setReferencedObject(propertyid, feature, result);
        } else if (getFeatureType(feature).getInstanceClass().getSuperclass() == AbstractEnumerator.class) {
            // if this is an EMF enumeration
            Class enumer = getFeatureType(feature).getInstanceClass();
            try {

                int selectedIndex = ((Integer) value).intValue();
                String selectedString = getEnumerationValues(enumer)[selectedIndex];
                result = enumer.getMethod("get", new Class[] { String.class }).invoke(getEditableValue(), new Object[] { selectedString }); //$NON-NLS-1$
            } catch (Exception e) {
                e.printStackTrace();
            }

            setReferencedObject(propertyid, feature, result);
        } else if ((getEditableValue() instanceof Initialization && feature.getName().equals("value")) && ((Initialization) getEditableValue()).getVariable().getEnumerationType() != null && ((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues() != null) { //$NON-NLS-1$)

            String[] values = ((Initialization) getEditableValue()).getVariable().getEnumerationType().getValues().split(","); //$NON-NLS-1$
            int selectedIndex = ((Integer) value).intValue();
            String selectedString = values[selectedIndex];
            result = selectedString;

            setReferencedObject(propertyid, feature, result);

        } else if (getFeatureType(feature).getInstanceClass() == ScenarioGroup.class && getEditableValue() instanceof ScenarioDef) {

            Vector list = new Vector(((ScenarioDef) getEditableValue()).getGroup().getUcmspec().getScenarioGroups());
            Collections.sort(list, new EObjectClassNameComparator());
            result = list.get(((Integer) value).intValue());
            setReferencedObject(propertyid, feature, result);
        } else if (getFeatureType(feature).getInstanceClass() == StrategiesGroup.class && getEditableValue() instanceof EvaluationStrategy) {

            Vector list = new Vector(((EvaluationStrategy) getEditableValue()).getGroup().getGrlspec().getGroups());
            Collections.sort(list, new EObjectClassNameComparator());
            result = list.get(((Integer) value).intValue());
            setReferencedObject(propertyid, feature, result);
        } else if (getEditableValue() instanceof Initialization && getFeatureType(feature).getInstanceClass() == String.class && value instanceof Boolean) {
            super.setPropertyValue(id, ((Boolean) value).toString());
        } else
            super.setPropertyValue(id, value);
    }

    private void componentRefDescriptor(Collection descriptors, EStructuralFeature attr, PropertyID propertyid) {
        Vector list = ParentFinder.getPossibleParents((URNmodelElement) getEditableValue());
        Collections.sort(list, new EObjectClassNameComparator());
        String[] values = new String[list.size() + 1];
        values[0] = Messages.getString("URNElementPropertySource.unbound"); //$NON-NLS-1$
        for (int i = 1; i < list.size() + 1; i++) {
            values[i] = EObjectClassNameComparator.getSortableElementName((IURNContainerRef) list.get(i - 1));
            if (values[i] == null)
                values[i] = Messages.getString("URNElementPropertySource.unnamed"); //$NON-NLS-1$
        }

        ComboBoxPropertyDescriptor pd = new ComboBoxPropertyDescriptor(propertyid, Messages.getString("URNElementPropertySource.parent"), values); //$NON-NLS-1$
        pd.setCategory(Messages.getString("EObjectPropertySource.info")); //$NON-NLS-1$
        descriptors.add(pd);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
     */
    public boolean isPropertySet(Object id) {
        PropertyID propertyid = (PropertyID) id;
        EStructuralFeature feature = propertyid.getFeature();

        if (feature instanceof EReference && ((EReference) feature).getEReferenceType().getInstanceClass() == IURNContainerRef.class
                && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef)) {
            return ((Integer) getPropertyValue(id)).intValue() > 0;
        } else
            return super.isPropertySet(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
     */
    public boolean isPropertyResettable(Object id) {
        PropertyID propertyid = (PropertyID) id;
        EStructuralFeature feature = propertyid.getFeature();

        if (feature instanceof EReference && ((EReference) feature).getEReferenceType().getInstanceClass() == IURNContainerRef.class
                && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef)) {
            return true;
        } else
            return super.isPropertyResettable(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
     */
    public void resetPropertyValue(Object id) {
        PropertyID propertyid = (PropertyID) id;
        EStructuralFeature feature = propertyid.getFeature();

        if (feature.getName().toLowerCase().indexOf("color") >= 0 //$NON-NLS-1$
                || (feature instanceof EReference && ((EReference) feature).getEReferenceType().getInstanceClass() == IURNContainerRef.class && (getEditableValue() instanceof IURNNode || getEditableValue() instanceof IURNContainerRef))) {
            object.eSet(feature, null);
        } else
            super.resetPropertyValue(id);
    }
}