package com.Shefali;

import java.util.Arrays;

public class MinStack {
    private int[] array;
    private int count = 0;
    private int minVal = 0;

    public MinStack() {
        array = new int[10];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int item) {
        if (count == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[count] = item;
        minVal = !isEmpty() && minVal < item ? minVal : item;
        count++;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalCallerException("Stack is empty");
        }
        int index = 0;
        while (index < count) {
            if (minVal > array[index])
                minVal = array[index];
            index++;
        }
        return array[--count];
    }

    public int min(){
        return minVal;
    }
}
