package com.Shefali;

import java.util.Arrays;

public class QueueWithTwoStacks {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();

    public void enqueue(int item) {
        s1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        moveStack1ToStack2();
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        moveStack1ToStack2();
        return s2.peek();
    }

    private void moveStack1ToStack2() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

}
