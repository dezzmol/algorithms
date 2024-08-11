package codeforce.itmo_academy_course.bin_search.step_1;

import java.util.Scanner;

public class TaskB {
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
            System.out.println(bin(arr, x));
        }
    }

    private static int bin(int[] arr, int x) {
        int l = -1, r = arr.length;

        while (r > l + 1) {
            int mid = (l + r) / 2;

            if (arr[mid] <= x) {
                l = mid;
            } else {
                r = mid;
            }
        }

        if (l == -1) {
            return 0;
        }
        return l + 1;
    }

}
