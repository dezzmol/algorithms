package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L560_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int subarray_sum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            subarray_sum += nums[i];

            if (map.containsKey(subarray_sum - k)) {
                res += map.get(subarray_sum - k);
            }
            if (!map.containsKey(subarray_sum)) {
                map.put(subarray_sum, 0);
            }
            map.put(subarray_sum, map.get(subarray_sum) + 1);
        }
        return res;
    }
}
