package com.dataStructures.linkedList;

public class ListNodeMain {
    public static void main(String args[]){
        ListNode head = null;
        head = insertNode(head,10);
        head = insertNode(head,20);
        head = insertNode(head,30);
        System.out.println(getLength(head));
        printList(head);
        insertAtPos(head,2,15);
        printList(head);
        removeNode(head,15);
        printList(head);
    }

    public static void printList(ListNode head){
        System.out.println("\n");
        ListNode iter = head;
        while(iter != null){
            System.out.print(iter.val + "->");
            iter = iter.next;
        }
        return;
    }

    public static ListNode insertNode(ListNode head, int val){
        if(head==null){
            head = new ListNode(val);
            return head;
        }
        ListNode iter = head;
        while(iter.next !=null){
            iter = iter.next;
        }
        iter.next = new ListNode(val);
        return head;
    }

    public static ListNode removeNode(ListNode head, int val){
        if(head==null){
            return null;
        }
        ListNode iter = head;
        ListNode prev = null;
        while(iter.next !=null && iter.val!= val){
            prev = iter;
            iter = iter.next;
        }
        prev.next = iter.next;
        return head;
    }

    public static ListNode insertAtPos(ListNode head, int pos, int val){
        ListNode iter = head;
        ListNode prev = null;
        while(pos-- > 1 && iter.next !=null){
            prev = iter;
            iter = iter.next;
        }
        prev.next = new ListNode(val);
        prev = prev.next;
        prev.next = iter;
        return head;
    }

    public static int getLength(ListNode head){
        int len = 0;
        ListNode iter = head;
        while(iter!=null){
            iter = iter.next;
            len++;
        }
        return len;
    }
}
