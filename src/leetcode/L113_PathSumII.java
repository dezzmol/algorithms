package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L113_PathSumII {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);

        System.out.println(pathSum(treeNode, 1));
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }

        dfs(root, targetSum, 0, res, new ArrayList<>());
        return res;
    }

    private static void dfs(TreeNode node, int targetSum, int currSum, List<List<Integer>> res, List<Integer> curr) {
        if (node == null) {
            return;
        }
        currSum += node.val;
        curr.add(node.val);

        if (node.left == null && node.right == null) {
            if (targetSum == currSum) {
                res.add(new ArrayList<>(curr));
            }
        } else {
            dfs(node.left, targetSum, currSum, res, curr);
            dfs(node.right, targetSum, currSum, res, curr);
        }
        curr.removeLast();
    }
}
