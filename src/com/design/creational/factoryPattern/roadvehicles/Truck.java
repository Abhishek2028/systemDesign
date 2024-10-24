package com.design.creational.factoryPattern.roadvehicles;

import com.design.creational.factoryPattern.Motorvehicle;

public class Truck implements Motorvehicle {
    @Override
    public void build() {
        System.out.println("THis is a truck");
    }
}
