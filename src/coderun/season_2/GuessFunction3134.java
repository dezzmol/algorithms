package coderun.season_2;

import java.util.Scanner;

public class GuessFunction3134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(phi(a));
    }

    public static long phi(long n) {
        long result = n;
        for (long i = 2; i * i <= n; ++i)
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                result -= result / i;
            }
        if (n > 1)
            result -= result / n;
        return result;
    }
}
