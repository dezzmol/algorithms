package vkcourse.module1.lesson1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != element) {
                count++;
            }
        }

        System.out.println(count);
    }
}
