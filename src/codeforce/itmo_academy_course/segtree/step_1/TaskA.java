package codeforce.itmo_academy_course.segtree.step_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Segtree segtree = new Segtree(n);
        for (int i = 0; i < n; i++) {
            segtree.set(i, scanner.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int command = scanner.nextInt();

            if (command == 1) {
                int index = scanner.nextInt();
                int v = scanner.nextInt();
                segtree.set(index, v);
            }
            if (command == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                System.out.println(segtree.sum(l, r));
            }
        }
    }

    static class Segtree {
        List<Long> tree;
        int size;

        public Segtree(int n) {
            size = 1;

            while (size < n) size *= 2;

            tree = new ArrayList<>();

            for (int i = 0; i < 2 * size; i++) {
                tree.add(i, (long) 0);
            }
        }

        void set(int i, int v, int x, int lx, int rx) {
            if (rx - lx == 1) {
                tree.set(x, (long) v);
                return;
            }
            int m = (lx + rx) / 2;
            if (i < m) {
                set(i, v, 2 * x + 1, lx, m);
            } else {
                set(i, v, 2 * x + 2, m, rx);
            }
            tree.set(x, tree.get(2 * x + 1) + tree.get(2 * x + 2));
        }

        void set(int i, int v) {
            set(i, v, 0, 0, size - 1);
        }

        long sum(int l, int r, int x, int lx, int rx) {
            if (x > size) {
                return 0;
            }
            if (l >= rx || lx > r) {
                return 0;
            }
            if (lx >= l && rx <= r) {
                return tree.get(x);
            }
            int m = (lx + rx) / 2;
            long s1 = sum(l, r, 2 * x + 1, lx, m);
            long s2 = sum(l, r, 2 * x + 2, m, rx);

            return s1 + s2;
        }

        long sum(int l, int r) {
            return sum(l, r, 0, 0, size - 1);
        }
    }
}
