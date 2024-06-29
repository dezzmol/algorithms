package yandex_training.training_1.lesson_5;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (arr.length == 1) {
            System.out.println(1 + " " + 1);
        }

        int l = 0, r = 1;

        while (r < arr.length && l < arr.length) {
            if (arr[l] == arr[r]) {
                l++;
            }
            r++;
        }

        int i = arr.length - 1, j = arr.length - 2;
        while (i > 0 && j > 0) {
            if (arr[i] == arr[j]) {
                i--;
            }
            j--;
        }

        System.out.println((l + 1) + " " + (Math.min(i + 1, r)));
    }
}
