package coderun.season_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T441_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] names = new String[n];
        Map<String, Integer> map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
            map.put(names[i], 0);
        }

        int m = scanner.nextInt();
        scanner.nextLine();
        int[] currentScore = new int[2];
        for (int i = 0; i < m; i++) {
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            String[] score = strings[0].split(":");
            int diffFirst = Integer.parseInt(score[0]) - currentScore[0];
            int diffSecond = Integer.parseInt(score[1]) - currentScore[1];
            String name = strings[1];

            map.put(name, map.get(name) + diffFirst);
            map.put(name, map.get(name) + diffSecond);
            currentScore[0] += diffFirst;
            currentScore[1] += diffSecond;
        }

        String maxName = "";
        int maxScore = 0;

        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            if (mp.getValue() > maxScore) {
                maxName = mp.getKey();
                maxScore = mp.getValue();
            } else if (mp.getValue() == maxScore) {
                if (mp.getKey().compareTo(maxName) > 0) {
                    maxName = mp.getKey();
                }
            }
        }

        System.out.println(maxName + " " + maxScore);
    }
}