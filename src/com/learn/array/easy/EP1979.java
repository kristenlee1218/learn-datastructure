package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个整数数组 nums，返回数组中最大数和最小数的最大公约数。
 * 两个数的最大公约数是能够被两个数整除的最大正整数
 */
public class EP1979 {
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
