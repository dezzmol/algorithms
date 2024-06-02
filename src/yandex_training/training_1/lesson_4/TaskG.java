package yandex_training.training_1.lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            if (!lineScanner.hasNext()) {
                break;
            }
            String operation = lineScanner.next();


            if (Objects.equals(operation, "DEPOSIT")) {
                String name = lineScanner.next();
                Integer count = lineScanner.nextInt();
                if (!map.containsKey(name)) {
                    map.put(name, 0);
                }
                map.put(name, map.get(name) + count);
            } else if (Objects.equals(operation, "INCOME")) {
                Integer count = lineScanner.nextInt();

                for (Map.Entry<String, Integer> mp : map.entrySet()) {
                    if (mp.getValue() > 0) {
                        mp.setValue((int) (mp.getValue() + mp.getValue() * count * 0.01));
                    }
                }
            } else if (Objects.equals(operation, "TRANSFER")) {
                String name1 = lineScanner.next();
                String name2 = lineScanner.next();
                Integer count = lineScanner.nextInt();
                if (!map.containsKey(name1)) {
                    map.put(name1, 0);
                }
                if (!map.containsKey(name2)) {
                    map.put(name2, 0);
                }
                map.put(name1, map.get(name1) - count);
                map.put(name2, map.get(name2) + count);
            } else if (Objects.equals(operation, "WITHDRAW")) {
                String name = lineScanner.next();
                Integer count = lineScanner.nextInt();

                if (!map.containsKey(name)) {
                    map.put(name, 0);
                }
                map.put(name, map.get(name) - count);
            } else if (Objects.equals(operation, "BALANCE")) {
                String name = lineScanner.next();
                if (!map.containsKey(name)) {
                    System.out.println("ERROR");
                } else {
                    System.out.println(map.get(name));
                }
            }


            lineScanner.close();
        }
    }
}
