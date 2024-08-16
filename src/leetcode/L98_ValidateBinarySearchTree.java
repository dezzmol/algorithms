package leetcode;

import leetcode.utils.TreeNode;

public class L98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private static boolean dfs(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }
        if (node.val >= max || node.val <= min) {
            return false;
        }
        boolean isLeftValid = dfs(node.left, node.val, min);
        boolean isRightValid = dfs(node.right, max, node.val);

        return isLeftValid && isRightValid;
    }
}
