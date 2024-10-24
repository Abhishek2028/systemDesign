package com.dataStructures.hashMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashMap<K extends Comparable<K>,V> {
    List<List<Pair<K,V>>> map;

    public HashMap(){
        this.map = new ArrayList<>();
        for(int i=0;i<10;i++){
            this.map.add(new ArrayList<Pair<K,V>>());
        }
    }

    public void putIfAbsent(K key, V value){
        if(get(key) == null){
            put(key,value);
        }
    }

    public void put(K key,V value ){
        int hashLocation = getHash(key );
        this.map.get(hashLocation).add(new Pair<>(key,value));
    }

    public V get(K key){
        int hashLocation = getHash(key);
        Iterator<Pair<K,V>> iterator = this.map.get(hashLocation).iterator();
        while(iterator.hasNext()){
            Pair<K,V> currPair = iterator.next();
            if(currPair.first.equals(key)){
                return currPair.second;
            }
        }
        return null;
    }

    public int getHash(K key){
        if(key instanceof Integer){
            return (Integer)key%10;
        }
        return -1;
    }

}
