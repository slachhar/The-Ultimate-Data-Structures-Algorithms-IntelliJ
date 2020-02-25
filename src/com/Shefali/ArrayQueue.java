package com.Shefali;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue = new int[6];
    private int first = 0;
    private int last = 0;
    private int count = 0;

    public int size(){
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("the queue is full");
        queue[last] = item;
        count++;
        last = (last + 1) % queue.length;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("the queue is empty");
        int item = queue[first];
        queue[first] = 0;
        count--;
        first = (first + 1) % queue.length;
        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("the queue is empty");
        return queue[first];
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
