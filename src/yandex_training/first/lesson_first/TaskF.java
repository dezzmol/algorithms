package yandex_training.first.lesson_first;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int s1 = (a1 + a2) * Math.max(b1, b2);
        int s2 = (b1 + b2) * Math.max(a1, a2);
        int s3 = (b1 + a2) * Math.max(b2, a1);
        int s4 = (b2 + a1) * Math.max(a2, b1);

        int min = Math.min(s1, Math.min(s2, Math.min(s3, s4)));

        if (min == s1) {
            System.out.print((a1 + a2));
            System.out.print(" ");
            System.out.print(Math.max(b1, b2));
            return;
        }

        if (min == s2) {
            System.out.print((b1 + b2));
            System.out.print(" ");
            System.out.print(Math.max(a1, a2));
            return;
        }

        if (min == s3) {
            System.out.print((b1 + a2));
            System.out.print(" ");
            System.out.print(Math.max(b2, a1));
            return;
        }

        System.out.print((b2 + a1));
        System.out.print(" ");
        System.out.print(Math.max(a2, b1));
    }
}
