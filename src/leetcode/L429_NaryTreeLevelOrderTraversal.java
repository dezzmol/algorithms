package leetcode;

import leetcode.utils.Node;

import java.util.*;

public class L429_NaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.children = new ArrayList<>();
        root.children.add(new Node(3, new ArrayList<>(List.of(new Node[]{new Node(5), new Node(6)}))));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; ++i){
                Node child = q.poll();
                temp.add(child.val);
                for(Node node : child.children)
                    q.add(node);
            }
            res.add(temp);
        }
        return res;
    }
}
