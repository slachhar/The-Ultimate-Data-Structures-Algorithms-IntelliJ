package com.Shefali;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The string is empty");
        }
        java.util.Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

}
