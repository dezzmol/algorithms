package leetcode;

import leetcode.utils.ListNode;

public class L24_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(-1, head);

        for (ListNode curr = root; curr.next != null && curr.next.next != null; curr = curr.next.next) {
            ListNode left = curr.next;
            ListNode right = left.next;

            left.next = right.next;
            right.next = left;
            curr.next = right;
        }

        return root.next;
    }
}
