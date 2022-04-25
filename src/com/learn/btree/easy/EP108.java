package com.learn.btree.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个整数数组 nums，其中元素已经按升序排列，请将其
 * 转换为一棵高度平衡二叉搜索树、高度平衡二叉树是一棵满足
 * 「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树
 */
public class EP108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        TreeNode node;
        int mid;
        if (left > right) {
            return null;
        } else {
            node = new TreeNode();
            mid = (left + right) / 2;
            node.val = nums[mid];
            node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
            node.right = sortedArrayToBSTHelper(nums, mid + 1, right);
            return node;
        }
    }
}
