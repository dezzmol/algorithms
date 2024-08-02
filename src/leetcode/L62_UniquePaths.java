package leetcode;

public class L62_UniquePaths {
    public static int uniquePaths(int m, int n) {
        return helper(m, n, new int[m + 1][n + 1]);
    }

    public static int helper(int m, int n, int[][] arr) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }
        if (arr[m][n] != 0) {
            return arr[m][n];
        }
        arr[m][n] = helper(m - 1, n, arr) + helper(m, n - 1, arr);
        return arr[m][n];
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(uniquePaths(m, n));
    }
}
