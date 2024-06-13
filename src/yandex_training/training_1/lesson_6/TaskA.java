package yandex_training.training_1.lesson_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[k];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            arr2[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            System.out.println(binarySearch(arr1, arr2[i], set) ? "YES" : "NO");
        }
    }

    public static boolean binarySearch(int[] arr, int number, Set<Integer> set) {
        if (set.contains(number)) {
            return true;
        }

        int left = -1;
        int right = arr.length;

        while (right > left + 1) {
            int mid = (right + left) / 2;

            if (arr[mid] == number) {
                set.add(arr[mid]);
                return true;
            }
            if (arr[mid] < number) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return false;
    }
}
