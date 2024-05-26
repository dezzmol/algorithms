package yandex_training.first.lesson_third;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            set.add(array[i]);
        }

        System.out.println(set.size());
    }
}
