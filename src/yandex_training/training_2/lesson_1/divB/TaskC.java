package yandex_training.training_2.lesson_1.divB;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x <= 12 && y < 12 || x < 12 && y <= 12) {
            System.out.println(0);
            return;
        }
        System.out.println(1);
    }
}
