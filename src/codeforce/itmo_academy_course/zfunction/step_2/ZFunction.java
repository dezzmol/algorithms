package codeforce.itmo_academy_course.zfunction.step_2;

import java.util.Scanner;

public class ZFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int[] res = getZFunction(string.toCharArray());

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static int[] getZFunction(char[] chars) {
        int[] res = new int[chars.length];
        for (int i = 1; i < chars.length; i++) {
            int j = 0;
            int k = i;
            while (k < chars.length && j < chars.length && chars[k] == chars[j]) {
                res[i]++;
                j++;
                k++;
            }
        }
        return res;
    }
}
