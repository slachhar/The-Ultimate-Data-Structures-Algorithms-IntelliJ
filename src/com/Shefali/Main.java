package com.Shefali;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        QueueReverser qr = new QueueReverser();
        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        System.out.println(qr.reverse(aq,2));

    }
}
