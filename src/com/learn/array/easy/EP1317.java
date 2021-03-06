package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :「无零整数」是十进制表示中不含任何 0 的正整数。
 * 一个整数 n，请返回一个由两个整数组成的列表 [A, B]，满足：
 * A 和 B 都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。如果存在多个有效解决方案，
 * 可以返回其中任意一个
 */
public class EP1317 {
    public int[] getNoZeroIntegers(int n) {
        int[] nums = new int[2];
        if (n <= 10) {
            nums[0] = 1;
            nums[1] = n - 1;
            return nums;
        }
        int length = (int) Math.log10(n);
        nums[0] = (int) Math.pow(10, length) - 1;
        nums[1] = n - nums[0];
        int temp = nums[1];
        int index = 1;
        while (temp > 0) {
            if (temp % 10 == 0) {
                nums[0] -= index;
                nums[1] += index;
            }
            index *= 10;
            temp = temp / 10;
        }
        return nums;
    }
}
