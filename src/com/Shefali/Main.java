package com.Shefali;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*HashMapLinearProbing hashMapLP = new HashMapLinearProbing();
        hashMapLP.put(10,"Shefali");
        hashMapLP.put(20,"Isha");
        hashMapLP.put(25,"Prabhat");
        hashMapLP.put(11,"Ranjeet");
        hashMapLP.put(2,"Veena");
        hashMapLP.put(2,"Anu");
        hashMapLP.remove(3);
        System.out.println(hashMapLP.get(3));*/

        HashTableExercises hte = new HashTableExercises();
        System.out.println(hte.countPairsWithDiff(new int[]{1, 7, 5, 9, 2, 12, 3}, 2));

    }
}
