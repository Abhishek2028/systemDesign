package com.design.behavioral.chainOfResponsibility;

public class L3SupportHandler extends AbstractHandler {


    @Override
    public void handleRequest(String data) {
        if (data.equals("L3")) {
            System.out.println("Handled by L3 support");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(data);
        }
    }
}
