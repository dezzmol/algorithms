package coderun.season_2;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyNumber424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(arrToString(solve(s)));
    }

    public static int[] solve(String s) {
        char[] chars = s.toCharArray();

        int[] arr = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        long left = getSumOfRange(arr, 0, arr.length / 2);
        long right = getSumOfRange(arr, arr.length / 2, arr.length);

        if (left == 0 && right == 0) {
            arrayOfZero(arr);
        }

        if (left > right) {
            leftGreater(arr, left, right);
        } else if (right > left) {
            rightGreater(arr, left, right);
        } else {
            increaseNumber(arr, 1, arr.length - 1);
            left = getSumOfRange(arr, 0, arr.length / 2);
            right = getSumOfRange(arr, arr.length / 2, arr.length);
            if (left == 0 && right == 0) {
                arr[(arr.length / 2) - 1] = 1;
                arr[arr.length - 1] = 1;
                return arr;
            }
            rightGreater(arr, left, right);
        }
        return arr;
    }

    private static long getSumOfRange(int[] arr, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int[] leftGreater(int[] arr, long left, long right) {
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            if (right == left) {
                return arr;
            }
            if (right > left) {
                long diff = right - left;
                arr[i + 1] = (int) (arr[i + 1] - diff);
                return arr;
            }
            right += 9 - arr[i];
            arr[i] = 9;
        }
        if (right > left) {
            long diff = right - left;
            arr[arr.length / 2] = (int) (arr[arr.length / 2] - diff);
        }
        return arr;
    }

    private static int[] rightGreater(int[] arr, long left, long right) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (left == right) {
                return arr;
            }
            if (left > right) {
                return leftGreater(arr, left, right);
            }
            increaseNumber(arr, 10 - arr[i], i);
            right = getSumOfRange(arr, arr.length / 2, arr.length);

            left = getSumOfRange(arr, 0, arr.length / 2);

        }
        if (left > right) {
            return leftGreater(arr, left, right);
        }
        return arr;
    }

    private static void increaseNumber(int[] arr, long diff, int pos) {
        if (pos < 0) {
            arrayOfZero(arr);
            return;
        }
        arr[pos] += (int) diff;
        if (arr[pos] > 9) {
            long carry = arr[pos] / 10;
            arr[pos] %= 10;
            increaseNumber(arr, carry, pos - 1);
        }
    }

    private static void arrayOfZero(int[] arr) {
        Arrays.fill(arr, 0);
    }

    private static String arrToString(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int j : arr) {
            s.append(j);
        }
        return s.toString();
    }
}