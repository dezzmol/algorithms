package leetcode;

import leetcode.utils.TreeNode;

public class L124_BinaryTreeMaximumPathSum {
    int answer = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return answer;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        answer = Math.max(answer, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
