package com.design.structural.bridge;

public class TelevisionDevice implements Device{
    
    Television television;

    public TelevisionDevice(Television television) {
        this.television = television;
    }

    @Override
    public String getVolume() {
        return "The volume of the current television is "+television.getVolume();
    }

    @Override
    public String increaseVolume() {
        television.setVolume(television.getVolume()+1);
        return "The volume is of television"+ television.getVolume();
    }

    @Override
    public String decreaseVolume() {
        television.setVolume(television.getVolume()-1);
        return "The volume is of television"+ television.getVolume();
    }

    @Override
    public String powerOn() {
        if(television.getPowerOn()){
            television.setPowerOn(false);
            return "The television was turned ON, now turned OFF";
        } else {
            television.setPowerOn(true);
            return "The television was turned OF, now turned ON";
        }
    }
}
