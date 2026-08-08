package java.leetcode.palindromenumber0009;

public class BestSolution {

    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        if (number != 0 && number % 10 == 0) {
            return false;
        }

        int reversedHalf = 0;

        while (number > reversedHalf) {
            int lastDigit = number % 10;
            reversedHalf = reversedHalf * 10 + lastDigit;
            number /= 10;
        }

        return number == reversedHalf
                || number == reversedHalf / 10;
    }
}
