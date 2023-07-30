package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 一个由正整数组成的整数数组 nums，返回
 * 其中可被 3 整除的所有偶数的平均值。注意：n 个元素的平均
 * 值等于 n 个元素求和再除以 n，结果向下取整到最接近的整数
 */
public class EP2455 {
    public int averageValue(int[] nums) {
        int value = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                value += num;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return value / count;
    }
}
