package codeforce;

import java.util.Scanner;

public class Watermelon4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();

        if (w % 2 != 0) {
            System.out.print("NO");
            return;
        }

        if ((w / 2) % 2 == 0) {
            System.out.print("YES");
            return;
        }
        System.out.print("NO");
    }
}
