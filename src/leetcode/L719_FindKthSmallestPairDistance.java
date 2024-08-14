package leetcode;

import java.util.*;

public class L719_FindKthSmallestPairDistance {
    public static void main(String[] args) {
        System.out.println(smallestDistancePair(new int[]{1,1,1}, 2));
    }

    public static int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int l = 0, r = nums[n - 1] - nums[0];

        for (int count = 0; l < r; count = 0) {
            int m = l + (r - l) / 2;

            for (int i = 0, j = 0; i < n; i++) {
                while (j < n && nums[j] <= nums[i] + m) {
                    j++;
                }
                count += j - i - 1;
            }

            if (count < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }
}
