package com.design.behavioral.chainOfResponsibility;

public class L4SupportHandler extends AbstractHandler {


    @Override
    public void handleRequest(String data) {
        if (data.equals("L4")) {
            System.out.println("Handled by L4 support");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(data);
        }
    }
}
