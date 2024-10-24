package com.design.creational.factoryPattern;

import com.design.creational.factoryPattern.seavehicle.Ferry;
import com.design.creational.factoryPattern.seavehicle.SpeedBoat;

public class SeaVehicleFactory extends VehicleFactory {

    @Override
    Motorvehicle getVehicle(String vehicleName) {
        if (vehicleName.equals("FERRY")) {
            return new Ferry();
        }
        return new SpeedBoat();
    }
}
