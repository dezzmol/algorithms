package leetcode;

import java.util.Arrays;

public class L242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }
}
