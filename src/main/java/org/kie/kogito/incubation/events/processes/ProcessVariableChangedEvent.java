package org.kie.kogito.incubation.events.processes;

public interface ProcessVariableChangedEvent extends ProcessEvent {
    // process instance
    // event date
    // kie runtime?

    // variable id
    // variable instance id (???)
    // old value
    // new value
    // tags (list)
}


// variable instance id
/*
 * The unique id of the process variable instance (as multiple node instances with the
 * same process variable definition exists).  This is an aggregation of the unique id of
 * the instance that contains the variable scope and the variable id.
 */
// this can be substituted with:
// /processes/$process_id/instances/$process_instance_id/variables/$variable_id
// it may be collapsed on "variable id" because it contains both pieces of info
