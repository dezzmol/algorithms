package yandex_training.training_1.lesson_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (map.containsKey(x) && map.get(x) < y) {
                map.put(x, y);
            } else {
                map.put(x, y);
            }
        }

        System.out.println(map.size());
    }
}
