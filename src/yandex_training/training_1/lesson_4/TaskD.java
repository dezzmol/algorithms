package yandex_training.training_1.lesson_4;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] keys = new int[n];

        for (int i = 0; i < n; i++) {
            keys[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] pressed = new int[n];

        for (int i = 0; i < k; i++) {
            int key = scanner.nextInt();
            pressed[key - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (pressed[i] > keys[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
