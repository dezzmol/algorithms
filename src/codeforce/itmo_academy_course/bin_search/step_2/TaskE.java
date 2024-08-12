package codeforce.itmo_academy_course.bin_search.step_2;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = scanner.nextDouble();
        double l = 0, r = 1E9;

        for (int i = 0; i < 100; i++) {
            double mid = (l + r) * .5;

            if (Math.pow(mid, 2) + Math.sqrt(mid) > c) {
                r = mid;
            } else {
                l = mid;
            }
        }

        System.out.println(l);
    }
}
