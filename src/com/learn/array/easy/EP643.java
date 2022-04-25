package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，
 * 并输出该最大平均数
 */
public class EP643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }
}
