package yandex_handbook.chapter_3_3;

import java.util.Objects;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(rocks(n, m));
    }

    private static String rocks(int n, int m) {
        String[][] dp = new String[n + 1][m + 1];

        dp[0][0] = "Loose";

        for (int i = 1; i <= n; i++) {
            if (Objects.equals(dp[i - 1][0], "Win")) {
                dp[i][0] = "Loose";
            } else {
                dp[i][0] = "Win";
            }
        }
        for (int i = 1; i <= m; i++) {
            if (Objects.equals(dp[0][i - 1], "Win")) {
                dp[0][i] = "Loose";
            } else {
                dp[0][0] = "Win";
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (Objects.equals(dp[i - 1][j - 1], "Win") && Objects.equals(dp[i][j - 1], "Win") && Objects.equals(dp[i - 1][j], "Win")) {
                    dp[i][j] = "Loose";
                } else {
                    dp[i][j] = "Win";
                }
            }
        }

        return dp[n][m];
    }
}
