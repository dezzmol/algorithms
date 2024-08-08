package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        while (true) {
            if (left > right) {
                break;
            }

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }

            top++;
            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }

        return res;
    }
}
