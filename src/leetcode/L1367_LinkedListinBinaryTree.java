package leetcode;

import leetcode.utils.ListNode;
import leetcode.utils.TreeNode;

public class L1367_LinkedListinBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return traverse(root, head, head);
    }

    private static boolean traverse(TreeNode node, ListNode head, ListNode cur) {
        if (cur == null) {
            return true;
        }
        if (node == null) {
            return false;
        }

        if (cur.val == node.val) {
            cur = cur.next;
        } else if (head.val == node.val) {
            head = head.next;
        } else {
            cur = head;
        }

        return traverse(node.left, head, cur) || traverse(node.right, head, cur);
    }
}
