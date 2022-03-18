package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个数组「动态和」的计算公式为：
 * runningSum[i] = sum(nums[0]…nums[i])、请返回 nums 的动态和
 */
public class EP1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
