package leetcode;

public class L1945_SumofDigitsofStringAfterConvert {
    public int getLucky(String s, int k) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            while (num > 0) {
                res += num % 10;
                num /= 10;
            }
        }

        for (int i = 1; i < k; i++) {
            res = getSum(res);
        }
        return res;
    }

    private static int getSum(long num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}
