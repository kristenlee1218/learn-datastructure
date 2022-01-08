package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 nums 每一次操作中，可以选择数组中一个元素，
 * 并将它增加 1、如果 nums = [1,2,3]，可以选择增加 nums[1] 得到 nums
 * = [1,3,3]。请返回使 nums 严格递增的最少操作次数
 */
public class EP1827 {
    public int minOperations(int[] nums) {
        int count = 0, min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                min = nums[i];
            } else {
                min++;
                count += min - nums[i];
            }
        }
        return count;
    }
}
