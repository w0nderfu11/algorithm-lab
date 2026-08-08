package java.leetcode.palindromenumber0009;

public class MyFirstSolution {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}