package com.design.behavioral.iterator;

import java.util.List;

public class PersonAggregate implements AggregateInterface<Person>{

    List<Person> personList;

    public PersonAggregate(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public Iterator<Person> createIterator() {
        return new PersonIterator(personList,0);
    }
}
