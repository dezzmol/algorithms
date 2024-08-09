package codeforce.itmo_academy_course.dsu.step_1;

import java.util.Scanner;

public class TaskA {
    static int[] p;
    static int[] r;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        p = new int[n + 1];
        r = new int[n + 1];
        for (int i = 1; i < p.length; i++) {
            p[i] = i;
            r[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            String command = scanner.next();

            if (command.equals("union")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                union(a, b);
                continue;
            }
            if (command.equals("get")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (get(a) == get(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }

    private static void union(int a, int b) {
        a = get(a);
        b = get(b);

        if (r[a] == r[b]) {
            r[a]++;
        }
        if (r[a] > r[b]) {
            p[b] = a;
        } else {
            p[a] = b;
        }
    }

    private static int get(int a) {
        return p[a] = (p[a] == a ? a : get(p[a]));
    }
}