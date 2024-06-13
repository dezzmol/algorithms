package yandex_training.training_1.lesson_5;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long result = 0;
        int i = 0, j = 0;

        while (i < arr.length) {
            while (j < arr.length && arr[j] - arr[i] <= r) {
                j++;
            }
            result += arr.length - j;
            i++;
        }

        System.out.println(result);
    }
}
