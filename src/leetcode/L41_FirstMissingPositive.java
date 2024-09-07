package leetcode;

import java.util.Arrays;

public class L41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int[] a = Arrays.stream(nums).filter(n -> n > 0).toArray();
        Arrays.sort(a);

        int count = 1;
        for (int j : a) {
            if (j == count) {
                count++;
            } else if (j > count) {
                return count;
            }
        }

        return a.length + 1;
    }
}
