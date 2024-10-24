package com.dataStructures.hashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.putIfAbsent(1,"One");
        hashMap.putIfAbsent(2,"Two");
        hashMap.putIfAbsent(3,"Three");
        hashMap.putIfAbsent(4,"Four");
        hashMap.putIfAbsent(5,"Five");
        hashMap.putIfAbsent(6,"Six");
        hashMap.putIfAbsent(7,"Seven");
        hashMap.putIfAbsent(8,"Eight");
        hashMap.putIfAbsent(9,"Nine");
        hashMap.putIfAbsent(10,"Ten");
        hashMap.putIfAbsent(11,"Eleven");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(11));
        System.out.println(hashMap.get(12));
        System.out.println(hashMap.get(10));
    }
}
