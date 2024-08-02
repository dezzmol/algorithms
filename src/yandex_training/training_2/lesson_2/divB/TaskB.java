package yandex_training.training_2.lesson_2.divB;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxCounter = 0;
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 2) {
                while (i < 9 && arr[i + 1] != 1) {
                    counter++;
                    i++;
                }
                maxCounter = counter;
                counter = 0;
            }
        }

        System.out.println(maxCounter);
    }
}
