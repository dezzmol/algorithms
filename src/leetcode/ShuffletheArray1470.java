package leetcode;

import java.util.Arrays;

public class ShuffletheArray1470 {
    public static int[] shuffle(int[] nums, int n) {
        int first = 0;
        int second = n;
        int[] arr = new int[2 * n];

        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = nums[first++];
            arr[i + 1] = nums[second++];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
}
