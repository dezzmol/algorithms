package coderun.season_2;

import org.junit.jupiter.api.Test;

import static coderun.season_2.LuckyNumber424.*;

public class LuckyNumberTests {
    public static void main(String[] args) {
//        int start = 10;
//        int end = 1_000_000_000;
//
//        for (int number = start; number < end; number++) {
//            if (countDigits(number) % 2 == 0) {
//                String f = arrToString(solve(String.valueOf(number)));
//                String s = forceSolve(String.valueOf(number));
//                if (!f.equals(s)) {
//                    System.out.print(number + " ");
//                    System.out.println("first: " + f + " second: " + s);
//                }
//            }
//        }
//        for (int number = start; number < end; number++) {
//            if (countDigits(number) % 2 == 0) {
//                long startTime = System.nanoTime();
//                String s = forceSolve(String.valueOf(number));
//                long endTime = System.nanoTime();
//                System.out.println(number + " : " + s + " time:" + (endTime - startTime));
//            }
//        }
        String str1 = "5".repeat(10000) + "1".repeat(10000);
        String str2 = "1".repeat(10000) + "5".repeat(10000);
        String str3 = "8".repeat(10000) + "0".repeat(10000);
        String str4 = "0".repeat(10000) + "8".repeat(10000);
        String str5 = "0".repeat(10000);
        String str6 = "9".repeat(10000);
        printArray(solve(str1));
        printArray(solve(str2));
        printArray(solve(str3));
        printArray(solve(str4));
        printArray(solve(str5));
        printArray(solve(str6));
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    private static String forceSolve(String s) {
        char[] chars = s.toCharArray();

        int[] arr = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        long l = getSumOfSubArray(arr, 0, arr.length / 2);
        long r = getSumOfSubArray(arr, arr.length / 2, arr.length);

        if (l == r) {
            increaseNumber(arr, 1, arr.length - 1);
            r = getSumOfSubArray(arr, arr.length / 2, arr.length);
        }

        while (l != r) {
            increaseNumber(arr, 1, arr.length - 1);
            l = getSumOfSubArray(arr, 0, arr.length / 2);
            r = getSumOfSubArray(arr, arr.length / 2, arr.length);
        }

        return arrToString(arr);
    }

}
