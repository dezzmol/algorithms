package coderun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class T324_ManyChairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i > m) {
                break;
            }
            int benefit = b[i] - a[i];
            if (benefit > 0) {
                sum += b[i] - a[i];
            } else {
                break;
            }
        }

        System.out.println(sum);
    }
}
