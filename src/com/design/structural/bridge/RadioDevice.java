package com.design.structural.bridge;

//The concrete implementation
public class RadioDevice implements Device{

    Radio radio;

    public RadioDevice(Radio radio) {
        this.radio = radio;
    }

    @Override
    public String getVolume() {
        return "The volume of the current radio is "+radio.getVolume();
    }

    @Override
    public String increaseVolume() {
        radio.setVolume(radio.getVolume()+1);
        return "The volume is "+ radio.getVolume();
    }

    @Override
    public String decreaseVolume() {
        radio.setVolume(radio.getVolume()-1);
        return "The volume is "+ radio.getVolume();
    }

    @Override
    public String powerOn() {
        if(radio.getPowerOn()){
            radio.setPowerOn(false);
            return "The radio was turned ON, now turned OFF";
        } else {
            radio.setPowerOn(true);
            return "The radio was turned OF, now turned ON";
        }
    }
}
