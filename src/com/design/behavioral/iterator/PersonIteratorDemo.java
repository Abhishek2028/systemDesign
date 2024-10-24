package com.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonIteratorDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Alice", 25, Arrays.asList("Hiking", "Reading", "Cooking")));
        persons.add(new Person("Bob", 30, Arrays.asList("Cycling", "Music", "Gardening")));
        persons.add(new Person("Charlie", 28, Arrays.asList("Tech", "Gaming", "Photography")));
        persons.add(new Person("Diana", 35, Arrays.asList("Dancing", "Traveling", "Fitness")));
        persons.add(new Person("Edward", 40, Arrays.asList("Fishing", "Writing", "Collecting")));

        AggregateInterface<Person> aggregateInterface = new PersonAggregate(persons);
        Iterator<Person> personIterator = aggregateInterface.createIterator();
        System.out.println(personIterator.next().name);
        System.out.println(personIterator.next().name);
        System.out.println(personIterator.next().name);
        System.out.println(personIterator.next().name);
        System.out.println(personIterator.next().name);
        System.out.println(personIterator.next().name);
    }
}
