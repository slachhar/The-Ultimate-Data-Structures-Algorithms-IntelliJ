package com.Shefali;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
