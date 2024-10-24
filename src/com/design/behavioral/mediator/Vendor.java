package com.design.behavioral.mediator;

public class Vendor extends Participant{

    public Vendor(String name, EventCoordinator coordinator) {
        super(name, coordinator);
    }

    void advertise(String item){
        coordinator.advertise(item);
    }

}
