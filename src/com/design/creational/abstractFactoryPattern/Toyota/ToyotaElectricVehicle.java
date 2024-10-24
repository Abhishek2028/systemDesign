package com.design.creational.abstractFactoryPattern.Toyota;

import com.design.creational.abstractFactoryPattern.ElectricVehicle;

public class ToyotaElectricVehicle implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Electric vehicle by toyota");
    }
}
