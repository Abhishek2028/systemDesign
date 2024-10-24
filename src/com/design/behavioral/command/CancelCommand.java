package com.design.behavioral.command;

public class CancelCommand implements Command{

    String order;
    public CancelCommand(OrderProcessor orderProcessor,String order) {
        this.orderProcessor = orderProcessor;
        this.order = order;
    }

    OrderProcessor orderProcessor;

    @Override
    public void actionOnOrder() {
        orderProcessor.delete(order);
    }
}
