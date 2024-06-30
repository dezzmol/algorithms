package coderun.season_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NearestStop423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>(n);

        for (int i = 0; i < k; i++) {
            int stop = scanner.nextInt();
            int result = getNearestStop(a, stop, map);
            map.put(stop, result);
            System.out.println(result);
        }
    }

    private static int getNearestStop(int[] a, int stop, Map<Integer, Integer> map) {
        if (map.containsKey(stop)) {
            return map.get(stop);
        }

        int l = -1;
        int r = a.length;

        while (r > l + 1) {
            int m = (l + r) / 2;
//            if (a[m] == stop) {
//                return m + 1;
//            }
            if (a[m] > stop) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l == -1) {
            return r + 1;
        }
        if (r == a.length) {
            return l + 1;
        }
        if (Math.abs(stop - a[l]) <= Math.abs(stop - a[r])) {
            return l + 1;
        } else {
            return r + 1;
        }
    }
}
