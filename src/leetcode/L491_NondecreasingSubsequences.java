package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L491_NondecreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        return null;
    }

    private static void backtracking(int nums[], List<List<Integer>> res, List<Integer> cur, int start) {
        if (start == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (start > 0 && nums[i] < nums[i - 1]) {
                break;
            }
            cur.add(nums[i]);
        }
    }
}
