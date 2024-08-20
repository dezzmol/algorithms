package leetcode;

import leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();

        dfs(root, res, new ArrayList<>());
        return res;
    }

    private static void dfs(TreeNode node, List<String> res, List<Integer> curr) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            curr.add(node.val);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < curr.size() - 1; i++) {
                sb.append(curr.get(i)).append("->");
            }
            sb.append(curr.getLast());
            res.add(sb.toString());
            curr.removeLast();
            return;
        }

        curr.add(node.val);
        dfs(node.left, res, curr);
        dfs(node.right, res, curr);
        curr.removeLast();
    }
}
