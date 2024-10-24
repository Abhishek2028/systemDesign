package com.dataStructures;

public class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
