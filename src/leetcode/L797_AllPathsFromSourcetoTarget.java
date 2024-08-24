package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L797_AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();

        dfs(res, new ArrayList<>(), graph, 0, graph.length - 1);
        return res;
    }

    private static void dfs(List<List<Integer>> res, List<Integer> curr, int[][] graph, int node, int target) {
        if (node == target) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (!curr.contains(node)) {
            curr.add(node);
        }
        for (int i = 0; i < graph[node].length; i++) {
            curr.add(graph[node][i]);
            dfs(res, curr, graph, graph[node][i], target);
            curr.removeLast();
        }
    }
}
