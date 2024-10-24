package com.design.creational.singleton;

public class Government {

    private static Government government = new Government();

    private Government(){}

    public static Government getInstance(){
        return government;
    }

    private int counter = 0;

    public void increment(){
        counter++;
        System.out.println("The counter is " +counter);
    }




}
