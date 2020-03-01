package com.Shefali;

import java.util.Set;

public class HashSet {
    public Character firstNonRepeatingCharacter(String s) {
        Set<Character> st = new java.util.HashSet<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (st.contains(ch))
                return ch;
            st.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
