package codeforce.itmo_academy_course.graphs.step_1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] graph = new int[n][n];
            System.out.println(isGraph(graph, m, scanner) ? "YES" : "NO");
        }
    }

    private static boolean isGraph(int[][] graph, int m, Scanner scanner) {
        boolean isGraph = true;
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            if (u == v) {
                isGraph = false;
            }

            if (graph[v - 1][u - 1] == 1 || graph[u - 1][v - 1] == 1) {
                isGraph = false;
            }
            graph[u - 1][v - 1] = 1;
        }

        return isGraph;
    }
}
