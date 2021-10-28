package org.kie.kogito.incubation.events.processes;

public interface ProcessServiceEventListener {
    // before|after:
    //    process started
    //    process completed
    //    node triggered
    //    node left
    //    variable changed
    //    SLA violated
    // on:
    //    signal
    //    message
}
