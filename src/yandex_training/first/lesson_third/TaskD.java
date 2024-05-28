package yandex_training.first.lesson_third;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = scanner.nextLine()) != null) {
            stringBuilder.append(scanner.nextLine());
        }

        System.out.println(stringBuilder);

    }
}
