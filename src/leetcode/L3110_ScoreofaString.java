package leetcode;

public class L3110_ScoreofaString {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            sum += Math.abs(chars[i] - chars[i + 1]);
        }
        return sum;
    }
}
