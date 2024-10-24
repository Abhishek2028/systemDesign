package com.design.behavioral.observer;

import com.dataStructures.hashMap.HashMap;

public class MFTrader implements Observer{
    @Override
    public void receiveUpdate(HashMap<String, Integer> map) {
        System.out.println("Bank trader");
    }
}
