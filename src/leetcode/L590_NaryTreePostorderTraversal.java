package leetcode;


import leetcode.utils.Node;

import java.util.ArrayList;
import java.util.List;

public class L590_NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();

        dfs(root, res);

        return res;
    }

    private static void dfs(Node node, List<Integer> res) {
        if (node == null) {
            return;
        }
        for (int i = 0; i < node.children.size(); i++) {
            dfs(node.children.get(i), res);
        }
        res.add(node.val);
    }
}
