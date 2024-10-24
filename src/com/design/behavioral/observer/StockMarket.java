package com.design.behavioral.observer;

import com.dataStructures.hashMap.HashMap;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements ISubject, IStockBusiness{

    //have information about list of stocks and their prices.
    HashMap<String, Integer> prices;

    List<Observer> subscriberList;

    public StockMarket() {
        this.subscriberList = new ArrayList<>();
        this.prices = new HashMap<>();
    }

    @Override
    public void addSubscribers(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void removeSubscribers(Observer observer) {
        subscriberList.stream().filter(curObs -> curObs.equals(observer)).toList();
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : subscriberList){
            observer.receiveUpdate(prices);
        }
    }

    @Override
    public void updateStockPrice(String stock, Integer price) {
        prices.put(stock,price);
        notifySubscribers();
    }

    @Override
    public void refreshStocks() {
        prices = new HashMap<>();
        notifySubscribers();
    }
}
