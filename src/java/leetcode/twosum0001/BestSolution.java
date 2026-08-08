package java.leetcode.twosum0001;

import java.util.HashMap;
import java.util.Map;

public final class BestSolution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> expectedNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer firstIndex = expectedNumbers.get(nums[i]);

            if (firstIndex != null) {
                return new int[]{firstIndex, i};
            }

            expectedNumbers.put(target - nums[i], i);
        }

        return new int[0];
    }
}