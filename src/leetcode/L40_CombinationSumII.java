package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L40_CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        getComb(0, target, candidates, res, new ArrayList<>());
        return res;
    }

    private static void getComb(int start, int r, int[] nums, List<List<Integer>> res, List<Integer> curr) {
        if (r < 0) {
            return;
        }
        if (r == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            getComb(i + 1, r - nums[i], nums, res, curr);
            curr.removeLast();
        }
    }
}
