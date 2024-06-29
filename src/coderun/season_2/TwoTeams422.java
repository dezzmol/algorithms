package coderun.season_2;

import java.util.Scanner;

public class TwoTeams422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int b_students = 0;
        while (n > 0) {
            while (b >= n) {
                b -= n;
                b_students++;
            }
            n = b;
        }

        if (a > b_students) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
