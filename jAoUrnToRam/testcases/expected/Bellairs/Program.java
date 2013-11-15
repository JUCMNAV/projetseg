package Bellairs;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import Bellairs.Instantiators.Authentication.AuthenticationWorkflowInstantiator;
import Bellairs.Instantiators.Base.DevelopRoutePlanSimpleWorkflowInstantiator;
import Bellairs.Instantiators.Base.DevelopRoutePlanMediumWorkflowInstantiator;
import Bellairs.Instantiators.Base.DevelopRoutePlanComplexWorkflowInstantiator;
import Bellairs.Instantiators.Base.ProposeRouteWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        AuthenticationWorkflowInstantiator l_AuthenticationWorkflowInstantiator=new AuthenticationWorkflowInstantiator();
        DevelopRoutePlanSimpleWorkflowInstantiator l_DevelopRoutePlanSimpleWorkflowInstantiator=new DevelopRoutePlanSimpleWorkflowInstantiator();
        DevelopRoutePlanMediumWorkflowInstantiator l_DevelopRoutePlanMediumWorkflowInstantiator=new DevelopRoutePlanMediumWorkflowInstantiator();
        DevelopRoutePlanComplexWorkflowInstantiator l_DevelopRoutePlanComplexWorkflowInstantiator=new DevelopRoutePlanComplexWorkflowInstantiator();
        ProposeRouteWorkflowInstantiator l_ProposeRouteWorkflowInstantiator=new ProposeRouteWorkflowInstantiator();

        l_AuthenticationWorkflowInstantiator.link();
        l_AuthenticationWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_AuthenticationWorkflowInstantiator.workflow);

        l_DevelopRoutePlanSimpleWorkflowInstantiator.link();
        l_DevelopRoutePlanSimpleWorkflowInstantiator.bind(l_AuthenticationWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_DevelopRoutePlanSimpleWorkflowInstantiator.workflow);

        l_DevelopRoutePlanMediumWorkflowInstantiator.link();
        l_DevelopRoutePlanMediumWorkflowInstantiator.bind(l_AuthenticationWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_DevelopRoutePlanMediumWorkflowInstantiator.workflow);

        l_DevelopRoutePlanComplexWorkflowInstantiator.link();
        l_DevelopRoutePlanComplexWorkflowInstantiator.bind(l_ProposeRouteWorkflowInstantiator);
        reactiveWorkflowSystem.addWorkflow(l_DevelopRoutePlanComplexWorkflowInstantiator.workflow);

        l_ProposeRouteWorkflowInstantiator.link();
        l_ProposeRouteWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_ProposeRouteWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}
