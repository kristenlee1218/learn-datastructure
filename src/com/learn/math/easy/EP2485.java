package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 一个正整数 n，找出满足下述条件的中枢整数 x：
 * 1 和 x 之间的所有元素之和等于 x 和 n 之间所有元素之和。返回中枢整数 x。
 * 如果不存在中枢整数，则返回 -1。保证对于给定的输入，至多存在一个中枢整数
 */
public class EP2485 {
    public int pivotInteger(int n) {
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = nums[i - 1] + i;
        }
        for (int i = 1; i <= n; i++) {
            if (nums[i] == nums[n] - nums[i] + i) {
                return i;
            }
        }
        return -1;
    }
}
