package yandex_training.training_2.lesson_1.divB;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int i = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(getResult(r, i, c));
    }

    private static int getResult(int r, int i, int c) {
        int res = 0;
        switch (i) {
            case 0:
                if (r != 0) {
                    res = 3;
                } else {
                    res = c;
                }
                break;
            case 1:
                res = c;
                break;
            case 4:
                if (r != 0) {
                    res = 3;
                } else {
                    res = 4;
                }
                break;
            case 6:
                res = 0;
                break;
            case 7:
                res = 1;
                break;
            default:
                res = i;
        }
        return res;
    }
}
