package com.design.behavioral.chainOfResponsibility;

public class DemoApplication {
    public static void main(String args[]){
        AbstractHandler l2Handler = new L2SupportHandler();
        AbstractHandler l3Handler = new L3SupportHandler();
        AbstractHandler l4Handler = new L4SupportHandler();
        l2Handler.setNextHandler(l3Handler);
        l3Handler.setNextHandler(l4Handler);
        l2Handler.handleRequest("L4");
    }
}
