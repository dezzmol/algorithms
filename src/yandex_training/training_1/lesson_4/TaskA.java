package yandex_training.training_1.lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> map = new HashMap<>(n * 2);
        for (int i = 0; i < n; i++) {
            String f = scanner.next();
            String b = scanner.next();

            map.put(f, b);
            map.put(b, f);
            scanner.nextLine();
        }

        String s = scanner.next();
        System.out.println(map.get(s));
    }
}
