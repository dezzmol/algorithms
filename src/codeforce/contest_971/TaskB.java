package codeforce.contest_971;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            String[] strings = new String[n];

            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next();
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < strings[i].length(); j++) {
                    if (strings[i].charAt(j) == '#') {
                        System.out.print(j + 1 + " ");
                        break;
                    }
                }
            }
            System.out.println();

            t--;
        }
    }
}
