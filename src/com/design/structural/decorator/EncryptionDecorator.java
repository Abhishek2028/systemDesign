package com.design.structural.decorator;

public class EncryptionDecorator extends BaseMessageDecorator{
    public EncryptionDecorator(Message message) {
        super(message);
    }

    @Override
    public String readMessage() {
        return message.readMessage() + "ENCRYPTION DECORATOR";
    }
}
