package com.design.creational.factoryPattern.roadvehicles;

import com.design.creational.factoryPattern.Motorvehicle;

public class Bike implements Motorvehicle {
    @Override
    public void build() {
        System.out.println("This is a bike");
    }
}
