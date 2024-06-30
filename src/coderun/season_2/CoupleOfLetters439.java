package coderun.season_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class CoupleOfLetters439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] strings = string.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            countLetters(strings[i], map);
        }

        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
                .stream()
                .max((entry1, entry2) -> {
                    int valueCompare = entry1.getValue().compareTo(entry2.getValue());
                    if (valueCompare == 0) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return valueCompare;
                });

        maxEntry.ifPresent(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey()));
    }

    private static void countLetters(String s, Map<String, Integer> map) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            String key = String.valueOf(chars[i]) + chars[i + 1];
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
            map.put(key, map.get(key) + 1);
        }
    }
}
