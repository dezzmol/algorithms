package yandex_training.training_1.lesson_5;

import java.util.HashMap;
import java.util.Map;
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
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 1;

        while (r - l < k) {
            if (arr[l] == arr[r]) {
                l++;
            }
            r++;
        }

        System.out.println(l + " " + r);
    }
}
