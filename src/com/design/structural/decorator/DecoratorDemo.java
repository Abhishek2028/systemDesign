package com.design.structural.decorator;

public class DecoratorDemo {
    public static void main(String args[]){
        Message plainTextMessage = new PlainTextMessage();
        plainTextMessage = new EncryptionDecorator(plainTextMessage);
        plainTextMessage = new CompressionDecorator(plainTextMessage);
        plainTextMessage = new FormattingDecorator(plainTextMessage);
        plainTextMessage = new EncryptionDecorator(plainTextMessage);
        String msg1 = plainTextMessage.readMessage();
        System.out.println(msg1);
    }
}

//Have a common interface, so that we can treat the object we are decorating and the decorators as the same pattern.
//Message interface -> The parent for everything.
//Abstract BaseMessageDecorator -> The abstract decorator.
//CompressionDecorator -> The decoraotor to add compression.
//Same for other decorators.