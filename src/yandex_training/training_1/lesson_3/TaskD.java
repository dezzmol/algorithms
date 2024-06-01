package yandex_training.training_1.lesson_3;

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
