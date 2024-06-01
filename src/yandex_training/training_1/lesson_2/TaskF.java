package yandex_training.training_1.lesson_2;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        String input = scanner.nextLine();
        String string = input.replaceAll("\\s+","");
        String[] strings = input.split(" ");

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
        int palindromicStart = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isPalindromic(string.substring(i))) {
                palindromicStart = i;
                break;
            }
        }

        System.out.println(palindromicStart);
        for (int i = palindromicStart - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static boolean isPalindromic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
