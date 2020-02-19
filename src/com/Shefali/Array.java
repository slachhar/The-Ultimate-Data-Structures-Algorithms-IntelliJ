package com.Shefali;

import java.util.Arrays;

public class Array {
    int[] arrayInt;
    int count = 0;

    public Array(int n) {
        arrayInt = new int[n];
    }

    public void insert(int number) {
        if (count == arrayInt.length) {
            int[] arrayNewInt = new int[arrayInt.length * 2];
            for (int i = 0; i < arrayInt.length; i++) {
                arrayNewInt[i] = arrayInt[i];
            }
            arrayInt = arrayNewInt;
        }
        arrayInt[count] = number;
        count++;
    }

    public void removeAt(int index) {

        if (index > count || index == -1) {
            throw new IndexOutOfBoundsException("Index is not available");
        }

        for (int j = index; j < count; j++) {
            arrayInt[j] = arrayInt[j + 1];
        }
        count--;
    }

    public int indexOf(int index) {
        int i = 0;
        for (; i < arrayInt.length; i++) {
            if (arrayInt[i] == index) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(arrayInt[i]);
    }

    public int max() {
        int max = arrayInt[0];
        for (int i = 1; i < count; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }
        return max;
    }

    public void intersect(Array arrayOther) {
        for (int i = 0; i < count; i++) {
            for (int j= 0; j < arrayOther.count; j++) {
                if (arrayInt[i] == arrayOther.arrayInt[j]) {
                    System.out.println(arrayInt[i]);
                }
            }
        }
    }



}
