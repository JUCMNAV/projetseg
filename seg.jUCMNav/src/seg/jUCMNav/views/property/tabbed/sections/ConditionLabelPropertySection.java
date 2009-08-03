package seg.jUCMNav.views.property.tabbed.sections;

import org.eclipse.emf.ecore.EAttribute;

import seg.jUCMNav.views.property.tabbed.mapper.ConditionDataResolver;
import seg.jUCMNav.views.property.tabbed.mapper.IPropertyDataResolver;
import urncore.UrncorePackage;

public class ConditionLabelPropertySection extends AbstractStringPropertySection {
	
	protected static IPropertyDataResolver r = new ConditionDataResolver();

	protected EAttribute getFeature() {
		return UrncorePackage.eINSTANCE.getCondition_Label();
	}

	protected String getLabelText() {
		return "Condition Label:"; 
	}

	protected Object getDataForSection(Object obj) {
		Object result = super.getDataForSection(obj);
		
		return r.getData(result);
	}
}
