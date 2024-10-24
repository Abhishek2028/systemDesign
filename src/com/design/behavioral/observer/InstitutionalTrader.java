package com.design.behavioral.observer;

import com.dataStructures.hashMap.HashMap;

public class InstitutionalTrader implements Observer{
    @Override
    public void receiveUpdate(HashMap<String, Integer> map) {
        System.out.println("Received update by Instituitional trader");
    }
}
