package codeforce.itmo_academy_course.two_pointers.step_3;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int range = scanner.nextInt();

        int l = 0;
        int r = 0;
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }

        int res = 0;
        while (l < d.length) {
            while (r < d.length && d[r] - d[l] <= range) {
                r++;
            }
            res += d.length - r;
            l++;
        }

        System.out.println(res);
    }
}
