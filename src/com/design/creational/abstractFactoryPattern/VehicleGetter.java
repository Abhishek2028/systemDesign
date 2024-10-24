package com.design.creational.abstractFactoryPattern;

/*
We need factories that can return us vehicles of type combustion or electrical
 */

import com.design.creational.abstractFactoryPattern.factory.Corporation;
import com.design.creational.abstractFactoryPattern.factory.HondaCorportaion;
import com.design.creational.abstractFactoryPattern.factory.ToyotaCorporation;

public class VehicleGetter {
    public static void main(String args[]){
        Corporation hondacorp = new HondaCorportaion();
        Corporation toyotacorp = new ToyotaCorporation();
        Motorvehicle motor = hondacorp.createMotorVehicle();
        motor.build();
        motor = toyotacorp.createMotorVehicle();
        motor.build();
        ElectricVehicle elec = hondacorp.createElectricVehicle();
        elec.build();
        elec = toyotacorp.createElectricVehicle();
        elec.build();
    }
}
