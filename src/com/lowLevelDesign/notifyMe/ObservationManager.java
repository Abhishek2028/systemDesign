package com.lowLevelDesign.notifyMe;

import java.util.ArrayList;
import java.util.List;

public class ObservationManager {
    List<Observer> observerList;

    public ObservationManager() {
        this.observerList = new ArrayList<>();
    }

    void addObserver(Observer observer){
        observerList.add(observer);
    }

    void clearObservers(){
        observerList = new ArrayList<>();
    }

    void sendNotifications(String notification){
        for(Observer observer : observerList){
            observer.receiveNotification(notification);
        }
    }

}
