package com.design.structural.flyweight;

//The intrinsic data of the tree.
//The reference object to which we pass our information.
public class ConcreteTreeType implements TreeType{

    String treeName;
    String treeType;
    String texture;

    public ConcreteTreeType(String treeName, String treeType, String texture) {
        this.treeName = treeName;
        this.treeType = treeType;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a tree with the coordinates " +
                "" + x + " "+y+" with the texture "+ texture + " treeName  "+treeName+ " treeType "+treeType);
    }
}
