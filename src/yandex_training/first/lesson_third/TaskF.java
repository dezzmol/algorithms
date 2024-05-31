package yandex_training.first.lesson_third;

import java.util.HashMap;
import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        HashMap<String, Integer> map = new HashMap<>(secondString.length() - 1);

        for (int i = 0; i < secondString.length() - 1; i++) {
            map.put(secondString.substring(i, i + 2), 1);
        }

        long count = 0;
        for (int i = 0; i < firstString.length() - 1; i++) {
            if (map.containsKey(firstString.substring(i, i + 2))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
