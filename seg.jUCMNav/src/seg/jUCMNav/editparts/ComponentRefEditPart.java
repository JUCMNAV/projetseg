package seg.jUCMNav.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.views.properties.IPropertySource;

import seg.jUCMNav.editpolicies.element.ComponentRefComponentEditPolicy;
import seg.jUCMNav.editpolicies.feedback.ComponentFeedbackEditPolicy;
import seg.jUCMNav.figures.ComponentRefFigure;
import seg.jUCMNav.views.property.ComponentPropertySource;
import ucm.map.ComponentRef;
import ucm.map.Map;
import urncore.Component;

/**
 * Created 2005-02-15
 * EditPart for all ComponentRefs. They listen to changes in both the reference and the definition.
 * 
 * @author Etienne Tremblay, jkealey
 */
public class ComponentRefEditPart extends ModelElementEditPart implements Adapter {


    public ComponentRefEditPart(ComponentRef model, Map map) {
        super();
        setModel(model);
    }

    private ComponentRef getComponentRef() {
        return (ComponentRef) getModel();
    }

    /** 
     * Overriding because we also have to listen to the Component definition
     * 
     * @see org.eclipse.gef.EditPart#activate()
     */
    public void activate() {
        if (!isActive() && getComponentRef().getCompDef()!=null)
            getComponentRef().getCompDef().eAdapters().add(this);

        super.activate();
    }

    /**
     * Overriding because we also have to listen to the Component definition
     * 
     * @see org.eclipse.gef.EditPart#deactivate()
     */
    public void deactivate() {
        if (isActive() && getComponentRef().getCompDef()!=null)
            getComponentRef().getCompDef().eAdapters().remove(this);
        super.deactivate();        
        
    }

    /**
     * Currently, all components are represented by Rectangles.
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
     */
    protected IFigure createFigure() {
        return  new ComponentRefFigure();
    }

    /* (non-Javadoc)
     * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
     */
    protected void createEditPolicies() {
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentRefComponentEditPolicy());
    	installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new ComponentFeedbackEditPolicy());
    }

    /** 
     * When the model has changed, refresh this reference but also the container.
     * 
     * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
    public void notifyChanged(Notification notification) {
        refreshVisuals();
        
        // we want the top level editpart to refresh its children so that the largest components are always in the back.
       if (notification.getEventType() == Notification.SET && getParent()!=null)
        ((MapAndPathGraphEditPart)getParent()).notifyChanged(notification);        
    }


    /**
     * Draws the figure. Currently, all Components are represented by rectangles. 
     * The Component Kind is not observed.
     * If no fill color has been defined, leave transparent.
     * If no line color has been defined, use black.
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
     */
    protected void refreshVisuals() {
        Point location = new Point(getComponentRef().getX(), getComponentRef().getY()); // The position of the current figure
        Dimension size = new Dimension(getComponentRef().getWidth(), getComponentRef().getHeight());
        Rectangle bounds = new Rectangle(location, size);
        figure.setBounds(bounds);
        figure.setLocation(location);

        
        if (getComponentRef().getCompDef() instanceof Component)
        {
            Component comp = (Component) getComponentRef().getCompDef();
            ((ComponentRefFigure)figure).setKind(comp.getKind().getValue());
            ((ComponentRefFigure)figure).setColors(comp.getLineColor(), comp.getFillColor(), comp.isFilled());
            
        }
            


        figure.validate(); // Make the label recenter itself.
        
        // notify parent container of changed position & location
        // if this line is removed, the XYLayoutManager used by the parent container
        // (the Figure of the ShapesDiagramEditPart), will not know the bounds of this figure
        // and will not draw it correctly.
        if (getParent()!=null)
            (getLayer(ConnectionOnBottomRootEditPart.COMPONENT_LAYER)).setConstraint(figure, bounds);
    }
    
	/* (non-Javadoc)
	 * @see seg.jUCMNav.editparts.ModelElementEditPart#getPropertySource()
	 */
	protected IPropertySource getPropertySource() {
		if( propertySource == null ) {
			propertySource = new ComponentPropertySource( (EObject)getModel() );
		}
		return propertySource;
	}
}