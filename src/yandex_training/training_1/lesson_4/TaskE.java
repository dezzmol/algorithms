package yandex_training.training_1.lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N][2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();

            arr[i][0] = w;
            arr[i][1] = h;

            if (!map.containsKey(w)) {
                map.put(w, h);
            }
            map.put(w, Math.max(map.get(w), h));
        }

        long result = 0;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            result += m.getValue();
        }

        System.out.println(result);
    }
}
