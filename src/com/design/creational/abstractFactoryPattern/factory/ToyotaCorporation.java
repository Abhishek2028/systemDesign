package com.design.creational.abstractFactoryPattern.factory;

import com.design.creational.abstractFactoryPattern.ElectricVehicle;
import com.design.creational.abstractFactoryPattern.Motorvehicle;
import com.design.creational.abstractFactoryPattern.Toyota.ToyotaElectricVehicle;
import com.design.creational.abstractFactoryPattern.Toyota.ToyotaMotorVehicle;

public class ToyotaCorporation extends Corporation{
    @Override
    public Motorvehicle createMotorVehicle() {
        return new ToyotaMotorVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ToyotaElectricVehicle();
    }
}
