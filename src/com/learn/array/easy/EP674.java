package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description :给定一个未经排序的整数数组，找到最长且连续递增的子序列，
 * 并返回该序列的长度。
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
