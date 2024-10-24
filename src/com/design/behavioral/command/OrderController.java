package com.design.behavioral.command;

import java.util.Iterator;

public class OrderController {
    public static void main(String args[]){
        OrderProcessor orderProcessor = new OrderProcessor();
        Command orderCommand = new OrderCommand("Order1", orderProcessor);
        Command cancelCommand = new CancelCommand(orderProcessor,"ORDER2");
        Command updateCommand = new UpdateCommand(orderProcessor,"ORDER3");
        orderCommand.actionOnOrder();
        cancelCommand.actionOnOrder();
        updateCommand.actionOnOrder();
    }
}

//Order Processing System:
//Commands: PlaceOrder, CancelOrder, ShipOrder.
//Receiver: OrderProcessor.
//Invoker: OrderController.

//Place the orders.