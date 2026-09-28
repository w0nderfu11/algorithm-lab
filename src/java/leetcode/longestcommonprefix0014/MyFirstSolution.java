package java.leetcode.longestcommonprefix0014;

public class MyFirstSolution {

    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != current) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLength);
    }
}