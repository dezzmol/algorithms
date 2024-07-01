package coderun.season_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NearestStop423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int stop = scanner.nextInt();
            int result = bin(a, stop);
            System.out.println(result);
        }
    }

    public static String lengthFromBusToStop(int n, int k, long[] a, long[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            int result = bin(a, b[i]);
            stringBuilder.append(result).append("\n");
        }
        return stringBuilder.toString();
    }

    private static int bin(long[] a, long stop) {
        int l = -1;
        int r = a.length;

        while (r > l + 1) {
            int m = (l + r) / 2;
            if (a[m] >= stop) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l == -1) {
            return r + 1;
        }
        if (r == a.length) {
            return l + 1;
        }
        if (Math.abs(stop - a[l]) <= Math.abs(stop - a[r])) {
            return l + 1;
        } else {
            return r + 1;
        }
    }
}
