package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L46_Permutations {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        dfs(nums, res, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] nums, List<List<Integer>> res, List<Integer> curr) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
        }
        for (int i = 0; i < nums.length; i++) {
            if (curr.contains(nums[i])) {
                continue;
            }
            curr.add(nums[i]);
            dfs(nums, res, curr);
            curr.removeLast();
        }
    }
}
