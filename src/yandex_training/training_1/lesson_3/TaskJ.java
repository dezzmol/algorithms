package yandex_training.training_1.lesson_3;

import java.util.*;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < m; j++) {
                String lang = scanner.nextLine();
                if (map.containsKey(lang)) {
                    map.put(lang, map.get(lang) + 1);
                } else {
                    map.put(lang, 1);
                }
            }
        }

        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() == n) {
                result.add(item.getKey());
            }
            set.add(item.getKey());
        }

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
