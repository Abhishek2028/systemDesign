package com.lowLevelDesign.notifyMe;

public class MailObserver implements Observer{
    @Override
    public void receiveNotification(String notification) {
        System.out.println("Mail Notification "+ notification);
    }
}


//Let's say mailObserver
