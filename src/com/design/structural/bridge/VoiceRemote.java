package com.design.structural.bridge;

//The concrete class of the abstraction
public class VoiceRemote extends Remote{

    public VoiceRemote(Device device) {
        super(device);
    }

    @Override
    String togglePower() {
        return device.powerOn();
    }

    @Override
    String toggleVolumeDown() {
        return device.decreaseVolume();
    }

    @Override
    String toggleVolumeUp() {
        return device.increaseVolume();
    }
}
