package com.design.behavioral.iterator;

public interface AggregateInterface<T> {
    Iterator<T> createIterator();
}
