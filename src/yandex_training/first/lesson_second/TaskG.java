package yandex_training.first.lesson_second;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        if (array.length == 2) {
            System.out.println(Math.min(array[0], array[1]) + " " + Math.max(array[0], array[1]));
            return;
        }

        int firstPositive = array[0];
        int secondPositive = array[1];

        int firstNegative = array[0];
        int secondNegative = array[0];
        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstPositive && array[i] > 0) {
                int temp = firstPositive;
                firstPositive = array[i];
                secondPositive = Math.max(temp, secondNegative);
                continue;
            }
            if (array[i] > secondPositive && array[i] > 0) {
                secondPositive = array[i];
                continue;
            }
            if (array[i] < firstNegative && array[i] < 0) {
                int temp = firstNegative;
                firstNegative = array[i];
                secondNegative = Math.min(temp, secondNegative);
                continue;
            }
            if (array[i] < secondNegative && array[i] < 0) {
                secondNegative = array[i];
            }
        }

        long first = (long) firstPositive * secondPositive;
        long second = (long) firstNegative * secondNegative;
        if (first > second) {
            System.out.println(Math.min(firstPositive, secondPositive) + " " + Math.max(firstPositive, secondPositive));
        } else {
            System.out.println(Math.min(firstNegative, secondNegative) + " " + Math.max(firstNegative, secondNegative));
        }
    }
}
