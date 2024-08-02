package yandex_training.training_2.lesson_2.divB;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int max = num;
        int maxCount = 1;
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num == max) {
                maxCount++;
            }
            if (num > max) {
                max = num;
                maxCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}
