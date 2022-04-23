package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个整数数组，实现一个函数来调整该数组中数字
 * 的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        return result;
    }
}
