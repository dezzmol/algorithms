package leetcode;

import leetcode.utils.ListNode;

import java.util.*;

public class L3217_DeleteNodesFromLinkedListPresentinArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> integers = new ArrayList<>();

        while (temp != null) {
            if (!set.contains(temp.val)) {
                integers.add(temp.val);
            }
            temp = temp.next;
        }

        ListNode res = new ListNode(0);
        temp = res;
        for (int i = 0; i < integers.size(); i++) {
            temp.val = integers.get(i);
            if (i != integers.size() - 1) {
                temp.next = new ListNode(0);
            }
            temp = temp.next;
        }

        return res;
    }
}
