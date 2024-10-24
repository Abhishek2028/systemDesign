package com.design.structural.composite.leaves;

import com.design.structural.composite.Department;

public class Squad implements Department {
    @Override
    public void printName() {
        System.out.println("Inside a squad");
    }
}
