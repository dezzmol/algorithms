package yandex_training.training_2.lesson_2.divB;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        char[] chars = s.toCharArray();

        int counter = 0;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
