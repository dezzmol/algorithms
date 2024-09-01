package leetcode;

public class L2022_Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] res = new int[n][m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = original[index++];
            }
        }

        return res;
    }
}
