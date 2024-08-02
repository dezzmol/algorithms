package yandex_training.training_2.lesson_1.divB;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int k = Math.min(i, j);
        int forwardRes = 0;
        while (k != Math.max(i, j)) {
            if (k > n) {
                k = 0;
            }
            forwardRes++;
            k++;
        }
        forwardRes--;

        k = Math.max(i, j);
        int backRes = 0;
        while (k != Math.min(i, j)) {
            if (k > n) {
                k = 0;
            }
            backRes++;
            k++;
        }
        backRes -= 2;

        System.out.println(Math.min(forwardRes, backRes));
    }
}
