package yandex_training.training_1.lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskH {
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
        Map<Character, Integer> tempMap = new HashMap<>();

        for (char c : w) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        int l = 0;
        int r = w.length;

        for (int i = 0; i < w.length; i++) {
            if (!tempMap.containsKey(s[i])) {
                tempMap.put(s[i], 0);
            }
            tempMap.put(s[i], tempMap.get(s[i]) + 1);
        }

        int result = 0;
        while (true) {
            if (map.equals(tempMap)) {
                result++;
            }
            if (r >= s.length) {
                break;
            }
            tempMap.put(s[l], tempMap.get(s[l]) - 1);
            if (tempMap.get(s[l]) == 0) {
                tempMap.remove(s[l]);
            }
            l++;

            if (!tempMap.containsKey(s[r])) {
                tempMap.put(s[r], 0);
            }
            tempMap.put(s[r], tempMap.get(s[r]) + 1);
            r++;
        }
        return result;
    }
}
