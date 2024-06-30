package yandex_handbook.chapter_3_1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
