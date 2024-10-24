package com.design.behavioral.iterator;

import java.util.List;

public class NamesIterator implements Iterator<String>{

    List<String> names;
    int position;

    public NamesIterator(List<String> names, int position) {
        this.names = names;
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        return position < names.size();
    }

    @Override
    public String next() {
        if(hasNext()){
            return names.get(position++);
        }
        return null;
    }
}
