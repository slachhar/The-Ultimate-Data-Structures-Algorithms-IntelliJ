package com.Shefali;

import com.sun.jdi.request.InvalidRequestStateException;

import java.util.Arrays;

public class Heap {
    int[] heapArray;
    int count = 0;

    public void insert(int item) {
        if (heapArray == null) {
            heapArray = new int[10];
        }
        if (count == heapArray.length) {
            heapArray = Arrays.copyOf(heapArray, heapArray.length * 2);
        }
        heapArray[count] = item;

        if (count != 0) {
            int index = count;
            while (item > getParent(index)) {
                bubbleUp(index, getParentIndex(index));
                index = getParentIndex(index);
            }
        }
        count++;
    }

    public void delete(int item) {
        if (heapArray == null)
            throw new InvalidRequestStateException();

        heapArray[0] = heapArray[count - 1];
        /*while (heapArray[0] < getParent(index)) {
            bubbleUp(index, getParentIndex(index));
            index = getParentIndex(index);
        }*/
    }

    private int getParent(int index) {
        return heapArray[getParentIndex(index)];
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    private void bubbleUp(int childIndex, int parentIndex) {
        int temp = heapArray[parentIndex];
        heapArray[parentIndex] = heapArray[childIndex];
        heapArray[childIndex] = temp;
    }
}
