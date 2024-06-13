package yandex_training.training_1.lesson_4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long>> map = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            if (!lineScanner.hasNext()) {
                break;
            }

            String name = lineScanner.next();
            String item = lineScanner.next();
            Long count = lineScanner.nextLong();

            if (map.containsKey(name)) {
                Map<String, Long> innerMap = map.get(name);
                if (innerMap.containsKey(item)) {
                    innerMap.put(item, innerMap.get(item) + count);
                } else {
                    innerMap.put(item, count);
                }
            } else {
                Map<String, Long> innerMap = new TreeMap<>();
                innerMap.put(item, count);
                map.put(name, innerMap);
            }

            lineScanner.close();
        }

        scanner.close();

        map.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach((innerK, innerV) -> {
                System.out.println(innerK + " " + innerV);
            });
        });
    }
}
