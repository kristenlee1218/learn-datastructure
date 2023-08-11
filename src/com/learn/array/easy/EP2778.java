package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/11
 * @description : 一个下标从 1 开始、长度为 n 的整数数组 nums。对 nums 中的元素 nums[i]如果 n 能
 * 够被 i 整除，即 n % i == 0，则认为 num[i] 是一个 特殊元素。返回 nums 中所有特殊元素的平方和
 */
public class EP2778 {
    public int sumOfSquares(int[] nums) {
        int count = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (len % (i + 1) == 0) {
                count += nums[i] * nums[i];
            }
        }
        return count;
    }
}
