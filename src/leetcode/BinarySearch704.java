package leetcode;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 4;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        while (r > l + 1) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        return -1;
    }

}
