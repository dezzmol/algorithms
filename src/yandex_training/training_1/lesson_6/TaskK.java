package yandex_training.training_1.lesson_6;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[][] arr = new int[n][l];

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int d1 = scanner.nextInt();
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            int m = scanner.nextInt();

            int[] d = generateDSequence(d1, a, c, m, l);
            arr[i] = generateXSequence(x1, d, l);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                merge(arr[i], arr[j]);
            }
        }
    }

    private static int[] generateXSequence(int x1, int[] d, int l) {
        int[] x = new int[l];
        x[0] = x1;
        for (int i = 1; i < l; i++) {
            x[i] = x[i - 1] + d[i - 1];
        }
        return x;
    }

    private static int[] generateDSequence(int d1, int a, int c, int m, int l) {
        int[] d = new int[l];
        d[0] = d1;
        for (int i = 1; i < l; i++) {
            d[i] = (a * d[i - 1] + c) % m;
        }
        return d;
    }

    private static void merge(int[] a, int[] b) {
        int[] c = new int[a.length * 2];
        int i = 0, j = 0;

        while (i < a.length || j < b.length) {
            if (i + j == c.length / 2) {
                System.out.println(c[i + j - 1]);
                return;
            }
            if (j == b.length || (i < a.length && a[i] < b[j])) {
                c[i + j] = a[i++];
            } else {
                c[i + j] = b[j++];
            }
        }
    }
}
