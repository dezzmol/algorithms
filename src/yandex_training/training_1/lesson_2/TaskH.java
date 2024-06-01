package yandex_training.training_1.lesson_2;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        if (array.length == 3) {
            System.out.println(array[0] + " " + array[1] + " " + array[2]);
            return;
        }

        int firstPositive = array[0];
        int secondPositive = array[1];
        int thirdPositive = array[2];

        int firstNegative = array[0];
        int secondNegative = array[1];

        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstPositive && array[i] > 0 && i > 2) {
                int temp = firstPositive;
                firstPositive = array[i];
                int secondTemp = secondPositive;
                secondPositive = Math.max(secondPositive, temp);
                thirdPositive = Math.max(secondTemp, thirdPositive);
                continue;
            }
            if (array[i] > secondPositive && array[i] > 0 && i > 2) {
                int temp = secondPositive;
                secondPositive = array[i];
                thirdPositive = Math.max(temp, thirdPositive);
                continue;
            }
            if (array[i] > thirdPositive && array[i] > 0 && i > 2) {
                thirdPositive = array[i];
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

        long first = (long) firstPositive * secondPositive * thirdPositive;
        long thirdNumber = (long) Math.max(firstPositive, Math.max(secondPositive, thirdPositive));
        long second = (long) firstNegative * secondNegative * thirdNumber;

        if (first > second) {
            System.out.println(firstPositive + " " + secondPositive + " " + thirdPositive);
        } else {
            System.out.println(firstNegative + " " + secondNegative + " " + thirdNumber);
        }
    }
}
