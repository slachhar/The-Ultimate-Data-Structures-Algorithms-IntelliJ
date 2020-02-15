package com.Shefali;

import java.util.Arrays;

public class Array {
    int[] arrayInt;
    int count = 0;
    public Array(int n) {
        arrayInt = new int[n];
    }

    public void insert(int number){
        if(count < arrayInt.length)
        { arrayInt[count] = number;
            count++;}
        else
            throw new IndexOutOfBoundsException();
    }

    public void removeAt(int index){
        int i=0;
        for (; i <arrayInt.length;i++) {
            if(i == index)
            {
                arrayInt[i] = 0;
                break;
            }
        }
        int j=i;
        for (; j <arrayInt.length-1;j++) {
            arrayInt[j] = arrayInt[j+1];
        }
        arrayInt[j] = 0;
    }

    public int indexOf(int index){
        int i=0;
        for (; i <arrayInt.length;i++) {
            if(arrayInt[i] == index)
            {
                return i;
            }
        }
        return -1;
    }

}
