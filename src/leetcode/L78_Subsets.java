package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();

        dfs(nums, 0, cur, result);

        return result;
    }

    private static void dfs(int[] nums, int i, List<Integer> cur, List<List<Integer>> result) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[i]);
        dfs(nums, i + 1, cur, result);
        cur.removeLast();
        dfs(nums, i + 1, cur, result);
    }
}
