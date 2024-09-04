package leetcode;

import java.util.Arrays;

public class L59_SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int val = 1;
        int top = 0;
        int right = n - 1;
        int left = 0;
        int bottom = n - 1;

        while (true) {
            if (left > right) {
                break;
            }

            for (int i = left; i <= right; i++) {
                res[top][i] = val++;
            }
            top++;

            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                res[i][right] = val++;
            }
            right--;

            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res[bottom][i] = val++;
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                res[i][left] = val++;
            }
            left++;
        }

        return res;
    }
}
