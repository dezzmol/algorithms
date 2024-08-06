package leetcode;

public class L4_MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2, 3};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];

        int i = 0, j = 0;

        while (i < nums1.length || j < nums2.length) {
            if (j == nums2.length || (i < nums1.length && nums1[i] < nums2[j])) {
                res[i + j] = nums1[i++];
            } else {
                res[i + j] = nums2[j++];
            }
            if (i + j == (res.length / 2) + 1) {
                break;
            }
        }

        if (res.length % 2 != 0) {
            return (double) res[res.length / 2];
        }
        return (double) (res[(res.length / 2) - 1] + res[res.length / 2]) / 2;
    }
}
