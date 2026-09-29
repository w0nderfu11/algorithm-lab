package java.leetcode.validparentheses0020;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("DuplicatedCode")
public class BestSolution {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
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
            if (stack.isEmpty() || stack.pop() != currentChar) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}