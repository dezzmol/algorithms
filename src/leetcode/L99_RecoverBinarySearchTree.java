package leetcode;

import leetcode.utils.TreeNode;

import java.util.List;

public class L99_RecoverBinarySearchTree {
    static TreeNode prev = null, first = null, second = null;

    public void recoverTree(TreeNode root) {

        dfs(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);

        if (first == null && (prev == null || prev.val >= node.val)) {
            first = prev;
        }
        if (first != null && prev.val >= node.val) {
            second = node;
        }
        prev = node;

        dfs(node.right);
    }
}
