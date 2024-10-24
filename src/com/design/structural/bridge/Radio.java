package com.design.structural.bridge;

public class Radio {

    Integer volume;

    Boolean isPowerOn;

    public Radio(Integer volume, Boolean isPowerOn) {
        this.volume = volume;
        this.isPowerOn = isPowerOn;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(Boolean powerOn) {
        isPowerOn = powerOn;
    }
}
