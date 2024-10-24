package com.design.creational.abstractFactoryPattern.Toyota;

import com.design.creational.abstractFactoryPattern.Motorvehicle;

public class ToyotaMotorVehicle implements Motorvehicle {
    @Override
    public void build() {
        System.out.println("Motor vehicle by Toyota");
    }
}
