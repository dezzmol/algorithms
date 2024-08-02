package leetcode;



public class L206_ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp.next != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }
}
