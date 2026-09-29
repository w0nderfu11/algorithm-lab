package java.leetcode.validparentheses0020;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("DuplicatedCode")
public class MyFirstSolution {

    public boolean isValid(String s) {
        int i = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for (i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            switch (currentChar) {
                case '(':
                    stack.push(')');
                    continue;
                case '[':
                    stack.push(']');
                    continue;
                case '{':
                    stack.push('}');
                    continue;
            }
            if (stack.isEmpty()) {
                return false;
            } else if (stack.getFirst() == currentChar) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}