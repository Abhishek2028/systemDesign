package com.design.creational.singleton;

public class SingletonGetter {
    public static void main(String args[]){
        Government government = Government.getInstance();
        government.increment();
        government.increment();
        government.increment();
        Government secondGovernment = Government.getInstance();
        secondGovernment.increment();
    }
}
