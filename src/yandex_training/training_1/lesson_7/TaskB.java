package yandex_training.training_1.lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Pair pair = new Pair(a, b);
            arr[i] = pair;
        }
        Arrays.sort(arr, Pair::compare);
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (x > arr[j].a && x < arr[j].b) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }

    static class Pair {
        final int a;
        final int b;

        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }

        public static int compare(Pair left, Pair right) {
            int res = Integer.compare(left.a, right.a);
            if (res == 0)
                res = Integer.compare(left.b, right.b);
            return res;
        }
    }
}
