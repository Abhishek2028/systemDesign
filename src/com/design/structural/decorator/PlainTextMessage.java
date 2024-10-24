package com.design.structural.decorator;

public class PlainTextMessage implements Message{
    @Override
    public String  readMessage() {
        return "THE PLAIN TEXT MESSAGE";
    }

}
