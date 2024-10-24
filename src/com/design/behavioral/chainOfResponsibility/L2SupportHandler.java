package com.design.behavioral.chainOfResponsibility;

public class L2SupportHandler extends AbstractHandler {


    @Override
    public void handleRequest(String data) {
        if (data.equals("L2")) {
            System.out.println("Handled by L2 support");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(data);
        }
    }
}
