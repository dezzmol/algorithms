package codeforce.itmo_academy_course.dsu.step_1;

import java.util.Scanner;

public class TaskA {
    static int[] p;
    static int[] r;
    static int[] min;
    static int[] max;
    static int[] size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        p = new int[n + 1];
        r = new int[n + 1];
        min = new int[n + 1];
        max = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i < p.length; i++) {
            p[i] = i;
            r[i] = 0;
            min[i] = i;
            max[i] = i;
            size[i] = 1;
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
                System.out.print(getMin(a) + " ");
                System.out.print(getMax(a) + " ");
                System.out.println(getSize(a));
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
            min[b] = Math.min(min[b], min[a]);
            setMax(b, Math.max(max[a], max[b]));
            size[b] += size[a];
        } else {
            p[a] = b;
            min[a] = Math.min(min[b], min[a]);
            setMax(a, Math.max(max[a], max[b]));
            size[a] += size[b];
        }
    }

    private static int get(int a) {
        if (p[a] != a) {
            p[a] = get(p[a]);
        }
        return p[a];
    }

    private static int getMin(int a) {
        return min[get(a)];
    }

    private static int setMax(int a, int m) {
        if (max[a] != m) {
            max[a] = setMax(max[a], m);
        }
        return max[a];
    }

    private static int getMax(int a) {
        return max[get(a)];
    }

    private static int getSize(int a) {
        return size[get(a)];
    }
}
