package com.dataStructures.doublyLinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        this.val = 0;
        next = null;
        prev = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
