package com.design.behavioral.mediator;

public class Attendee extends Participant{


    public Attendee(String name, EventCoordinator coordinator) {
        super(name, coordinator);
    }

    void registerToEvent(){
        coordinator.register(this);
    }

    void cancelRegistration(){
        //coordinator.cancelRegistration(name);
    }

}

//An attendee can register or unregister