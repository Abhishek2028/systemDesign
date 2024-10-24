package com.dataStructures.doublyLinkedList;

public class DoubleListMain {
    public static void main(String args[]) {
        ListNode head = insertNode(null, 10);
        insertNode(head, 20);
        insertNode(head, 30);
        insertNode(head, 40);
        printList(head);
        insertAtPos(head,2,50);
        printList(head);
        insertAtPos(head,4,75);
        printList(head);
        insertAtPos(head,7,150);
        printList(head);
        insertAtPos(head,1,10000);
        printList(head);
    }

    public static ListNode insertNode(ListNode head, int val) {
        if (head == null) {
            head = new ListNode(val);
            return head;
        }
        ListNode iter = head;
        while (iter.next != null) {
            iter = iter.next;
        }
        ListNode newNode = new ListNode(val);
        iter.next = newNode;
        newNode.prev = iter;
        return head;
    }

    public static ListNode insertAtPos(ListNode head, int pos, int val) {
        if (head == null || pos < 0) {
            head = new ListNode(val);
            return head;
        }
        ListNode iter = head;
        ListNode prev = null;
        for(int i=0;i<pos-2;i++) {
            iter = iter.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = iter.next;
        iter.next = newNode;
        newNode.prev = iter;
        return head;
    }

    public static void printList(ListNode head) {
        System.out.println("\n");
        ListNode iter = head;
        while (iter != null) {
            System.out.print(iter.val + "->");
            iter = iter.next;
        }
        return;
    }


}
