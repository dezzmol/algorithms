package codeforce.itmo_academy_course.two_pointers.step_1;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] res = merge(a, b);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[b.length];
        int i = 0, j = 0;

        while (i < a.length || j < b.length) {
            if (j == b.length || i < a.length && a[i] < b[j]) {
                i++;
            } else {
                c[j] = i;
                j++;
            }
        }

        return c;
    }
}
