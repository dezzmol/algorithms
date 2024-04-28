package yandex_training.first;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == 0 || y == 0 || z == 0) {
            System.out.println("NO");
            return;
        }

        if (x >= y + z) {
            System.out.println("NO");
            return;
        }
        if (y >= x + z) {
            System.out.println("NO");
            return;
        }
        if (z >= x + y) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
