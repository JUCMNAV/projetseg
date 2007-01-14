/*
 * Created on 05.02.2005
 *
 */
package com.site.UCMScenarioViewer.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.site.UCMScenarioViewer.editpart.viewer.ActionEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.ConditionEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.LifeLineEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.MessageEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.ParallelSequenceEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.ResetTimerEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.ScenarioEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.ScenarioGroupEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.SetTimerEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.StartEndEditPart;
import com.site.UCMScenarioViewer.editpart.viewer.TimeoutEditPart;
import com.site.UCMScenarioViewer.model.Action;
import com.site.UCMScenarioViewer.model.Condition;
import com.site.UCMScenarioViewer.model.LifeLine;
import com.site.UCMScenarioViewer.model.Message;
import com.site.UCMScenarioViewer.model.ParallelSequence;
import com.site.UCMScenarioViewer.model.ResetTimer;
import com.site.UCMScenarioViewer.model.Scenario;
import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.model.SetTimer;
import com.site.UCMScenarioViewer.model.StartEndMessage;
import com.site.UCMScenarioViewer.model.TimeOut;

/**
 *  Maps model elements into edit parts for main viewer. Used by the {@link com.site.UCMScenarioViewer.UCMScenarioViewer} object.
 * 
 * @author Sasha
 * @see com.site.UCMScenarioViewer.UCMScenarioViewer
 *
 */
public class GraphicalPartFactory implements EditPartFactory {

	/**
	 * Default constructor.
	 */
	public GraphicalPartFactory() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart context, Object model) {

		if (model instanceof ScenarioGroup)
			return new ScenarioGroupEditPart(model);
		if (model instanceof Scenario)
			return new ScenarioEditPart(model);
		if (model instanceof LifeLine)
			return new LifeLineEditPart(model);
		if (model instanceof Message)
			return new MessageEditPart(model);
		if (model instanceof ParallelSequence)
			return new ParallelSequenceEditPart(model);
		if (model instanceof ResetTimer)
			return new ResetTimerEditPart(model);
		if (model instanceof TimeOut) 
			return new TimeoutEditPart(model);
		if (model instanceof Action)
			return new ActionEditPart(model);
		if (model instanceof Condition)
			return new ConditionEditPart(model);
		if (model instanceof SetTimer)
			return new SetTimerEditPart(model);
		if (model instanceof StartEndMessage)
			return new StartEndEditPart(model);
		return null;
	}

}
