package org.kie.kogito.incubation.events.rules;

public class RuleUnitServiceEventListener {

    // ---------------------------
    // internal RuleEventListener
    // ---------------------------

    // before|after:
    //    MatchFire

    // on:
    //    DeleteMatch
    //    UpdateMatch


    // -------------------------
    // RuleRuntimeEventListener
    // -------------------------

    // on:
    //    ObjectInserted
    //       - FactHandle
    //       - Object
    //       - Rule        // candidate identifier: /rule-unit/$unit_id/rules/$name_of_rule
    //    ObjectUpdated
    //       - FactHandle
    //       - old Object
    //       - new Object
    //       - Rule
    //    ObjectDeleted
    //       - FactHandle
    //       - old Object
    //       - Rule



    // --------------------
    // AgendaEventListener
    // --------------------

    // on:
    //   match created
    //   match cancelled
    //   agenda group popped **
    //   agenda group pushed **

    // before|after:
    //   match fired
    //   rule flow group activated **
    //   rule flow group deactivated **


    // Match type:
    //    - Rule
    //    - List of Fact handles
    //    - list of objects
    //    - declaration ids ??      // list of declaration identifiers that are bound to the tuple that created this Match.
    //    - declaration value ( declaration Id ) // the bound declaration value for the given declaration identifier
}
