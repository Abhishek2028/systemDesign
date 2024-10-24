package com.design.behavioral.command;

public class OrderProcessor {


    void act(String order){
        System.out.println("Actioned on the order "+ order);
    }

    void delete(String order){
        System.out.println("Deleted the order"  + order);
    }

    void update(String order){
        System.out.println("Updated the order "+ order);
    }

}
