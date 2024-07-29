package yandex_handbook.chapter_3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    private static List<Pair> pairs = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        hanoiTowers(n, 1, 3);

        System.out.println(pairs.size());
        for (Pair pair : pairs) {
            System.out.println(pair);
        }
    }

    private static void hanoiTowers(int n, int from, int to) {
        if (n == 1) {
            pairs.add(new Pair(from, to));
            return;
        }
        int unusedPeg = 6 - from - to;
        hanoiTowers(n - 1, from, unusedPeg);
        pairs.add(new Pair(from, to));
        hanoiTowers(n - 1, unusedPeg, to);
    }

    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return a + " " + b;
        }
    }
}
