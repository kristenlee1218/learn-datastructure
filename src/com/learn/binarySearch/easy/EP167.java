package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给定一个已按照升序排列的整数数组 numbers，
 * 请从数组中找出两个数满足相加之和等于目标数 target
 */
public class EP167 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
