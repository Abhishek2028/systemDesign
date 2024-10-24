package com.lowLevelDesign.notifyMe;

public class AppObserver implements Observer{
    @Override
    public void receiveNotification(String notification) {
        System.out.println("Application Observer "+ notification);
    }
}
