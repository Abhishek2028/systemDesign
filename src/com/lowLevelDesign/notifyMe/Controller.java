package com.lowLevelDesign.notifyMe;

public class Controller {
    public static void main(String[] args) {
        Observer mailObs = new MailObserver();
        Observer appObs = new AppObserver();
        ObservationManager observationManager = new ObservationManager();
        observationManager.addObserver(mailObs);
        observationManager.addObserver(appObs);
        WebPage webPage = new WebPage(1,"MyBlog",observationManager);
        webPage.observationManager.sendNotifications("Notification 1");
    }
}

//Subscriber
//Concrete subscribers
//Subject