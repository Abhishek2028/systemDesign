package com.design.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

//The flyweight factory
public class TreeTypeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeTypeFlyweight(String name, String type, String texture){
        String key = name+"-"+type+"-"+texture;
        TreeType treeType = treeTypeMap.get(key);
        if(treeType == null){
            TreeType newTreeType = new ConcreteTreeType(name,type,texture);
            treeType = newTreeType;
        }
        return treeType;
    }

}
