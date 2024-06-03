package codeforce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskGenerator {
    static char[] init = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();
            char[] chars = scanner.nextLine().toCharArray();
            System.out.println(getTasksCount(chars, m));
        }
    }

    private static int getTasksCount(char[] chars, int m) {
        Arrays.sort(chars);
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);
        map.put('F', 0);
        map.put('G', 0);

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.get(chars[i]) + 1);
        }

        for (int i = 0; i < init.length; i++) {
            if (map.get(init[i]) < m) {
                count += m - map.get(init[i]);
                map.put(init[i], m);
            }
        }

        return count;
    }
}
