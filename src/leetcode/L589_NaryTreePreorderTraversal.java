package leetcode;

import leetcode.utils.Node;

import java.util.ArrayList;
import java.util.List;

public class L589_NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();

        dfs(res, root);

        return res;
    }

    private static void dfs(List<Integer> res, Node node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        for (int i = 0; i < node.children.size(); i++) {
            dfs(res, node.children.get(i));
        }
    }
}
