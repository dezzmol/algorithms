package leetcode;

import java.util.*;

public class L49_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>(strs.length);
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String string = new String(chars);
            if (map.containsKey(string)) {
                List<Integer> list = map.get(string);
                list.add(i);
                map.put(string, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(string, list);
            }
        }

        for (List<Integer> indices : map.values()) {
            List<String> group = new ArrayList<>();
            for (int index : indices) {
                group.add(strs[index]);
            }
            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
