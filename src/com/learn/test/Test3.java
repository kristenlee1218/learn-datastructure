package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test3 {
    public int[] replaceElements(int[] nums) {
        int max = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return nums;
    }
}
