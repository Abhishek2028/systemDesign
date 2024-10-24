package com.design.structural.composite;

import com.design.structural.composite.composite.Army;
import com.design.structural.composite.leaves.AirForceDivision;
import com.design.structural.composite.leaves.MilitaryDivision;
import com.design.structural.composite.leaves.NavyDivision;

public class CompositeDemo {
    public static void main(String args[]){
        Army army = new Army();
        Department div1 = new AirForceDivision();
        Department div2 = new NavyDivision();
        Department div3 = new MilitaryDivision();
        army.addDivision(div1);
        army.addDivision(div2);
        army.addDivision(div3);
        army.printName();
    }
}
