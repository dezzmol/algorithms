package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L77_Combinations {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(n, 1, k, res, new ArrayList<>());
        return res;
    }

    private static void helper(int n, int start, int k, List<List<Integer>> res, List<Integer> sub) {
        if (k == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }
        for (int i = start; i <= n; i++) {
            sub.add(i);
            helper(n, i + 1, k - 1, res, sub);
            sub.removeLast();
        }
    }
}
