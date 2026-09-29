package java.leetcode.validparentheses0020;

public class OptimizedSolution {

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(' -> stack[top++] = ')';
                case '[' -> stack[top++] = ']';
                case '{' -> stack[top++] = '}';
                default -> {
                    if (top == 0 || stack[--top] != c) {
                        return false;
                    }
                }
            }
        }

        return top == 0;
    }
}