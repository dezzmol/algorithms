package leetcode;


import leetcode.utils.ListNode;

import java.util.Arrays;
import java.util.Scanner;

public class L2326_SpiralMatrixIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(), n = scanner.nextInt();
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            temp.val = scanner.nextInt();
            temp.next = new ListNode(-1);
            temp = temp.next;
        }

        System.out.println(Arrays.deepToString(spiralMatrix(m, n, listNode)));
    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        int top = 0;
        int bottom = m - 1;
        int right = n - 1;
        int left = 0;

        while (true) {
            if (left > right) {
                break;
            }

            for (int i = left; i <= right; i++) {
                if (head == null) {
                    res[top][i] = -1;
                } else {
                    res[top][i] = head.val;
                    head = head.next;
                }
            }
            top++;

            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                if (head == null) {
                    res[i][right] = -1;
                } else {
                    res[i][right] = head.val;
                    head = head.next;
                }
            }
            right--;

            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                if (head == null) {
                    res[bottom][i] = -1;
                } else {
                    res[bottom][i] = head.val;
                    head = head.next;
                }
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                if (head == null) {
                    res[i][left] = -1;
                } else {
                    res[i][left] = head.val;
                    head = head.next;
                }
            }
            left++;
        }

        return res;
    }
}
