package com.design.behavioral.iterator;

import java.util.List;

public class PersonIterator implements Iterator<Person>{

    List<Person> personList;
    int position;

    public PersonIterator(List<Person> personList, int position) {
        this.personList = personList;
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        return position<personList.size();
    }

    @Override
    public Person next() {
        if(hasNext()){
            return personList.get(position++);
        }
        return null;
    }
}
