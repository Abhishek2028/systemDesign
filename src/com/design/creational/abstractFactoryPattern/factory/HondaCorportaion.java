package com.design.creational.abstractFactoryPattern.factory;

import com.design.creational.abstractFactoryPattern.ElectricVehicle;
import com.design.creational.abstractFactoryPattern.Honda.HondaElectricVehicle;
import com.design.creational.abstractFactoryPattern.Honda.HondaMotorVehicle;
import com.design.creational.abstractFactoryPattern.Motorvehicle;

public class HondaCorportaion extends Corporation{
    @Override
    public Motorvehicle createMotorVehicle() {
        return new HondaMotorVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new HondaElectricVehicle();
    }
}
