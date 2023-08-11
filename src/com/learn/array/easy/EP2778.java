package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/11
 * @description :
 */
public class EP2778 {
    public int sumOfSquares(int[] nums) {
        // 记录结果
        int count = 0, len = nums.length;
        // 在内存中的下标依旧为0
        for (int i = 0; i < len; i++) {
            // 题干中下标从1开始
            if (len % (i + 1) == 0) {
                // 记录符合条件的平方和
                count += nums[i] * nums[i];
            }
        }
        return count;
    }
}
