package leetcode;

import leetcode.utils.TreeNode;

import java.util.List;

public class L654_MaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};

        constructMaximumBinaryTree(nums);
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return generateTree(nums, 0, nums.length - 1);
    }

    private static TreeNode generateTree(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int max = nums[start];
        int maxIndex = start;
        for (int i = start; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = generateTree(nums, start, maxIndex - 1);
        node.right = generateTree(nums, maxIndex + 1, end);

        return node;
    }
}
