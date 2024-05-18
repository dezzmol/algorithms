package leetcode;

public class Searcha2DMatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (i + 1 < m && matrix[i + 1][j] <= target) {
                i++;
            } else {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] matrix = {{1}, {3}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}
