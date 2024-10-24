package com.design.structural.bridge;

public class Television {

    Integer volume;

    Boolean isPowerOn;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(Boolean powerOf) {
        isPowerOn = powerOf;
    }

    public Television(Integer volume, Boolean isPowerOf) {
        this.volume = volume;
        this.isPowerOn = isPowerOf;
    }
}
