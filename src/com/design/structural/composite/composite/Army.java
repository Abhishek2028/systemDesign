package com.design.structural.composite.composite;

import com.design.structural.composite.Department;

import java.util.ArrayList;
import java.util.List;

public class Army implements Department {

    public Army(){
        divisionList = new ArrayList<>();
    }

    private List<Department> divisionList;

    @Override
    public void printName() {
        for(int i=0;i<divisionList.size();i++){
            divisionList.get(i).printName();
        }
    }

    public void addDivision(Department department){
        this.divisionList.add(department);
    }

}
