package yandex_training.training_1.lesson_6;

import java.util.*;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int num = scanner.nextInt();
            int result = binarySearch(arr1, num, map);
            map.put(num, result);
            System.out.println(result);
        }

    }

    public static int binarySearch(int[] arr, int number, Map<Integer, Integer> map) {
        if (map.containsKey(number)) {
            return map.get(number);
        }

        int left = -1;
        int right = arr.length;

        while (right > left + 1) {
            int mid = (right + left) / 2;

            if (arr[mid] == number) {
                return arr[mid];
            }
            if (arr[mid] < number) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (left == -1) {
            return arr[right];
        }
        if (right == arr.length) {
            return arr[left];
        }
        if (Math.abs(number - arr[left]) <= Math.abs(number - arr[right])) {
            return arr[left];
        } else {
            return arr[right];
        }
    }
}
