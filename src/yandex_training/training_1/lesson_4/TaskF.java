package yandex_training.training_1.lesson_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int g = scanner.nextInt();
        int f = scanner.nextInt();
        scanner.nextLine();
        char[] w = scanner.nextLine().toCharArray();
        char[] s = scanner.nextLine().toCharArray();

        System.out.println(prefix(w, s));

    }

    private static int prefix(char[] w, char[] s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : w) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            int j = i;
            if (map.containsKey(s[i])) {
                Map<Character, Integer> tempMap = new HashMap<>(map);
                while (!tempMap.isEmpty() && j < s.length) {
                    if (tempMap.get(s[j]) == null) {
                        break;
                    }
                    if (tempMap.get(s[j]) == 1) {
                        tempMap.remove(s[j]);
                    } else {
                        tempMap.put(s[j], tempMap.get(s[j]) - 1);
                    }
                    j++;
                }
                if (tempMap.isEmpty()) {
                    count++;
                }
            }
        }

        return count;
    }
}
