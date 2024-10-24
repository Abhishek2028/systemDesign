package com.design.behavioral.chainOfResponsibility;

public abstract class AbstractHandler {
    AbstractHandler nextHandler;

    protected final void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String data);

}
