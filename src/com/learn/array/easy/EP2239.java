package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/4/22
 * @description : 一个长度为 n 的整数数组 nums，请返回 nums
 * 中最接近 0 的数字。如果有多个答案，请返回它们中的最大值
 */
public class EP2239 {
    public int findClosestNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(result)) {
                result = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(result)) {
                if (nums[i] > result) {
                    result = nums[i];
                }
            }
        }
        return result;
    }
}
