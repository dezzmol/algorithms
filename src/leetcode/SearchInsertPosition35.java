package leetcode;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        int m;
        while (r > l + 1) {
            m = (l + r) / 2;
            if (nums[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l == -1) {
            return 0;
        }
        if (nums[l] < target) {
            return l + 1;
        }
        return l;
    }
}
