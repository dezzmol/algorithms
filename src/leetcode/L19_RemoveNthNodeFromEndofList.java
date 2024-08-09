package leetcode;

import leetcode.utils.ListNode;

public class L19_RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1, head);
        ListNode fast = head;

        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            temp = temp.next;
            fast = fast.next;
        }

        if (temp.next == head) {
            head = temp.next.next;
        }
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);

        System.out.println(removeNthFromEnd(node1, 2));
    }
}
