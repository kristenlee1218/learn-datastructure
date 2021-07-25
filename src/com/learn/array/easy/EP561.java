package com.learn.array.easy;

import java.util.Arrays;
/**
 * @author : Kristen
 * @date : 2021/7/15
 * @description :给定长度为2n的整数数组 nums，
 * 你的任务是将这些数分成n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，
 * 使得从 1 到 n 的 min(ai, bi) 总和最大
 */

public class EP561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int value = 0;
        for (int i = 0; i < nums.length; i += 2) {
            value += nums[i];
        }
        return value;
    }
}
