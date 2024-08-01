package yandex_training.training_1.lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][2];

        for (int i = 0; i < m; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        System.out.println(solve(n, arr));
    }

    private static int solve(int n, int[][] arr) {
        List<Pair> events = new ArrayList<>();

        for (int[] desk : arr) {
            int start = desk[0];
            int end = desk[1];
            events.add(new Pair(start, 1));
            events.add(new Pair(end, -1));
        }

        events.sort(Pair::compare);

        int result = n;
        Integer left = null;
        int currentSegment = 0;

        for (Pair event : events) {
            if (event.b == 1) {
                if (currentSegment == 0) {
                    left = event.a;
                }
                currentSegment += 1;
            } else if (event.b == -1) {
                currentSegment -= 1;
                if (currentSegment == 0 && left != null) {
                    result -= event.a - left + 1;
                }
            }
        }

        return result;
    }

    static class Pair {
        final int a;
        final int b;

        public Pair(int a, int b) {
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
