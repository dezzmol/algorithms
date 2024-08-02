package leetcode;

public class L209_MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            if (sum >= target) {
                while (sum >= target) {
                    sum -= nums[left];
                    minLen = Math.min(minLen, right - left + 1);
                    left++;
                }
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
