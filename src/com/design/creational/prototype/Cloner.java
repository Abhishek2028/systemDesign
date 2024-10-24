package com.design.creational.prototype;

/*
Basically the references of the objects copied must be same.
Works only in case of mutable objects i.e whenever the reference is carried.
 */

public class Cloner {
    public static void main(String args[]){
        PineTree pinetree1 = new PineTree(10,2222,34);
        System.out.println(pinetree1);
        PineTree pinetreecloned = (PineTree) pinetree1.copy();
        System.out.println(pinetreecloned);
        if(pinetreecloned.getHeight() == pinetree1.getHeight()){
            System.out.println("Same references");
        }
    }
}
