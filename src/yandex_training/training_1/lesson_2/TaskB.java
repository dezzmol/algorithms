package yandex_training.training_1.lesson_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int input = scanner.nextInt();
        while (input != -2000000000) {
            list.add(input);
            input = scanner.nextInt();
        }

        if (list.size() == 1) {
            System.out.println("CONSTANT");
            return;
        }

        boolean isConst = true;
        boolean isWeakAsc = true;
        boolean isWeakDesc = true;
        boolean isAsc = true;
        boolean isDesc = true;


        for (int i = 1; i < list.size(); i++) {
            if (Objects.equals(list.get(i - 1), list.get(i))) {
                isAsc = false;
                isDesc = false;
            }
            if (list.get(i) > list.get(i - 1)) {
                isConst = false;
                isDesc = false;
                isWeakDesc = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                isConst = false;
                isAsc = false;
                isWeakAsc = false;
            }
        }


        if (isConst) {
            System.out.println("CONSTANT");
            return;
        }

        if (isAsc) {
            System.out.println("ASCENDING");
            return;
        }

        if (isDesc) {
            System.out.println("DESCENDING");
            return;
        }

        if (isWeakAsc) {
            System.out.println("WEAKLY ASCENDING");
            return;
        }

        if (isWeakDesc) {
            System.out.println("WEAKLY DESCENDING");
            return;
        }

        System.out.println("RANDOM");
    }
}
