package com.dataStructures.stack;


class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

//LIFO - Last in First Out
public class Stack {

    Node head;

    Stack(){
        this.head = null;
    }

    public void put(int val){
        if(head==null){
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return;
    }

    public int peek(){
        if(head!=null){
            return head.data;
        }
        return -1;
    }

    public int pop(){
        if(head==null){
            return -1;
        }
        int res = head.data;
        head = head.next;
        return res;
    }

}



//Best way to implement ?
//Use a linkedList.