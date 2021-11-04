package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
            count++;
        }
        return nums.length - count;
    }
}
