package com.Shefali;

public class QueueReverser {
    public ArrayQueue reverse(ArrayQueue queue, int k) {
        if (k < 0 || k > queue.size()) {
            throw new IllegalStateException("the value " +
                    "of k is not within length of queue");
        }
        Stack stack = new Stack();
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }
}
