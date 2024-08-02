package yandex_training.training_2.lesson_1.divB;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();

        int[] x = new int[4];
        int[] y = new int[4];
        x[0] = x0;
        y[0] = y0;

        x[1] = 0;
        y[1] = 0;

        x[2] = d;
        y[2] = 0;

        x[3] = 0;
        y[3] = d;

        int a = (x[1] - x[0]) * (y[2] - y[1]) - (x[2] - x[1]) * (y[1] - y[0]);
        int b = (x[2] - x[0]) * (y[3] - y[2]) - (x[3] - x[2]) * (y[2] - y[0]);
        int c = (x[3] - x[0]) * (y[1] - y[3]) - (x[1] - x[3]) * (y[3] - y[0]);

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
            System.out.println(0);
        } else {
            if (a <= b && a <= c) {
                System.out.println(1);
                return;
            }
            if (b < a && b <= c) {
                System.out.println(2);
                return;
            }
            System.out.println(3);
        }
    }
}
