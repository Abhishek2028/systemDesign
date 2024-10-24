package com.design.creational.factoryPattern.seavehicle;

import com.design.creational.factoryPattern.Motorvehicle;

public class Ferry implements Motorvehicle {

    @Override
    public void build() {
        System.out.println("THis is a ferry");
    }
}
