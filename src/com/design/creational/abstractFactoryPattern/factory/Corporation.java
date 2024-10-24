package com.design.creational.abstractFactoryPattern.factory;

import com.design.creational.abstractFactoryPattern.ElectricVehicle;
import com.design.creational.abstractFactoryPattern.Motorvehicle;

public abstract class Corporation {
    public abstract Motorvehicle createMotorVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
