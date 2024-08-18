package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L39_CombinationSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        getComb(target, 0, candidates, res, new ArrayList<>());
        return res;
    }

    private static void getComb(int r, int start, int[] candidates, List<List<Integer>> res, List<Integer> curr) {
        if (r < 0) {
            return;
        }
        if (r == 0) {
            res.add(new ArrayList<>(curr));
        } else {
            for (int i = start; i < candidates.length; i++) {
                curr.add(candidates[i]);
                getComb(r - candidates[i], i, candidates, res, curr);
                curr.removeLast();
            }
        }
    }
}
