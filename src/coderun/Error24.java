package coderun;

import java.util.Scanner;

public class Error24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a * b;
            total += arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println((double) arr[i] / total);
        }
    }
}
