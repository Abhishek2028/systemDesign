package com.design.structural.composite.leaves;

import com.design.structural.composite.Department;

import java.util.HashMap;

public class AirForceDivision implements Department {

    HashMap<Integer,Integer> map = new HashMap<>();
    @Override
    public void printName() {
        map.put(0,0);
        System.out.println("Inside Airforce division");
    }
}
