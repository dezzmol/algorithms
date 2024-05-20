package leetcode;

public class StringCompression443 {
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();

        char ch = chars[0];
        int lastPos = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != ch) {
                s.append(ch);
                if (i - lastPos > 1) {
                    s.append(i - lastPos);
                }
                lastPos = i;
                ch = chars[i];
            }
        }
        s.append(chars[lastPos]);
        if (chars.length - lastPos > 1) {
            s.append(chars.length - lastPos);
        }

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.toString().charAt(i);
        }
        return s.length();
    }

    public static void main(String[] args) {
        //char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        //char[] chars = {'a', 'b', 'c', 'c' };
        char[] chars = {'a' };
        System.out.println(compress(chars));
    }
}
