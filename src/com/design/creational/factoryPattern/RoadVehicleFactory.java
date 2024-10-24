package com.design.creational.factoryPattern;

import com.design.creational.factoryPattern.roadvehicles.Bike;
import com.design.creational.factoryPattern.roadvehicles.Car;
import com.design.creational.factoryPattern.roadvehicles.Truck;

public class RoadVehicleFactory extends VehicleFactory{
    @Override
    Motorvehicle getVehicle(String vehicleName) {
        if(vehicleName.equals("BIKE")){
            return new Bike();
        } else if(vehicleName.equals("CAR")){
            return new Car();
        }
        return new Truck();
    }
}
