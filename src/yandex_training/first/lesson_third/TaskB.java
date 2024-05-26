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

        Arrays.sort(first);
        Arrays.sort(second);

        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < first.length && j < second.length) {
            if (first[i] == second[j]) {
                set.add(first[i]);
                i++;
                j++;
                continue;
            }
            if (first[i] > second[j]) {
                j++;
            } else {
                i++;
            }
        }
        List<Integer> newSet = set.stream().sorted().collect(Collectors.toList());
        for (int num : newSet) {
            System.out.print(num + " ");
        }
    }
}
