package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP27
 */
public class Test2 {
    public int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}

