package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP283
 */
public class Test9 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
