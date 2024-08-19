package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L90_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>(), res);

        return res;
    }

    private static void dfs(int[] nums, int start, List<Integer> cur, List<List<Integer>> result) {
        result.add(new ArrayList<>(cur));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            dfs(nums, i + 1, cur, result);
            cur.removeLast();
        }
    }
}
