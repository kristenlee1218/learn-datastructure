package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 给一个正整数数组 arr ，请计算所有可能的奇数长度子数组的和。
 * 子数组定义为原数组中的一个连续子序列。请返回 arr 中所有奇数长度子数组的和
 */
public class EP1588 {
    public int sumOddLengthSubarrays(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (((j - i) % 2) == 0) {
                    sum += temp;
                }
            }
        }
        return sum;
    }
}
