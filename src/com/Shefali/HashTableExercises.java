package com.Shefali;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {

    public int mostFrequent(int[] ints) {
        if (ints == null) {
            throw new IllegalStateException("the array is null");
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int item : ints) {
            int value = mp.containsKey(item) ? mp.get(item) : 0;
            mp.put(item, value + 1);
        }
        int mostFrequentItemCount = 0;
        int mostFrequentItem = 0;
        for (int item : mp.keySet()) {
            if (mp.get(item) > mostFrequentItemCount) {
                mostFrequentItem = item;
                mostFrequentItemCount = mp.get(item);
            }
        }
        return mostFrequentItem;
    }

    public int countPairsWithDiff(int[] ints, int d) {
        if (ints == null) {
            throw new IllegalStateException("the array is null");
        }

        Set<Integer> mapInts = new HashSet<>();
        int index = 0;
        for (int item2 : ints) {
            mapInts.add(item2);
            index++;
        }

        int countPairsWithDiff = 0;
        for (int i = 0; i < ints.length; i++) {
            int compliment = ints[i] - d;
            int addition = ints[i] + d;
            if (mapInts.contains(compliment)) {
                countPairsWithDiff++;
            }
            if (mapInts.contains(addition)) {
                countPairsWithDiff++;
            }
            mapInts.remove(ints[i]);
        }
        return countPairsWithDiff;
    }

    public int[] twoSum(int[] ints, int target) {
        if (ints == null) {
            throw new IllegalStateException("the array is null");
        }
        // Build O(n)
        // find out O(1)
        Map<Integer, Integer> mapInts = new HashMap<>();

        int[] twoSum = new int[2];
        for (int i = 0; i < ints.length; i++) {
            int compliment = target - ints[i];
            if (mapInts.containsKey(compliment)) {
                twoSum = new int[]{mapInts.get(compliment), i};
            }
            mapInts.put(ints[i], i);
        }
        return twoSum;
    }
}
