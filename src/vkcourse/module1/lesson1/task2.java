package vkcourse.module1.lesson1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                if (i != j) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
