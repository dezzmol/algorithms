package codeforce.contest_971;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int k = 0; k < t; k++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int min = Integer.MAX_VALUE;

            for (int i = a; i <= b; i++) {
                min = Math.min(min, ((i - a) + (b - i)));
            }

            System.out.println(min);
        }
    }
}
