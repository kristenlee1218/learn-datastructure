package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则
 * 返回 false、如果 A 满足下述条件，那么它是一个山脉数组：nums.length >= 3、
 * 在 0 < i< nums.length - 1条件下，存在 i 使得 A[0] < A[1] < ... A[i-1]
 * < A[i]、A[i] > A[i+1] > ... > A[nums.length - 1]
 */
public class EP941 {
    public boolean validMountainArray(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i]) {
                return false;
            }
            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                return false;
            }
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }
        }
        return count == 1;
    }
}
