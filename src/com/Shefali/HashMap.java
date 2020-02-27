package com.Shefali;

public class HashMap {
    public char firstNonRepeatingCharacter(String s) {
        java.util.HashMap<Character, Integer> hp = new java.util.HashMap<>();
        char firstNonRepeatingCharacter = ' ';
        for (char item : s.replaceAll("\\s+", "").toCharArray()) {
            if (!hp.containsKey(item))
                hp.put(item, 1);
            else {
                Integer value = hp.get(item);
                hp.put(item, value + 1);
            }
        }
        for (char item : hp.keySet()) {
            if (hp.get(item) == 1) {
                firstNonRepeatingCharacter = item;
            }
        }
        return firstNonRepeatingCharacter;
    }
}
