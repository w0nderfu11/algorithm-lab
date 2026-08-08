package java.leetcode.twosum0001;

import java.util.HashMap;
import java.util.Map;

public final class MyFirstSolution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];

            if (seenNumbers.containsKey(requiredNumber)) {
                return new int[]{seenNumbers.get(requiredNumber), i};
            }

            seenNumbers.put(nums[i], i);
        }

        return new int[0];
    }
}