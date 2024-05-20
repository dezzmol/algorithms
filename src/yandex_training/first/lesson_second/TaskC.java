package yandex_training.first.lesson_second;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();

        int closerNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(num - array[i]) < Math.abs(num - closerNum)) {
                closerNum = array[i];
            }
        }
        System.out.println(closerNum);
    }
}
