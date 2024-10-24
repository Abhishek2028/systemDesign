package com.dataStructures.queue;

class Node<T> {
    T data;
    Node next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class Queue<T> {
    Node<T> head;
    Node<T> tail;
    int length;

    public Queue(){
        this.head = this.tail = null;
        this.length = 0;
    }

    //all apis -> size, put, dequeue, isEmpty().
    public void put(T data){
        length++;
        if(head==null){
            head = new Node<>(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
        return;
    }

    public T dequeue(){
        if(getSize() < 1){
            return null;
        }
        T res = null;
        if(head != null){
            res = head.data;
            length--;
        }
        head = head.next;
        return res;
    }

    public int getSize(){
        return this.length;
    }

    public boolean isEmpty(){
        return getSize() < 1;
    }

}
