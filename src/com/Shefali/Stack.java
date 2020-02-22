package com.Shefali;

import java.util.Arrays;

public class Stack {
    private int[] array;
    private int count = 0;
    private int secondStackIndex = 5;
    private int firstStackCount = 0;
    private int secondStackCount = secondStackIndex;

    public Stack() {
        array = new int[10];
    }

    public void push(int item) {
        if (count == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[count] = item;
        count++;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalCallerException("Stack is empty");
        }
        return array[--count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }

    public void push1(int item) {
        if (isFull1())
            throw new IllegalStateException("The stack1 is full");

        array[firstStackCount] = item;
        firstStackCount++;
    }

    public boolean isFull1() {
        return firstStackCount == 5;
    }

    public void push2(int item) {
        if (isFull2())
            throw new IllegalStateException("The stack2 is full");

        array[secondStackCount] = item;
        secondStackCount++;
    }

    public boolean isFull2() {
        return secondStackCount == 10;
    }

    public boolean isEmpty1() {
        return firstStackCount == 0;
    }

    public boolean isEmpty2() {
        return secondStackCount == 5;
    }

    public int pop1(){
        if(isEmpty1())
            throw new IllegalStateException("The stack1 is empty");

        return array[--firstStackCount];
    }

    public int pop2(){
        if(isEmpty2())
            throw new IllegalStateException("The stack2 is empty");

        return array[--secondStackCount];
    }
}
