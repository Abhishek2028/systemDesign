package com.lowLevelDesign.notifyMe;

public class WebPage {
    int address;
    String content;
    ObservationManager observationManager;

    public WebPage(int address, String content, ObservationManager observationManager) {
        this.address = address;
        this.content = content;
        this.observationManager = observationManager;
    }

    void sendNotification(String notification){
        this.observationManager.sendNotifications(notification);
    }

}
