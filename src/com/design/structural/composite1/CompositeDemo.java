package com.design.structural.composite1;

import java.util.Arrays;

public class CompositeDemo {

    public static void main(String args[]){
        Circle circle = new Circle();
        Square square = new Square();
        Trapezium trapezium = new Trapezium();
        Rectangle rectangle = new Rectangle(Arrays.asList(square,trapezium));
        MultiShape multiShape = new MultiShape(Arrays.asList(circle,rectangle));
        multiShape.draw();
    }
}
