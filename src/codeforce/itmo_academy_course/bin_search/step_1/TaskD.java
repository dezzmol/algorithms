package codeforce.itmo_academy_course.bin_search.step_1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            int lower = findMin(arr, l);
            int greater = findMax(arr, r);
            System.out.print((greater - lower - 1) + " ");
        }
    }

    private static int findMax(int[] arr, int x) {
        int l = -1, r = arr.length;

        while (r > l + 1) {
            int mid = (l + r) / 2;

            if (arr[mid] <= x) {
                l = mid;
            } else {
                r = mid;
            }
        }

        return r;
    }

    private static int findMin(int[] arr, int x) {
        int l = -1, r = arr.length;

        while (r > l + 1) {
            int mid = (l + r) / 2;

            if (arr[mid] < x) {
                l = mid;
            } else {
                r = mid;
            }
        }

        return l;
    }
}
