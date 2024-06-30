package yandex_handbook.chapter_3_1;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int c = getFactorial(k + n - 1) / (getFactorial(n - 1) * getFactorial(k));

        System.out.println(c);
    }

    private static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
