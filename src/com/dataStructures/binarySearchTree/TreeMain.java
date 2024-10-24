package com.dataStructures.binarySearchTree;

import com.dataStructures.TreeNode;

import java.util.*;

public class TreeMain {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(100,2,10004,123,1,23,45,74,5,6,7,8,9,02,33,44,6,777,9);
        Set<Integer> s1 = new HashSet<>(arr);
        Tree tree = new Tree(arr);
        tree.inorderTraversal();
        Tree tree1 = new Tree(s1);
//        tree1.inorderTraversal();
//        tree.insertNode(1222343434);
//        tree.inorderTraversal();
//        System.out.println(tree.findNode(1222343434));
//        tree.preorderTraversal();
        tree.deleteNode(123);
        tree.inorderTraversal();
    }
}
