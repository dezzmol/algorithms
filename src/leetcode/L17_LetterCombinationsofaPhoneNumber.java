package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L17_LetterCombinationsofaPhoneNumber {
    static Map<Integer, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> res = new ArrayList<>();
        char[] chars = digits.toCharArray();
        int[] d = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            d[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        solve(res, new StringBuilder(), d, 0);
        return res;
    }

    private static void solve(List<String> res, StringBuilder cur, int[] digits, int index) {
        if (index == digits.length) {
            res.add(new String(cur));
            return;
        }
        char[] chars = map.get(digits[index]).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            cur.append(chars[i]);
            solve(res, cur, digits, index + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
