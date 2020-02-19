package com.Shefali;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    private boolean IsEmpty() {
        return count == 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (IsEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = (first);
            first = node;
        }
        count++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (IsEmpty()) {
            first = last = node;
        } else {
            last.next = (node);
            last = node;
        }
        count++;
    }

    public void deleteFirst() {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        if (count == 1) {
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        count--;
    }

    public void deleteLast() {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        if (count == 1) {
            first = last = null;
        } else {
            Node currentNode = first;
            for (int i = 0; currentNode.next != last; i++) {
                currentNode = currentNode.next;
            }
            last = currentNode;
        }
        count--;
    }

    public boolean contains(int value) {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        if (indexOf(value) != -1)
            return true;

        return false;
    }

    public int indexOf(int value) {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        Node currentNode = first;
        for (int i = 0; i < count; i++) {
            if (currentNode.value == value)
                return i;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int size() {
        return count;
    }

    public int[] toArray() {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        int[] array = new int[count];
        Node currentNode = first;
        for (int i = 0; i < count; i++) {
            array[i] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public void reverse() {
        /*int[] intArray = this.toArray();
        int[] reverseArray = new int[count];
        for (int i = count - 1, j = 0; i > -1; i--, j++) {
            reverseArray[j] = intArray[i];
        }
        first = new Node(reverseArray[0]);
        if (count == 1) {
            last = first;
        } else {
            Node currentThread = first;
            for (int i = 1; i < count; i++) {
                Node node = new Node(reverseArray[i]);
                currentThread.next = node;
                currentThread = node;
            }
            last = currentThread;
        }*/
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        Node previous = first;
        Node current = first.next;
        Node n;
        for (int i = 0; current != null; i++) {
            n = current.next;
            current.next = previous;
            previous = current;
            current = n;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        if (k <= count) {
            Node target = first;
            Node nextTarget = first;
            for (int i = 0; i < k - 1; i++) {
                nextTarget = nextTarget.next;
            }

            for (int i = 0; nextTarget != last; i++) {
                target = target.next;
                nextTarget = nextTarget.next;
            }
            return target.value;
        }
        return -1;
    }

    public String printMidldle() {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }
        Node targetFirst = first;
        Node targetSecond = first;

        for (int i = 0; targetSecond != last && targetSecond.next != last; i++) {
            targetFirst = targetFirst.next;
            targetSecond = targetSecond.next.next;
        }

        if (targetSecond == last)
            return Integer.toString(targetFirst.value);
        else
            return Integer.toString(targetFirst.value) + " , " + Integer.toString(targetFirst.next.value);
    }

    public boolean hasLoop() {
        if (IsEmpty()) {
            throw new NoSuchElementException("There is no value in the Linked List");
        }

        Node slow = first;
        Node fast = first;
        for (int i = 0; slow != null && fast != null && fast.next != null; i++) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public void createWithLoop(){
        last.next = first;
    }
}
