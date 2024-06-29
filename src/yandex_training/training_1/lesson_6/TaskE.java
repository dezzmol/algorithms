package yandex_training.training_1.lesson_6;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long avg = (a * 2 + b * 3 + c * 4) / (a + b + c);

        if (avg >= 4) {
            System.out.println(0);
            return;
        }
        System.out.println(bin(a, b, c));
    }

    private static long bin(long a, long b, long c) {
        long l = 0, r = a;

        while (r > l + 1) {
            long m = (l + r) / 2;
            double avg = findAvg(a, b, c, m);
            if (avg == 3.5) {
                return r;
            } else if (avg > 3.5) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }

    private static double findAvg(long a, long b, long c, long d) {
        return (double) (a * 2 + b * 3 + c * 4 + d * 5) / (a + b + c + d);
    }
}
