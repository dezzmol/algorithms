package leetcode;

public class L1493_LongestSubarrayof1sAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 0, 1, 0};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, i - left + 1 - zeros);
        }

        return (max == nums.length) ? max - 1 : max;
    }
}
