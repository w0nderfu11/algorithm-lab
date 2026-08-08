package java.leetcode.romantointeger0013;

public class OptimizedSolution {

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    private int value(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(
                    "Invalid Roman numeral: " + symbol
            );
        };
    }
}