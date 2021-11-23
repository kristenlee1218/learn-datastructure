package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description :给定一个未经排序的整数数组，找到最长且连续递增的子序列，
 * 并返回该序列的长度。连续递增的子序列可以由两个下标 l 和 r（l < r）确定，
 * 如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1]，那么子序列 [nums[l],
 * nums[l + 1], ..., nums[r - 1], nums[r]]就是连续递增子序列
 */

public class EP674 {
    public int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(count, result);
        }
        return result;
    }
}
