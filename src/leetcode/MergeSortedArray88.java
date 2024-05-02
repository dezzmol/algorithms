package leetcode;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] subNums1 = Arrays.copyOfRange(nums1, 0, m);
        while (i < subNums1.length || j < nums2.length) {
            if (j == nums2.length || (i < subNums1.length && subNums1[i] <= nums2[j])) {
                nums1[i + j] = subNums1[i++];
            } else {
                nums1[i + j] = nums2[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
