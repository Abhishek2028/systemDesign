package com.design.creational.abstractFactoryPattern.Honda;

import com.design.creational.abstractFactoryPattern.Motorvehicle;

public class HondaMotorVehicle implements Motorvehicle {
    @Override
    public void build() {
        System.out.println("Motor vehicle by Honda");
    }
}
