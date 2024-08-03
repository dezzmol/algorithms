package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class L977_SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        int[] res = new int[nums.length];
        int curr = j;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[curr] = (int) Math.pow(nums[i], 2);
                i++;
            } else {
                res[curr] = (int) Math.pow(nums[j], 2);
                j--;
            }
            curr--;
        }
        return res;
    }
}
