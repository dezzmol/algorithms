package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    private static void dfs(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        dfs(res, root.left);
        dfs(res, root.right);
    }
}
