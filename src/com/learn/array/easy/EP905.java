package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个非负整数数组 A，返回一个数组，在该数组中，A 的所有偶数元素之后跟着所有奇数元素
 */
public class EP905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[t++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                result[t++] = nums[i];
            }
        }
        return result;
    }
}
