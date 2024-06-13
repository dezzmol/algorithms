package yandex_training.training_1.lesson_5;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int minx = Math.abs(a[0] - b[0]);
        int ar = a[0];
        int br = b[0];
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            int x = a[i] - b[j];

            if (x < minx) {
                minx = x;
                ar = a[i];
                br = b[j];
            }
            if (x < 0) {
                x = -x;
                i++;
            } else if (x > 0) {
                j++;
            } else {
                minx = 0;
                ar = a[i];
                br = b[j];
                break;
            }
        }

        System.out.println(ar + " " + br);
    }
}
