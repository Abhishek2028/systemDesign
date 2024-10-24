package com.design.creational.abstractFactoryPattern.Honda;

import com.design.creational.abstractFactoryPattern.ElectricVehicle;

public class HondaElectricVehicle implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Electric vehicle from Honda");
    }
}
