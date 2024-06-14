package yandex_training.training_1.lesson_5;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int l = 0, r = 0;
        int sum = 0;
        int count = 0;
        while (l < arr.length && r < arr.length) {
            sum += arr[r];
            if (sum == k) {
                count++;
            }
            if (sum > k) {
                while (sum > k) {
                    sum -= arr[l++];
                    if (sum == k) {
                        count++;
                    }
                }
            }
            r++;
        }

        System.out.println(count);
    }
}
