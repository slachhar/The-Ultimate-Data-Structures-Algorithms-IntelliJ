package com.Shefali;

public class PriorityQueue {
    int[] priorityQueue = new int[6];
    private int count = 0;

    public void insert(int item) {
        if (isEmpty()) {
            priorityQueue[count] = item;
        }
        if (isFull()) {
            throw new IllegalStateException("the queue is full");
        }
        int i = ShiftingItems(item);
        priorityQueue[i + 1] = item;
        count++;
    }

    public int remove(){
        if (isEmpty()) {
            throw new IllegalStateException("the stack is empty");
        }
        return priorityQueue[count--];
    }

    private int ShiftingItems(int item) {
        int i;
        for (i = count - 1; i >= 0; i--)
            if (priorityQueue[i] > item) priorityQueue[i + 1] = priorityQueue[i];
            else {
                break;
            }
        return i;
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == priorityQueue.length;
    }
}
