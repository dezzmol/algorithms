package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L47_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, res, new ArrayList<>(), used);
        return res;
    }

    private static void dfs(int[] nums, List<List<Integer>> res, List<Integer> curr, boolean[] used) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            used[i] = true;
            dfs(nums, res, curr, used);
            used[i] = false;
            curr.removeLast();
        }
    }
}
