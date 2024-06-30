package yandex_handbook.chapter_3_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int start = arr[0][0];
        int end = arr[0][1];
        int counter = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i][0] != start && end < arr[i][0]) {
                start = arr[i][0];
                end = arr[i][1];
                counter++;
            }
        }

        System.out.println(counter);
    }
}
