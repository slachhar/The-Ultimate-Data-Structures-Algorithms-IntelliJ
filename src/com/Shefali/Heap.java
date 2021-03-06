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

    private void bubbleUp(int childIndex, int parentIndex) {
        int temp = heapArray[parentIndex];
        heapArray[parentIndex] = heapArray[childIndex];
        heapArray[childIndex] = temp;
    }

    public void delete(int item) {
        if (heapArray == null)
            throw new InvalidRequestStateException();

        heapArray[0] = heapArray[count - 1];
        heapArray[count - 1] = 0;
        count--;
        int left = heapArray[getLeftIndex(0)];
        int right = heapArray[getRightIndex(0)];
        String side = "";
        int parentIndex = 0;

        while (side != "stop") {

            side = DirectionToBubbleDown(left, right, heapArray[parentIndex]);

            if (side == "left") {
                bubbleDown(getLeftIndex(parentIndex), parentIndex);
                parentIndex = getLeftIndex(parentIndex);

            } else if (side == "right") {
                bubbleDown(getRightIndex(parentIndex), parentIndex);
                parentIndex = getRightIndex(parentIndex);
            }

            left = heapArray[getLeftIndex(parentIndex)];
            right = heapArray[getRightIndex(parentIndex)];
        }
    }

    private void bubbleDown(int childIndex, int parentIndex) {
        int temp = heapArray[childIndex];
        heapArray[childIndex] = heapArray[parentIndex];
        heapArray[parentIndex] = temp;
    }

    private String DirectionToBubbleDown(int left, int right, int root) {
        return left > right ?
                root > left ? "stop" : "left" :
                root > right ? "stop" : "right";
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

    private int getRightIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }


}
