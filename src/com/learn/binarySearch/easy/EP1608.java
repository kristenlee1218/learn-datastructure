package com.learn.binarySearch.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :一个非负整数数组 nums。如果存在一个数 x，使得 nums
 * 中恰好有 x 个元素大于或者等于 x，那么就称 nums 是一个特殊数组，而 x
 * 是该数组的特征值
 */
public class EP1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] > nums.length - 1) {
            return nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums.length - i && nums[i - 1] < nums.length - i) {
                return nums.length - i;
            }
        }
        return -1;
    }
}
