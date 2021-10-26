package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 nums（下标从 0 开始）。每一次操作中，可以选择数组中一个元素，
 * 并将它增加 1、如果 nums = [1,2,3] ，可以选择增加 nums[1] 得到 nums = [1,3,3]。
 * 请返回使 nums 严格递增的最少操作次数
 */
public class EP1827 {
    public int minOperations(int[] nums) {
        int count = 0;
        int sub;
        if (nums.length == 1) {
            return count;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                sub = nums[i] + 1 - nums[i + 1];
                nums[i + 1] = nums[i] + 1;
                count += sub;
            }
        }
        return count;
    }
}
