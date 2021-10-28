package org.kie.kogito.incubation.events.decisions;

public interface DMNEvent {
    // DMNResult getResult() // do we need this in the event?
                             // note: will become a DataContext (possibly a subtype?)


    // these seems to be from the spec
    // do we need this grain?
    //  - DecisionNode
    //  - DecisionServiceNode
    //  - BusinessKnowledgeModelNode
    //
    // we can probably substitute these by an identifier
    // users will be able to get that value from the engine with a separate method
    //
    // e.g. /decisions/$dmn_id/nodes/node-name
    // or   /decisions/$dmn_id/decision-node/node-name
    // or   /decisions/$dmn_id/nodes/decision-node/node-name

    // EvaluateDecisionEvent
    // BEFORE | AFTER
    //    DecisionNode getDecision() // result type + decision --> candidate ID

    // BKMEvent
    //     BusinessKnowledgeModelNode getBusinessKnowledgeModel(); // result type + BKM --> candidate ID

    // InvokeBKMEvent
    // BEFORE|AFTER
    //     BusinessKnowledgeModelNode getBusinessKnowledgeModel(); // result type + BKM --> candidate ID
    // BEFORE
    //    default List<Object> getInvocationParameters() --> candidate Map/JSON object?
    // AFTER
    //    Object getInvocationResult()

    // EvaluateContextEntryEvent
    // BEFORE|AFTER:
    //    String getNodeName();
    //    String getVariableName();
    //    String getVariableId();
    //    String getExpressionId();
    //  AFTER:
    //    Object getExpressionResult  // do we need this?

    // EvaluateDecisionTableEvent
    // BEFORE|AFTER:
    //    String getNodeName();
    //    String getDecisionTableName();
    // AFTER:
    //    List<Integer> getMatches();
    //    List<Integer> getSelected();

    // EvaluateDecisionServiceEvent
    // BEFORE|AFTER
    //    DecisionServiceNode getDecisionService(); // result type + decision service --> candidate ID


    // EvaluateAllEvent
    // BEFORE|AFTER
    //    String getModelNamespace();
    //    String getModelName();


}
