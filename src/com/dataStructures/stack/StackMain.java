package com.dataStructures.stack;

public class StackMain {
    public static void main(String args[]){
        Stack s = new Stack();
        s.put(5);
        s.put(10);
        s.put(15);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
