package yandex_training.training_1.lesson_6;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int S = w * h;
        System.out.println(bin(a, b, S));
    }

    private static long bin(int a, int b, int S) {
        long l = (long) a * b, r = S;
        while (r > l + 1) {
            long m = (l + r) / 2;
            if (isEnough(a, b, m, S)) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }

    private static boolean isEnough(int a, int b, long d, int S) {
        return (a + 2 * d) * (b + 2 * d) > S;
    }
}
