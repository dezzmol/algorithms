package codeforce.itmo_academy_course.two_pointers.step_2;

import java.util.Scanner;

public class TaskE {
    static int[] count = new int[100001];
    static int num;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long s = scanner.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int l = 0;
        long res = 0;
        for (int r = 0; r < n; r++) {
            add(a[r]);
            while (!isGood(s)) {
                remove(a[l]);
                l++;
            }
            res += r - l + 1;
        }

        System.out.println(res);
    }

    private static boolean isGood(long k) {
        return num <= k;
    }

    private static void add(int x) {
        count[x]++;
        if (count[x] == 1) {
            num++;
        }
    }

    private static void remove(int x) {
        count[x]--;
        if (count[x] == 0) {
            num--;
        }
    }
}
