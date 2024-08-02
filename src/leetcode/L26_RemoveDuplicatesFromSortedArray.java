package leetcode;

import java.util.*;

public class L26_RemoveDuplicatesFromSortedArray {
    public Object[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.toArray();
    }
}
