package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description : 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 * <p>
 * 如果 x 是正数，返回 1
 * 如果 x 是负数，返回 -1
 * 如果 x 是等于 0，返回 0
 * 给你一个整数数组 nums。令 product 为数组 nums 中所有元素值的乘积
 */

public class EP1822 {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
