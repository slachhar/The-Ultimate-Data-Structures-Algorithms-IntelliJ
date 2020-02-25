package com.Shefali;

import java.util.Arrays;

public class LinkedListQueue {
    LinkedList ls = new LinkedList();

    public void enqueue(int item){
        ls.addLast(item);
    }

    public int dequeue(){
        int item = ls.peek();
        ls.deleteFirst();
        return item;
    }

    public int peek(){
        return ls.peek();
    }

    public int size(){
        return ls.size();
    }

    public boolean isEmpty(){
        return ls.IsEmpty();
    }

    @Override
    public String toString() {
        return Arrays.toString(ls.toArray());
    }
}
