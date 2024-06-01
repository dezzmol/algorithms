package leetcode;

public class RemoveNthNodeFromEndofList19 {
    static class ListNode {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int nodeCount = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            nodeCount++;
        }

        if (nodeCount == 1 && n == 1) {
            return null;
        }

        int nodeForRemove = nodeCount - n - 1;
        node = head;
        int nodeIndex = 0;
        while (nodeIndex < nodeCount && node != null && node.next != null) {
            if (nodeIndex == nodeForRemove) {
                node.next = node.next.next;
            }
            node = node.next;
            nodeIndex++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);

        System.out.println(removeNthFromEnd(node1, 2));
    }
}
