package yandex_handbook.chapter_3_5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        arr = sort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;

        while (i < a.length || j < b.length) {
            if (j == b.length || i < a.length && a[i] < b[j]) {
                c[i + j] = a[i++];
            } else {
                c[i + j] = b[j++];
            }
        }

        return c;
    }

    private static int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int[] l = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] r = Arrays.copyOfRange(a, a.length / 2, a.length);

        l = sort(l);
        r = sort(r);

        return merge(l, r);
    }
}
