package leetcode;

import leetcode.utils.TreeNode;

public class L100_SameTree {
    public static void main(String[] args) {
        TreeNode l = new TreeNode(10);
        l.left = new TreeNode(5);
        l.right = new TreeNode(15);
        TreeNode r = new TreeNode(10);
        r.left = new TreeNode(5);
        r.left.right = new TreeNode(15);
        System.out.println(isSameTree(l, r));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private static boolean dfs(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null || l.val != r.val) {
            return false;
        }

        boolean left = dfs(l.left, r.left);
        boolean right = dfs(l.right, r.right);

        return left && right;
    }
}
