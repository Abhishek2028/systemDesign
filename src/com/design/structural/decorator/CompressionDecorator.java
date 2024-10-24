package com.design.structural.decorator;

public class CompressionDecorator extends BaseMessageDecorator{
    public CompressionDecorator(Message message) {
        super(message);
    }

    @Override
    public String readMessage() {
        return message.readMessage() + "COMPRESSION ADDED";
    }
}
