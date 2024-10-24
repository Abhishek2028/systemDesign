package com.design.structural.flyweight;
//extrinsic state for each tree (e.g., coordinates
public class Tree {
    int x;
    int y;
    TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(){
        treeType.draw(x,y);
    }

}
