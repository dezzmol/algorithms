package codeforce.itmo_academy_course.bin_search.step_2;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long w = scanner.nextInt();
        long h = scanner.nextInt();
        long n = scanner.nextInt();

        System.out.println(bin(w, h, n));
    }

    private static long bin(long w, long h, long n) {
        long l = 0, r = (long) n * (w + h);

        while (l + 1 < r) {
            long mid = (long) (l + r) / 2;

            if (isEnough(w, h, n, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return r;
    }

    private static boolean isEnough(long w, long h, long n, long x) {
        return Math.floor((double) x / w) * Math.floor((double) x / h) >= n;
    }
}
