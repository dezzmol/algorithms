package leetcode;

import java.util.HashSet;
import java.util.Set;

public class L349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            first.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            second.add(nums2[i]);
        }

        first.retainAll(second);

        return first.stream().mapToInt(Number::intValue).toArray();
    }
}
