package java.leetcode.romantointeger0013;

import java.util.HashMap;
import java.util.Map;

public class MyFirstSolution {

    private static final Map<Character, Integer> romanToIntegers = new HashMap<>();

    static {
        romanToIntegers.put('I', 1);
        romanToIntegers.put('V', 5);
        romanToIntegers.put('X', 10);
        romanToIntegers.put('L', 50);
        romanToIntegers.put('C', 100);
        romanToIntegers.put('D', 500);
        romanToIntegers.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int current;
        int next;

        for (int i = 0; i < s.length(); i++) {
            current = romanToIntegers.get(s.charAt(i));

            if (i == s.length() - 1) {
                next = current;
            } else {
                next = romanToIntegers.get(s.charAt(i + 1));
            }

            if (next > current) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}