package com.Shefali;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressions {

    private final List<Character> listOpenExpressions = Arrays.asList('{', '[', '(', '<');
    private final List<Character> listCloseExpressions = Arrays.asList('}', ']', ')', '>');

    public boolean balancedExpression(String str) {
        if (str == null) {
            throw new IllegalArgumentException("str doesnt have any value");
        }

        java.util.Stack<Character> stack = new Stack<>();
        for (char input : str.toCharArray()) {
            if (listOpenExpressions.contains(input))
                stack.push(input);
            if (listCloseExpressions.contains(input)) {
                if (stack.isEmpty())
                    return false;
                if (listOpenExpressions.indexOf(stack.pop()) != listCloseExpressions.indexOf(input))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
