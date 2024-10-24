package com.design.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

//The client that uses the flyweight
public class Forest {

    List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, String type, String texture){
        TreeType treeType = TreeTypeFactory.getTreeTypeFlyweight(name,type,texture);
        Tree newTree = new Tree(x,y,treeType);
        treeList.add(newTree);
    }

    public void drawTrees(){
        for(Tree tree: treeList){
            tree.draw();
        }
    }

}
