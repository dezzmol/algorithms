package codeforce.itmo_academy_course.two_pointers.step_2;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long s = scanner.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long sum = 0;
        int l = 0;
        long res = 0;
        for (int r = 0; r < n; r++) {
            sum += a[r];
            while (sum >= s) {
                sum -= a[l];
                l++;
            }
            res += l;
        }

        System.out.println(res);
    }
}
