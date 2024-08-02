package leetcode;

public class L2807_InsertGreatestCommonDivisorsinLinkedList {
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

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode listNode = head;
        while (listNode.next.next != null) {
            listNode.next = new ListNode(gcd(listNode.val, listNode.next.val), listNode.next);
            listNode = listNode.next.next;
        }
        return head;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
