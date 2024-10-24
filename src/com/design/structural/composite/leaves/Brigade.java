package com.design.structural.composite.leaves;

import com.design.structural.composite.Department;

public class Brigade implements Department {
    @Override
    public void printName() {
        System.out.println("In the brigade Department");
    }
}
