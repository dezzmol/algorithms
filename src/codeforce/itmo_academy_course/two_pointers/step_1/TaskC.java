package codeforce.itmo_academy_course.two_pointers.step_1;

import java.util.Scanner;

public class TaskC {
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

        System.out.println(getPairsCount(a, b));

    }

    private static long getPairsCount(int[] a, int[] b) {
        long counter = 0;
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
                continue;
            }
            if (b[j] < a[i]) {
                j++;
                continue;
            }

            long c = 0;
            for (; i < a.length && a[i] == b[j]; i++) {
                c++;
            }

            for (; j < b.length && a[i - 1] == b[j]; j++) {
                counter += c;
            }
        }

        return counter;
    }
}
