package com.design.creational.factoryPattern.seavehicle;

import com.design.creational.factoryPattern.Motorvehicle;

public class SpeedBoat implements Motorvehicle {
    @Override
    public void build() {
        System.out.println("This is a speedboat");
    }
}
