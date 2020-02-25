package com.Shefali;

public class QueueReverser {
    public ArrayQueue reverse(ArrayQueue queue, int k) {
        Stack stack = new Stack();
        ArrayQueue queue2 = new ArrayQueue();
        ArrayQueue queue3 = new ArrayQueue();
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        for (int i = 0; !queue.isEmpty(); i++) {
            queue2.enqueue(queue.dequeue());
        }
        for (int i = 0; i < k; i++) {
            queue3.enqueue(stack.pop());
        }
        for (int i = 0; !queue2.isEmpty(); i++) {
            queue3.enqueue(queue2.dequeue());
        }
        return queue3;
    }
}
