package yandex_handbook.chapter_3_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 1; i < n; i++) {
            k = scanner.nextInt();
            List<Integer> b = new ArrayList<>(k);

            for (int j = 0; j < k; j++) {
                b.add(scanner.nextInt());
            }

            a = merge(a, b);
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    private static List<Integer> merge(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a.size() + b.size());
        int l = 0, r = 0;

        while (l < a.size() || r < b.size()) {
            if (r == b.size() || l < a.size() && a.get(l) < b.get(r)) {
                result.add(a.get(l++));
            } else {
                result.add(b.get(r++));
            }
        }

        return result;
    }
}
