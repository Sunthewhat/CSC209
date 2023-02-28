/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sll_lab;

/**
 *
 * @author sunthewhat
 */
public class SinglyLinkedList {
    SLLNode head, tail;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public void addToTail(int newValue) {
        // spacial case is when the list has no node
        // empty list
        if (head == null) {
            head = tail = new SLLNode(newValue, null);
        } else {
            tail.next = new SLLNode(newValue, null);
            // tail.next recieves the address of the new node

            tail = tail.next;// tail pointer points to the next node
            // tail stores the address of the new node
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int newValue) {
        // spacial case is when the list is isEmpty
        if (isEmpty()) {
            head = tail = new SLLNode(newValue, head);
        }

        else
            head = new SLLNode(newValue, head);
        // 1) create new node
        // 2) put value of newValue into the new node
        // 3) make the next of the new node pointing to the original head
        // 4) head points to the new node [head = . . .]
        // new node
        // head will point to the new node
    }

    public int deleteFromHead() {
        int firstInfo = head.info;

        // spacial case
        // list has only 1 node
        // list has no node
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return firstInfo;
    }

    public int deleteFromTail() {
        if (head == null)
            return -1;
        else if (head == tail) {
            int lastInfo = tail.info;
            head = tail = null;
            return lastInfo;
        }

        else {
            int lastInfo = tail.info;
            SLLNode temp;
            for (temp = head; temp.next != tail; temp = temp.next) {

            }
            temp.next = null;
            return lastInfo;
        }
    }

    public void printAllNodes() {
        for (SLLNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.info + "=>");
        }
        System.out.println(" end at null");
    }

    public int deleteIthNode(int i) {
        int pos = 0;
        SLLNode temp;
        for (temp = head; pos != i - 1; temp = temp.next, pos++)
            ;
        int ret = temp.next.info;
        temp.next = temp.next.next;
        return ret;
    }

    public void insertNodeInMiddle(int i, int newValue) {
        int pos = 0;
        SLLNode temp;
        for (temp = head; pos != i - 1; temp = temp.next, pos++)
            ;
        SLLNode tempnext = temp.next;
        temp.next = new SLLNode(newValue, null);
        temp.next.next = tempnext;

    }

    public int length() {
        int len = 0;
        for (SLLNode i = head; i != null; i = i.next) {
            len++;
        }
        return len;
    }

}
