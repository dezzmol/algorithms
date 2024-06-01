package yandex_training.training_1.lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        String[][] field = new String[n][m];

        for (String[] strings : field) {
            Arrays.fill(strings, String.valueOf(0));
        }

        String[] bombs = new String[k];
        scanner.nextLine();
        for (int i = 0; i < k; i++) {
            bombs[i] = scanner.nextLine();
        }

        for (int i = 0; i < bombs.length; i++) {
            String[] numbers = bombs[i].split(" ");

            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            field[x - 1][y - 1] = "*";
        }

        for (int i = 0; i < bombs.length; i++) {
            increaseValueAroundBombs(field, bombs[i]);
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void increaseValueAroundBombs(String[][] field, String bomb) {
        String[] numbers = bomb.split(" ");

        int x = Integer.parseInt(numbers[0]) - 1;
        int y = Integer.parseInt(numbers[1]) - 1;
        int currentValue = 0;
        if (x > 0) {
            if (isNumber(field[x - 1][y])) {
                currentValue = Integer.parseInt(String.valueOf(field[x - 1][y]));
                field[x - 1][y] = String.valueOf(currentValue + 1);
            }
        }
        if (x < field.length - 1) {
            if (isNumber(field[x + 1][y])) {
                currentValue = Integer.parseInt(String.valueOf(field[x + 1][y]));
                field[x + 1][y] = String.valueOf(currentValue + 1);
            }

        }
        if (y > 0) {
            if (isNumber((field[x][y - 1]))) {
                currentValue = Integer.parseInt(String.valueOf(field[x][y - 1]));
                field[x][y - 1] = String.valueOf(currentValue + 1);
            }

        }
        if (y < field[0].length - 1) {
            if (isNumber((field[x][y + 1]))) {
                currentValue = Integer.parseInt(String.valueOf(field[x][y + 1]));
                field[x][y + 1] = String.valueOf(currentValue + 1);
            }

        }
        if (x > 0 && y > 0) { //левый верхний
            if (isNumber((field[x - 1][y - 1]))) {
                currentValue = Integer.parseInt(String.valueOf(field[x - 1][y - 1]));
                field[x - 1][y - 1] = String.valueOf(currentValue + 1);
            }

        }
        if (x > 0 && y < field[0].length - 1) { // левый нижний
            if (isNumber((field[x - 1][y + 1]))) {
                currentValue = Integer.parseInt(String.valueOf(field[x - 1][y + 1]));
                field[x - 1][y + 1] = String.valueOf(currentValue + 1);
            }

        }
        if (x < field.length - 1 && y > 0) { // правый верхний
            if (isNumber(field[x + 1][y - 1])) {
                currentValue = Integer.parseInt(String.valueOf(field[x + 1][y - 1]));
                field[x + 1][y - 1] = String.valueOf(currentValue + 1);
            }

        }
        if (x < field.length - 1 && y < field[0].length - 1) { // правый нижний
            if (isNumber(field[x + 1][y + 1])) {
                currentValue = Integer.parseInt(String.valueOf(field[x + 1][y + 1]));
                field[x + 1][y + 1] = String.valueOf(currentValue + 1);
            }
        }
    }

    public static boolean isNumber(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
