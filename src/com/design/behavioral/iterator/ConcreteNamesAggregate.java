package com.design.behavioral.iterator;

import java.util.List;

public class ConcreteNamesAggregate implements AggregateInterface<String>{

     List<String> names;

    public ConcreteNamesAggregate(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator<String> createIterator() {
        return new NamesIterator(names,0);
    }
}
