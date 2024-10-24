package com.design.behavioral.observer;

import com.dataStructures.hashMap.HashMap;

public interface Observer {
    void receiveUpdate(HashMap<String, Integer> map);
}
