package com.design.structural.decorator;

public abstract class BaseMessageDecorator implements Message{

    Message message;

    public BaseMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String readMessage() {
        return message.readMessage();
    }
}
