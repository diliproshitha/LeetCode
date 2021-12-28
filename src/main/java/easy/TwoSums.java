package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSums {

    public static void main(String[] args) {
        int[] nums = new int[] {-3,4,3,90};
        int target = 0;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
