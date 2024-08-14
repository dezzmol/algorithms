package leetcode;

import leetcode.utils.ListNode;

public class L2181_MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode start = new ListNode(0, head);
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == 0) {
                ListNode next = temp.next;
                int counter = 1;
                while (next.next != null || next.val != 0) {
                    next = next.next;
                    counter++;
                }
                temp.next = new ListNode(counter, next);
            }
            temp = temp.next;
        }

        return head;
    }
}
