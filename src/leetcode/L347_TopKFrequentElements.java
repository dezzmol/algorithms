package leetcode;

import java.util.*;

public class L347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        List<Integer> list = new ArrayList<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> list.add(entry.getKey()));
        int[] res = new int[k];
        int index = list.size() - 1;
        for (int i = 0; i < k; i++) {
            res[i] = list.get(index--);
        }

        return res;
    }
}
