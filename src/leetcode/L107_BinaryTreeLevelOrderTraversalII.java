package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> tempList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                tempList.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            res.add(tempList);
        }

        return res.reversed();
    }
}
