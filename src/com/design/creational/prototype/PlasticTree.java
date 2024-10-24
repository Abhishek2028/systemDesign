package com.design.creational.prototype;

public class PlasticTree implements Tree{

    public Integer getHeight() {
        return height;
    }

    public Integer getMass() {
        return mass;
    }

    public Integer getWidth() {
        return width;
    }

    Integer height;
    Integer mass;
    Integer width;

    public PlasticTree(Integer height, Integer mass, Integer width) {
        this.height = height;
        this.mass = mass;
        this.width = width;
    }

    @Override
    public Tree copy() {
        Tree clonePineTree = new PlasticTree(this.height,this.mass,this.width);
        return clonePineTree;
    }
}
