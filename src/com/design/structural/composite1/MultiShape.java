package com.design.structural.composite1;

import java.util.List;

public class MultiShape implements Graphic{

    List<Graphic> allShapes;

    public MultiShape(List<Graphic> allShapes) {
        this.allShapes = allShapes;
    }

    @Override
    public void draw() {
        allShapes.stream().forEach(shape -> shape.draw());
    }
}
