package yandex_training.training_1.lesson_1;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0 && c == 0 && b == 0 || a == 0 && Math.pow(c, 2) == b) {
            System.out.println("MANY SOLUTIONS");
            return;
        }

        if (a == 0 && a != c || c < 0) {
            System.out.println("NO SOLUTION");
            return;
        }

        double x = ((Math.pow(c, 2) - b) / a);

        if (x == (int) x) {
            System.out.println((int) x);
            return;
        }
        System.out.println("NO SOLUTION");
    }
}
