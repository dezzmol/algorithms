package leetcode;

import leetcode.utils.TreeNode;

public class L450_DeleteNodeinaBST {
    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (root.left != null && root.right != null) {
            root.val = minimum(root.right).val;
            root.right = deleteNode(root.right, root.val);
        } else {
            if (root.left != null) {
                root =  root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    private static TreeNode minimum(TreeNode node) {
        if (node.left == null) {
            return node;
        }
        return minimum(node.left);
    }
}
