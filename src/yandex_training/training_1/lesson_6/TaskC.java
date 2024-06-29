package yandex_training.training_1.lesson_6;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(bin(w, h, n));
    }

    private static long bin(int w, int h, int n) {
        long l = 0, r = (long) n * (w + h);
        while (r > l + 1) {
            long m = (l + r) / 2;
            if (isEnough(m, w, h, n)) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }

    private static boolean isEnough(long x, int w, int h, int n) {
        return (x / w) * (x / h) >= n;
    }
}
