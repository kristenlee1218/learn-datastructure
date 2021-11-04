package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description :给你一个按非递减顺序 排序的整数数组 nums，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序
 */

public class EP977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
