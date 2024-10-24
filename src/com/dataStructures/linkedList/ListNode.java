package com.dataStructures.linkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){
        this.val = 0;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }


}
