package codeforce.itmo_academy_course.bin_search.step_2;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        n--;
        long l = 0, r = (long) n * Math.max(x, y);

        while (l + 1 < r) {
            long m = (long) (l + r) / 2;

            if ((m / x) + (m / y) >= n - 1) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        System.out.println(r + Math.min(x, y) + 1);
    }
}
