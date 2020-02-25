package com.Shefali;

public class StackWithTwoQueues {
    private ArrayQueue sq1 = new ArrayQueue();
    private ArrayQueue sq2 = new ArrayQueue();

    public void push(int item) {
        sq1.enqueue(item);
    }

    public int pop() {
        if (sq2.isEmpty()) {
            while (!sq1.isEmpty()) {
                sq2.enqueue(sq1.dequeue());
            }
        }
        return sq2.dequeue();
    }

    public int peek() {
        return sq2.peek();
    }

    public int size() {
        return sq1.size() + sq2.size();
    }

    public boolean isEmpty() {
        return sq1.isEmpty() && sq2.isEmpty();
    }
}
