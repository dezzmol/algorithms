package codeforce.itmo_academy_course.bin_search.step_1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            System.out.println(bin(arr, x) ? "YES" : "NO");
        }
    }

    private static boolean bin(int[] arr, int x) {
        int i = -1, j = arr.length;

        while (j > i + 1) {
            int mid = (i + j) / 2;

            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] < x) {
                i = mid;
            } else {
                j = mid;
            }
        }

        return false;
    }
}
