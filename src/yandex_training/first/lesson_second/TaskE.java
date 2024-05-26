package yandex_training.first.lesson_second;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int winner = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[winner]) {
                winner = i;
            }
        }
        int vasiliyAttempt = 0;
        int max = 0;
        boolean isValid = false;
        for (int i = winner; i < n - 1; i++) {
            if (arr[i] % 10 == 5 && arr[i] > arr[i + 1] && i > winner && arr[i] > max) {
                isValid = true;
                vasiliyAttempt = i;
                max = arr[vasiliyAttempt];
            }
        }

        if (!isValid) {
            System.out.println(0);
            return;
        }
        int place = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[vasiliyAttempt]) {
                place++;
            }
        }

        System.out.println(place);
    }
}
