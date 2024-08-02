package leetcode;

public class L1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions(String n) {
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = Math.max(result, n.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        String n = "135";
        System.out.println(minPartitions(n));
    }
}
