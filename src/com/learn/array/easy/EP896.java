package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。
 * 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false
 */
public class EP896 {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increase = false;
            }
            if (nums[i] < nums[i + 1]) {
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
