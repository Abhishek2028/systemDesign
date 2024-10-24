package com.design.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class IteratorDemo {

    public static void main(String args[]){
        List<String> names = Arrays.asList("Abhishek", "Kaki", "Kumar");
        AggregateInterface<String> namesAggregate = new ConcreteNamesAggregate(names);
        Iterator<String> iterator = namesAggregate.createIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}

//We have a list of Strings.
//Need to create an iterator to iterate over the List
//As per the iterator pattern's design, we have the following components.
//1. Iterator interface : The interface that defines all methods provided by the iterator.
//2. Concrete iterator : Implentation/
//3. Aggregate interface : The class which provides a createIterator interface.
//4. Concrete aggregaotor.