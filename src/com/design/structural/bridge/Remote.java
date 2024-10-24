package com.design.structural.bridge;

//The abstraction.
//The abstraction relies on the methods of it's implementation i.e here, it is the device.
public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    abstract String togglePower();

    abstract String toggleVolumeDown();

    abstract String toggleVolumeUp();


}
