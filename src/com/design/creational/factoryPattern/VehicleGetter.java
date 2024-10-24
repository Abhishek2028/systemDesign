package com.design.creational.factoryPattern;

public class VehicleGetter {

    public static void main(String args[]){
        SeaVehicleFactory seaVehicleFactory = new SeaVehicleFactory();
        RoadVehicleFactory roadVehicleFactory = new RoadVehicleFactory();
        Motorvehicle roadVehicle = roadVehicleFactory.getVehicle("BIKE");
        roadVehicle.build();
        Motorvehicle seaVehicle = seaVehicleFactory.getVehicle("CRUISE");
        seaVehicle.build();
    }

}
