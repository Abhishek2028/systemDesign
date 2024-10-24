package com.design.structural.composite.leaves;

import com.design.structural.composite.Department;

public class NavyDivision implements Department {
    @Override
    public void printName() {
        System.out.println("In navy division");
    }
}
