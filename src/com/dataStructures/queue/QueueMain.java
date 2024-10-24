package com.dataStructures.queue;

import java.util.PriorityQueue;

public class QueueMain {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        Queue<Integer> q  = new Queue();
        System.out.println(q.getSize());
        q.put(5);
        q.put(10);
        q.put(15);
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
    }
}
