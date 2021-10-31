package com.learn.binarySearch.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :一个整数数组 nums 和整数 k，返回最大和 sum，
 * 满足存在 i < j 使得 nums[i] + nums[j] = sum 且 sum < k。
 * 如果没有满足此等式的 i,j 存在，则返回 -1
 */
public class EP1099 {
    public int twoSumLessThanK(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        int result = -1;
        while (low < high) {
            if (nums[low] + nums[high] >= k) {
                high--;
            } else {
                result = Math.max(nums[low] + nums[high], result);
                low++;
            }
        }
        return result;
    }
}
