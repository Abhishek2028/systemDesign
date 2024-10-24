package com.design.structural.decorator;

public class FormattingDecorator extends BaseMessageDecorator{
    public FormattingDecorator(Message message) {
        super(message);
    }

    @Override
    public String readMessage() {
        return message.readMessage() + "FORMATTING ADDED";
    }
}
