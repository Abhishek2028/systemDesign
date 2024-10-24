package com.design.behavioral.observer;

public interface ISubject {
    void addSubscribers(Observer observer);
    void removeSubscribers(Observer observer);
    void notifySubscribers();
}
