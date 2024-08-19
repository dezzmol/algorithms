package leetcode;

public class L125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+","").toLowerCase();
        char[] chars = s.toCharArray();

        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            if ((chars[l] < 'a' || chars[l] > 'z') && (chars[l] < '0' || chars[l] > '9')) {
                l++;
                continue;
            }
            if ((chars[r] < 'a' || chars[r] > 'z') && (chars[r] < '0' || chars[r] > '9')) {
                r--;
                continue;
            }
            if (chars[r] != chars[l]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
