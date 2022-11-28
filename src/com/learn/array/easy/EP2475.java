package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/11/28
 * @description : 一个下标从 0 开始的正整数数组 nums。请找出并统计满足下述条件的三元组
 * (i, j, k) 的数目：0 <= i < j < k < nums.length、nums[i] != nums[j]、
 * nums[i] != nums[k] 且 nums[j] != nums[k]、返回满足上述条件三元组的数目
 */
public class EP2475 {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int result = 0, start = 0, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] != nums[i]) {
                result += start * (i - start + 1) * (n - 1 - i);
                start = i + 1;
            }
        }
        return result;
    }
}
