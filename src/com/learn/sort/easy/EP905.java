package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个非负整数数组 nums，返回一个数组，在该数组中，
 * nums 的所有偶数元素之后跟着所有奇数元素
 */
public class EP905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                result[index++] = num;
            }
        }
        return result;
    }
}
