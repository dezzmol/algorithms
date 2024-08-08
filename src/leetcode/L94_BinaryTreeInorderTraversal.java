package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L94_BinaryTreeInorderTraversal {
    static List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        return list;
    }

    private static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
}
