package yandex_training.first.lesson_third;

import java.util.*;
import java.util.stream.Collectors;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        //scanner.nextLine();
        String secondString = scanner.nextLine();

        String[] firstStrings = firstString.split(" ");
        String[] secondStrings = secondString.split(" ");

        int[] first = new int[firstStrings.length];
        for (int i = 0; i < firstStrings.length; i++) {
            first[i] = Integer.parseInt(firstStrings[i]);
        }

        int[] second = new int[secondStrings.length];
        for (int i = 0; i < secondStrings.length; i++) {
            second[i] = Integer.parseInt(secondStrings[i]);
        }

        Set<Integer> set = new HashSet<>(first.length);
        for (int i = 0; i < first.length; i++) {
            set.add(first[i]);
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < second.length; i++) {
            if (set.contains(second[i])) {
                result.add(second[i]);
            }
        }

        List<Integer> list = result.stream().sorted().collect(Collectors.toList());

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
