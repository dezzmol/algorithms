package yandex_training.training_1.lesson_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            map.put(i, n - i - 1);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int b = scanner.nextInt();

            if (map.get(f) == null) {
                continue;
            }

            if (map.get(f) == b) {
                result++;
                map.remove(f);
            }
        }

        System.out.println(result);
    }
}
