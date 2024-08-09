package leetcode;

import leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class L1721_SwappingNodesinaLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);

        System.out.println(swapNodes(head, 2));
    }
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
            temp = temp.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        int tempInt = temp.val;
        temp.val = slow.val;
        slow.val = tempInt;

        return head;
    }
}
