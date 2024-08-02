package leetcode;

import java.util.HashSet;
import java.util.Set;

public class L3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);

            if (!set.contains(c)) {
                set.add(c);
                result = Math.max(result, right - left + 1);
                right++;
            } else {
                while (set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
