package com.Shefali;

public class StackWithTwoQueues {
    private ArrayQueue sq1 = new ArrayQueue();
    private ArrayQueue sq2 = new ArrayQueue();
    private int top;

    public void push(int item) {
        top = item;
        sq1.enqueue(item);
    }

    public int pop() {
        if (sq2.size() > 0 && sq1.size() > 0)
            throw new IllegalStateException("Stack is empty");

        while (sq1.size() > 1) {
            top = sq1.dequeue();
            sq2.enqueue(top);
        }

        SwapQueues();

        return sq2.dequeue();
    }

    private void SwapQueues() {
        ArrayQueue temp = sq1;
        sq1 = sq2;
        sq2 = temp;
    }

    public int peek() {
        if (sq2.size() > 0 && sq1.size() > 0)
            throw new IllegalStateException("Stack is empty");

        return top;
    }

    public int size() {
        return sq1.size() + sq2.size();
    }

    public boolean isEmpty() {
        return sq1.isEmpty() && sq2.isEmpty();
    }
}
