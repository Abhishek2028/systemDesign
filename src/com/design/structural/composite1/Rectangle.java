package com.design.structural.composite1;

import java.util.List;

public class Rectangle implements Graphic{

    List<Graphic> rectangles;

    public Rectangle(List<Graphic> rectangles) {
        this.rectangles = rectangles;
    }

    @Override
    public void draw() {
        rectangles.stream().forEach(rectangle -> rectangle.draw());
    }
}
