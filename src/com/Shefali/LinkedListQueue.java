package com.Shefali;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListQueue {
    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public void enqueue(int item) {
        if (count == 0) {
            head = new Node(item);
            tail = head;
            return;
        }

        tail.next = new Node(item);

    }

    public int dequeue() {
        if (count == 0) {
            throw new IllegalStateException("No elements in the queue");
        }
        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        } else {
            value = head.value;
            Node second = head.next;
            head.next = null;
            head = second;
        }
        count--;
        return value;
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException("No elements in the queue");
        }
        return head.value;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        ArrayList<Integer> ar = new ArrayList<>();
        Node current = head;
        while (current != null) {
            ar.add(current.value);
            current = current.next;
        }
        return ar.toString();
    }
}
