package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        backtracking(res, n, 0, 0, "");
        return res;
    }

    private static void backtracking(List<String> res, int n, int left, int right, String curr) {
        if (n * 2 == curr.length()) {
            res.add(curr);
            return;
        }

        if (left < n) {
            backtracking(res, n, left + 1, right, curr + "(");
        }
        if (right < left) {
            backtracking(res, n, left, right + 1, curr + ")");
        }
    }
}
