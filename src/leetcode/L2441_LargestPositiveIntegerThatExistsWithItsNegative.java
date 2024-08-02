package leetcode;

import java.util.Arrays;

public class L2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        int[] nums = {22,34,2,44,-8,49,-5,22,46,39,-23,-15,27,48,-37,10,22,-45,13,-2};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();

        int l = 0;
        int r = nums.length - 1;

        int min = nums[l];
        int max = nums[r];
        while (r > l) {
            if (max < 0 || min > 0) {
                return -1;
            }
            if (max == -min) {
                return max;
            }
            if (max < -min) {
                l++;
                min = nums[l];
            } else {
                r--;
                max = nums[r];
            }
        }
        return -1;
    }
}
