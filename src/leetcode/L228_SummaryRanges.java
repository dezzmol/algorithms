package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L228_SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};

        List<String> res = summaryRanges(nums);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 1; i <= nums.length; i++) {
            sb.append(nums[i - 1]);
            counter = 0;
            while (i < nums.length && nums[i] - nums[i - 1] == 1) {
                i++;
                counter++;
            }
            if (counter == 0) {
                result.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            sb.append("->").append(nums[i - 1]);
            result.add(sb.toString());
            sb.setLength(0);
        }

        return result;
    }
}
