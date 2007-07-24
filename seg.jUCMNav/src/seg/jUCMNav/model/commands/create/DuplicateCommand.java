/**
 * 
 */
package seg.jUCMNav.model.commands.create;

import grl.Evaluation;
import grl.EvaluationStrategy;
import grl.StrategiesGroup;
import grl.kpimodel.KPIEvalValueSet;
import grl.kpimodel.KPIInformationConfig;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CompoundCommand;

import seg.jUCMNav.Messages;
import seg.jUCMNav.model.ModelCreationFactory;
import ucm.scenario.Initialization;
import ucm.scenario.ScenarioDef;
import ucm.scenario.ScenarioEndPoint;
import ucm.scenario.ScenarioGroup;
import ucm.scenario.ScenarioStartPoint;
import urn.URNspec;
import urncore.Condition;
import urncore.Metadata;

/**
 * Adds a scenario to a scenario group.
 * 
 * @author jkealey, pchen
 * 
 */
public class DuplicateCommand extends CompoundCommand {

    private ScenarioGroup group;
    private ScenarioDef scenario;
    private EvaluationStrategy strategy;
    private StrategiesGroup group2;
    private EObject child;
    private URNspec urn;

    public DuplicateCommand(EvaluationStrategy strategy) {
        this.strategy = strategy;
        if (strategy.getGroup() != null) {
            this.group2 = strategy.getGroup();
            this.urn = strategy.getGroup().getGrlspec().getUrnspec();
        }
        init();
    }

    public DuplicateCommand(EvaluationStrategy strategy, StrategiesGroup group, URNspec urn) {
        this.strategy = strategy;
        if (group != null) {
            this.group2 = group;
            this.urn = urn;
        }
        init();
    }

    public DuplicateCommand(StrategiesGroup group) {
        this.group2 = group;
        if (group2 != null)
            this.urn = group2.getGrlspec().getUrnspec();

        init();
    }

    public DuplicateCommand(ScenarioDef scenario) {
        this.scenario = scenario;
        this.group = scenario.getGroup();
        if (this.group != null)
            this.urn = group.getUcmspec().getUrnspec();
        init();
    }

    public DuplicateCommand(ScenarioGroup group) {
        this.group = group;
        if (this.group != null)
            this.urn = group.getUcmspec().getUrnspec();
        init();
    }

    /**
     * 
     */
    public DuplicateCommand(ScenarioDef scenario, EObject child) {
        this.scenario = scenario;

        if (child instanceof ScenarioGroup) {
            this.group = (ScenarioGroup) child;
        } else {
            this.child = child;
            this.group = scenario.getGroup();
        }

        if (scenario.getGroup() != null)
            this.urn = scenario.getGroup().getUcmspec().getUrnspec();
        init();

    }

    private void init() {
        setLabel(Messages.getString("DuplicateCommand.Duplicate")); //$NON-NLS-1$

        if (this.child instanceof ScenarioStartPoint) {
            add(new IncludePathNodeInScenarioCommand(scenario, ((ScenarioStartPoint) child).getStartPoint(), this.urn));
        } else if (this.child instanceof ScenarioEndPoint) {
            add(new IncludePathNodeInScenarioCommand(scenario, ((ScenarioEndPoint) child).getEndPoint(), this.urn));
        } else if (this.child instanceof Condition) {
            add(new IncludeConditionInScenarioCommand(scenario, ((Condition) this.child).getScenarioDefPost() == null, (Condition) this.child));
        } else if (this.child == null && this.scenario != null && this.group != null) {
            CreateScenarioCommand cmd = new CreateScenarioCommand(this.urn, this.group, true);
            ScenarioDef newScenario = cmd.getScenario();
            newScenario.setName(this.scenario.getName());
            newScenario.setDescription(this.scenario.getDescription());

            EList newMetadata = newScenario.getMetadata();
            newMetadata.clear();
            copyMetadata(newMetadata, this.scenario.getMetadata());

            add(cmd);

            for (Iterator iter = this.scenario.getIncludedScenarios().iterator(); iter.hasNext();) {
                ScenarioDef child = (ScenarioDef) iter.next();
                add(new IncludeScenarioCommand(newScenario, child, true));
            }
            for (Iterator iter = this.scenario.getStartPoints().iterator(); iter.hasNext();) {
                ScenarioStartPoint child = (ScenarioStartPoint) iter.next();
                add(new IncludePathNodeInScenarioCommand(newScenario, child.getStartPoint(), this.urn));
            }
            for (Iterator iter = this.scenario.getEndPoints().iterator(); iter.hasNext();) {
                ScenarioEndPoint child = (ScenarioEndPoint) iter.next();
                add(new IncludePathNodeInScenarioCommand(newScenario, child.getEndPoint(), this.urn));
            }
            for (Iterator iter = this.scenario.getPreconditions().iterator(); iter.hasNext();) {
                Condition child = (Condition) iter.next();
                add(new IncludeConditionInScenarioCommand(newScenario, true, child, urn));
            }
            for (Iterator iter = this.scenario.getPostconditions().iterator(); iter.hasNext();) {
                Condition child = (Condition) iter.next();
                add(new IncludeConditionInScenarioCommand(newScenario, false, child, urn));
            }
            for (Iterator iter = this.scenario.getInitializations().iterator(); iter.hasNext();) {
                Initialization child = (Initialization) iter.next();
                add(new CreateVariableInitializationCommand(child.getVariable(), newScenario, child.getValue()));
            }

        } else if (this.child == null && this.scenario == null && this.group != null) {
            ScenarioGroup newGroup = (ScenarioGroup) ModelCreationFactory.getNewObject(urn, ScenarioGroup.class);
            newGroup.setName(this.group.getName());
            newGroup.setDescription(this.group.getDescription());

            EList newMetadata = newGroup.getMetadata();
            newMetadata.clear();
            copyMetadata(newMetadata, this.group.getMetadata());

            CreateScenarioGroupCommand cmd = new CreateScenarioGroupCommand(this.urn, newGroup);
            add(cmd);

            for (Iterator iter = this.group.getScenarios().iterator(); iter.hasNext();) {
                ScenarioDef child = (ScenarioDef) iter.next();

                add(new DuplicateCommand(child, newGroup));
            }

        } else if (this.strategy != null) {
            CreateStrategyCommand cmd = new CreateStrategyCommand(urn, group2);
            EvaluationStrategy newStrategy = cmd.getStrategy();
            newStrategy.setName(this.strategy.getName());
            newStrategy.setDescription(this.strategy.getDescription());
            newStrategy.setAuthor(this.strategy.getAuthor());

            EList newMetadata = newStrategy.getMetadata();
            newMetadata.clear();
            copyMetadata(newMetadata, this.strategy.getMetadata());

            add(cmd);
            for (Iterator iter = strategy.getEvaluations().iterator(); iter.hasNext();) {
                Evaluation eval = (Evaluation) iter.next();
                Evaluation newEval = (Evaluation) ModelCreationFactory.getNewObject(urn, Evaluation.class);
                newEval.setEvaluation(eval.getEvaluation());

                KPIEvalValueSet kpiEvalValueSet = eval.getKpiEvalValueSet();
                KPIEvalValueSet newKPIEvalValueSet = (KPIEvalValueSet) ModelCreationFactory.getNewObject(urn, KPIEvalValueSet.class);
                newKPIEvalValueSet.setEvaluationValue(kpiEvalValueSet.getEvaluationValue());
                newKPIEvalValueSet.setTargetValue(kpiEvalValueSet.getTargetValue());
                newKPIEvalValueSet.setThresholdValue(kpiEvalValueSet.getThresholdValue());
                newKPIEvalValueSet.setWorstValue(kpiEvalValueSet.getWorstValue());
                newKPIEvalValueSet.setUnit(kpiEvalValueSet.getUnit());

                newEval.setKpiEvalValueSet(newKPIEvalValueSet);
                add(new AddEvaluationCommand(newEval, eval.getIntElement(), newStrategy));
            }
            for (Iterator iter = strategy.getKpiInfoConfig().iterator(); iter.hasNext();) {
                KPIInformationConfig kpiInfoConfig = (KPIInformationConfig) iter.next();
                KPIInformationConfig newKPIInfoConfig = (KPIInformationConfig) ModelCreationFactory.getNewObject(urn, KPIInformationConfig.class);
                newKPIInfoConfig.setLevelOfDimension(kpiInfoConfig.getLevelOfDimension());
                newKPIInfoConfig.setValueOfDimension(kpiInfoConfig.getValueOfDimension());
                add(new AddKPIInformationConfigCommand(newKPIInfoConfig, kpiInfoConfig.getKpiInfoElement(), newStrategy));
            }

        } else if (this.group2 != null) {
            StrategiesGroup newGroup = (StrategiesGroup) ModelCreationFactory.getNewObject(urn, StrategiesGroup.class);
            newGroup.setName(group2.getName());
            newGroup.setDescription(group2.getDescription());

            EList newMetadata = newGroup.getMetadata();
            newMetadata.clear();
            copyMetadata(newMetadata, group2.getMetadata());

            CreateStrategiesGroupCommand cmd = new CreateStrategiesGroupCommand(urn, newGroup);
            add(cmd);

            for (Iterator iter = group2.getStrategies().iterator(); iter.hasNext();) {
                EvaluationStrategy strategy = (EvaluationStrategy) iter.next();
                add(new DuplicateCommand(strategy, newGroup, urn));
            }
        }
    }

    private void copyMetadata(EList newMetadata, EList srcMetadata) {
        for (int i = 0; i < srcMetadata.size(); i++) {
            Metadata tempMetadataElem = (Metadata) ModelCreationFactory.getNewObject(urn, Metadata.class);
            tempMetadataElem.setName(((Metadata) srcMetadata.get(i)).getName());
            tempMetadataElem.setValue(((Metadata) srcMetadata.get(i)).getValue());

            newMetadata.add(tempMetadataElem);
        }
    }

}
