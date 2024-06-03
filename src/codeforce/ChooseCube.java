package codeforce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChooseCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int k = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            solution(arr, f, k);
        }
    }

    private static void solution(Integer[] arr, int f, int k) {
        if (arr.length == 1) {
            System.out.println("YES");
            return;
        }

        if (k >= arr.length) {
            System.out.println("YES");
            return;
        }

        int favoriteNumber = arr[f - 1];
        Arrays.sort(arr, Collections.reverseOrder());

        int loverIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == favoriteNumber) {
                loverIndex = i;
                break;
            }
        }

        if (arr[loverIndex] < arr[k - 1]) {
            System.out.println("NO");
            return;
        }



        if (arr[k] < favoriteNumber) {
            System.out.println("YES");
            return;
        }
        System.out.println("MAYBE");
    }
}
