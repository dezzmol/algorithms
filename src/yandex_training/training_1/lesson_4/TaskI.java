package yandex_training.training_1.lesson_4;

import java.util.*;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.nextLine();
        Set<String> dictionary = new HashSet<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            set.add(str);
            dictionary.add(str.toLowerCase());
        }

        String string = scanner.nextLine();
        long result = getResult(string, set, dictionary);

        System.out.println(result);
    }

    private static long getResult(String string, Set<String> set, Set<String> dict) {
        String[] strings = string.split(" ");
        long result = 0;
        for (String s : strings) {
            if (Objects.equals(s, "")) {
                continue;
            }
            if (!set.contains(s)) {
                char[] chars = s.toCharArray();
                int charUpperCase = 0;
                for (char c : chars) {
                    if (Character.isUpperCase(c)) {
                        charUpperCase++;
                    }
                }
                if (charUpperCase > 1 || charUpperCase == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
