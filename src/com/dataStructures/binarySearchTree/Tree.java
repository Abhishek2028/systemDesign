package com.dataStructures.binarySearchTree;

import com.dataStructures.TreeNode;

import java.util.*;

/*
This is a binary search tree. All APIs supported here are
1. Insert
2. Delete
3. Find
4. Inorder Traversal
5. Preorder traversal
6. Post order traversal
 */
public class Tree<T extends Comparable<T>> {
    TreeNode<T> root;

    public Tree(){
        this.root = null;
    }

    public Tree(T data) {
        this.root = new TreeNode<>(data);
    }

    public Tree(Collection<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            root = insert(root, iterator.next());
        }
        System.out.println(root);
    }

    public void insertNode(T val){
        insert(root,val);
    }

    public TreeNode insert(TreeNode<T> node, T val) {
        if (node == null) {
            return new TreeNode<>(val);
        } else {
            if (node.getData().compareTo(val) > 0) {
                node.left = insert(node.getLeft(), val);
            } else if (node.getData().compareTo(val) < 0) {
                node.right = insert(node.getRight(), val);
            }
        }
        return node;
    }

    public void deleteNode(T data) {
        delete(root,data);
    }

    public TreeNode<T> delete(TreeNode<T> node, T data){
        if(node==null){
            return null;
        }
        if(node.getData().compareTo(data) > 0){
            node.left = delete(node.left,data);
        } else if(node.getData().compareTo(data)<0){
            node.right = delete(node.right,data);
        } else {
            if(node.left == null){
                return node.right;
            } else if(node.right == null){
                return node.left;
            } else {
                TreeNode<T> toSwap = findMin(node.right);
                node.data = toSwap.data;
                node.right =  delete(node.right,toSwap.data);
            }
        }
        return node;
    }

    public TreeNode findMin(TreeNode node){
        if(node==null){
            return null;
        }
        if(node.left==null && node.right==null){
            return node;
        }
        return findMin(node.left);
    }





    public boolean findNode(T val) {
        if(root == null){
            return false;
        }
        if(root.getData().compareTo(val) == 0){
            return true;
        }
        if(root.getData().compareTo(val) < 0){
            //root is smaller,
            root = root.right;
            return findNode(val);
        } else if(root.getData().compareTo(val) > 0){
            //root is large
            root = root.left;
            return findNode(val);
        }
        return false;
    }

    public void inorderTraversal() {
        Stack<TreeNode>stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node !=null) {
            while(node !=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.print(node.data + "\t");
            node = node.right;
        }
    }

    public void preorderTraversal() {
        System.out.println("\n");
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while(!stack.isEmpty() || curr !=null){
            while(curr !=null) {
                stack.add(curr);
                curr = curr.left;
            }
        }
    }

    public void postOrderTraversal() {

    }


}
