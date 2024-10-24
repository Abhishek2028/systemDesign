package com.design.structural.composite.leaves;

import com.design.structural.composite.Department;

public class MilitaryDivision implements Department {
    @Override
    public void printName() {
        System.out.println("Education Department");
    }
}
