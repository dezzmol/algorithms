package leetcode;

import java.util.Arrays;

public class L338_CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            res[i] = res[i / 2] + i % 2;
        }
        return res;
    }


}
