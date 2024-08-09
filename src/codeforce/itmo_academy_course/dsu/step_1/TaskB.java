package codeforce.itmo_academy_course.dsu.step_1;

import java.util.Scanner;

public class TaskB {
    static int[] parents;
    static int[] size;
    static int[] max;
    static int[] min;
    static int[] rank;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        parents = new int[n + 1];
        size = new int[n + 1];
        max = new int[n + 1];
        min = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parents[i] = i;
            size[i] = 1;
            max[i] = i;
            min[i] = i;
            rank[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            String command = scanner.next();

            if (command.equals("union")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                merge(a, b);
            }
            if (command.equals("get")) {
                int a = scanner.nextInt();
                a = find(a);
                System.out.println(min[a] + " " + max[a] + " " + getSize(a));
            }
        }
    }

    private static int find(int a) {
        if (parents[a] != a) {
            parents[a] = find(parents[a]);
        }
        return parents[a];
    }

    private static int getSize(int u) {
        int rootU = find(u);
        return size[rootU];
    }

    private static boolean compare(int a, int b) {
        return find(a) == find(b);
    }

    private static void merge(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            if (size[a] < size[b]) {
                int temp = a;
                a = b;
                b = temp;
            }
            parents[b] = a;
            min[a] = Math.min(min[a], min[b]);
            max[a] = Math.max(max[a], max[b]);
            size[a] += size[b];
        }
    }
}
