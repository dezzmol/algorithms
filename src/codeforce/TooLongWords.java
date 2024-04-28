package codeforce;

import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            checkWord(scanner.nextLine());
        }
    }

    private static void checkWord(String word) {
        if (word.length() > 10) {
            String string = String.valueOf(word.charAt(0)) +
                    (word.length() - 2) +
                    word.charAt(word.length() - 1);
            System.out.println(string);
            return;
        }
        System.out.println(word);
    }
}
