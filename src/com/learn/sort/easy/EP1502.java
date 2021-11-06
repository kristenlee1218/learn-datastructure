package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个数字数组 arr、如果一个数列中，任意相邻两项的差总
 * 等于同一个常数，那么这个数列就称为 等差数列如果可以重新排列数组形成
 * 等差数列，请返回 true、否则返回 false
 */
public class EP1502 {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        int d = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != d) {
                return false;
            }
        }
        return true;
    }
}
