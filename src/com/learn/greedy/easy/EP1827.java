package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 nums（下标从 0 开始）。每一次操作中，
 * 可以选择数组中一个元素，并将它增加 1、如果 nums = [1,2,3] ，
 * 可以选择增加 nums[1]得到 nums = [1,3,3]。请返回使 nums 严格递增
 * 的最少操作次数
 */
public class EP1827 {
    public int minOperations(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] <= nums[i]) {
                count += (nums[i] + 1 - nums[i + 1]);
                nums[i + 1] = nums[i] + 1;
            }
        }
        return count;
    }
}
