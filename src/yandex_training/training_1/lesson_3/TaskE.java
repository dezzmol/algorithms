package yandex_training.training_1.lesson_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.nextLine();
        int number = scanner.nextInt();

        Set<Integer> set1 = new HashSet<>();
        set1.add(x);
        set1.add(y);
        set1.add(z);

        Set<Integer> set2 = new HashSet<>();
        while (number > 0) {
            int num = number % 10;
            set2.add(num);
            number /= 10;
        }
        set1.retainAll(set2);
        set2.removeAll(set1);
        System.out.println(set2.size());
    }
}
