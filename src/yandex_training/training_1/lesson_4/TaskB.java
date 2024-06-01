package yandex_training.training_1.lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();

            if (!map.containsKey(word)) {
                map.put(word, 0);
            } else {
                map.put(word, map.get(word) + 1);
            }
            System.out.print(map.get(word) + " ");
        }
    }
}
