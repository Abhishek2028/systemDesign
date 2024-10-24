package com.design.behavioral.mediator;

public abstract class Participant {
    String name;
    EventCoordinator coordinator;

    public Participant(String name, EventCoordinator coordinator) {
        this.name = name;
        this.coordinator = coordinator;
    }

    public final void readMessage(String msg){
        System.out.println(this.getClass() + " received the message "+ msg);
    }

}
