package leetcode;

public class L64_MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n - 1][m - 1];
    }
}
