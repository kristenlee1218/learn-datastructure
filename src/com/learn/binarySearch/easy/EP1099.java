package com.learn.binarySearch.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :一个整数数组 nums 和整数 k，返回最大和 sum，满足存在 i < j 使得
 * nums[i] + nums[j] = sum 且 sum < k。如果没有满足此等式的 i,j 存在，则返回 -1
 */
public class EP1099 {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int result = 0;
        while (i < j) {
            int value = nums[i] + nums[j];
            if (value >= k) {
                j--;
            } else {
                i++;
                result = Math.max(result, value);
            }
        }
        return result == 0 ? -1 : result;
    }
}
