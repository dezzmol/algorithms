package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        traversal(root, res);

        return res;
    }

    private static void traversal(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }

        traversal(node.left, res);
        traversal(node.right, res);
        res.add(node.val);
    }
}
