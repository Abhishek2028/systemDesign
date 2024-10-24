package com.design.structural.flyweight;

public class FlyweightDemo {
    public static void main(String args[]){
        Forest forest = new Forest();
        forest.plantTree(1,2,"Oak","Brown","Mushy");
        forest.plantTree(3,7,"Banyan","Black","Hard");
        forest.plantTree(8,10,"Banyan","Black","Hard");
        forest.drawTrees();
    }

}

//We have a gaming application.
//Need to draw different kinds of trees.
//Each tree is represented using the following info. name, colour, texture, x-coord, y-coord.
//We have to render a 10000 trees. So, essentially we need to create a 10000 objects of trees containing all the
//above information.
//But if we observe, the name,colour and texture of all kinds of trees are the same.
//Only the xcord and ycord is unique.
//So, we try to create an object of TreeType and pass the reference of it to each Tree.
//Thus,10000 trees need to store 10000 x, 10000 y and 1 reference of TreeType.