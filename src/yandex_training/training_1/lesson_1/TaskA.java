package yandex_training.training_1.lesson_1;

import java.util.Objects;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int troom = scanner.nextInt();
        int tcond = scanner.nextInt();
        scanner.nextLine();
        String cond_mode = scanner.nextLine();

        if (Objects.equals(cond_mode, "freeze")) {
            if (tcond >= troom) {
                System.out.println(troom);
                return;
            }
            System.out.println(tcond);
            return;
        }

        if (Objects.equals(cond_mode, "heat")) {
            if (tcond <= troom) {
                System.out.println(troom);
                return;
            }
            System.out.println(tcond);
            return;
        }

        if (Objects.equals(cond_mode, "auto")) {
            System.out.println(tcond);
        }

        if (Objects.equals(cond_mode, "fan")) {
            System.out.println(troom);
        }
    }
}
