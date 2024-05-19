package yandex_training.first.lesson_first;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        if (A <= D) {
            if (B <= E || C <= E) {
                System.out.println("YES");
                return;
            }
        }
        if (A <= E) {
            if (B <= D || C <= D) {
                System.out.println("YES");
                return;
            }
        }
        if (B <= E && C <= D || B <= D && C <= E) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
