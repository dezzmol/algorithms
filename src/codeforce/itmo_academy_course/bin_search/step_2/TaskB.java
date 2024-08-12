package codeforce.itmo_academy_course.bin_search.step_2;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int k = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(bin(arr, k, max));
    }


    private static double bin(int[] arr, int k, int max) {
        double l = 0, r = max;

        for (int i = 0; i < 100; i++) {
            double m = (double) (l + r) / 2;

            if (isEnough(arr, m, k)) {
                l = m;
            } else {
                r = m;
            }
        }

        return l;
    }

    private static boolean isEnough(int[] arr, double x, int k) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.floor(arr[i] / x);
        }
        return sum >= k;
    }
}
