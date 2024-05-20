package yandex_training.first.lesson_second;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = strings[i].charAt(0);
        }

        System.out.println(isMonotonous(array) ? "YES" : "NO");
    }

    private static boolean isMonotonous(int[] array) {
        int x = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= x) {
                return false;
            }
            x = array[i];
        }
        return true;
    }
}
