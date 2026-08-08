package java.leetcode.romantointeger0013;

import java.util.HashMap;
import java.util.Map;

public class BestSolution {

    private static final Map<Character, Integer> ROMAN_TO_INTEGER = new HashMap<>();

    static {
        ROMAN_TO_INTEGER.put('I', 1);
        ROMAN_TO_INTEGER.put('V', 5);
        ROMAN_TO_INTEGER.put('X', 10);
        ROMAN_TO_INTEGER.put('L', 50);
        ROMAN_TO_INTEGER.put('C', 100);
        ROMAN_TO_INTEGER.put('D', 500);
        ROMAN_TO_INTEGER.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = ROMAN_TO_INTEGER.get(s.charAt(i));

            if (i < s.length() - 1
                    && current < ROMAN_TO_INTEGER.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}