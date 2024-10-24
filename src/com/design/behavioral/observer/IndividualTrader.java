package com.design.behavioral.observer;

import com.dataStructures.hashMap.HashMap;

public class IndividualTrader implements Observer{
    @Override
    public void receiveUpdate(HashMap<String, Integer> map) {
        System.out.println("Individual trader update");
    }
}
