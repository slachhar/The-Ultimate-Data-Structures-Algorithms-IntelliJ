package com.Shefali;

import java.util.Map;

public class HashMap {
    public char firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> hp = new java.util.HashMap<>();
        char firstNonRepeatingCharacter = ' ';
        char[] ch = s.toCharArray();
        for (char item : ch) {
            Integer value = hp.containsKey(item) ? hp.get(item) : 0;
            hp.put(item, value + 1);
        }

        for (char item : ch) {
            if (hp.get(item) == 1) {
                return item;
            }
        }

        return Character.MIN_VALUE;
    }
}
