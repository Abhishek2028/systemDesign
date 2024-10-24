package com.design.behavioral.command;

public class UpdateCommand implements Command{
    String order;
    OrderProcessor orderProcessor;

    public UpdateCommand(OrderProcessor orderProcessor,String order) {
        this.orderProcessor = orderProcessor;
        this.order = order;
    }

    @Override
    public void actionOnOrder() {
        orderProcessor.update(order);
    }
}
