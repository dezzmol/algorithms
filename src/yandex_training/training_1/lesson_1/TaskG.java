package yandex_training.training_1.lesson_1;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int details = 0;

        if (k < m) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            int blanks = (int) n / k;

            if (blanks == 0) {
                break;
            }

            n = n % k;

            while (blanks > 0) {
                details += k / m;
                n += k % m;
                blanks--;
            }
        }
        System.out.println(details);
    }
}
