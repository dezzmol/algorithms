package leetcode;

import leetcode.utils.ListNode;

public class L2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(listNode1, listNode2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = new ListNode(0, res);
        int next = 0;

        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + next;
            if (val < 10) {
                next = 0;
            }
            if (val > 9) {
                next = val / 10;
                val %= 10;
            }
            if (temp.next == res) {
                res.val = val;
            } else {
                temp.next = new ListNode(val);
            }
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (next > 0) {
            int val = next & 10;
            next /= 10;
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return res;
    }
}
