package codeforce;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < w; i++) {
            sum += (i + 1) * k;
        }
        if (sum > n) {
            System.out.println(sum - n);
        } else {
            System.out.println(0);
        }
    }
}
