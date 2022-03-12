package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        int index = removeDuplicates(arr);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int pointer = nums.length > 0 ? 1 : 0;

        for (int n : nums) {
            if (n > nums[pointer - 1]) {
                nums[pointer++] = n;
            }
        }

        return pointer;
    }
}
