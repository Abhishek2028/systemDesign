package com.design.behavioral.command;

public class OrderCommand implements Command{

    public OrderCommand(String order, OrderProcessor orderProcessor) {
        this.order = order;
        this.orderProcessor = orderProcessor;
    }

    String order;

    OrderProcessor orderProcessor;

    @Override
    public void actionOnOrder() {
        orderProcessor.act(order);
    }
}
