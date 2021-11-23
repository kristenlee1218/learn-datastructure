
package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                decrease = false;
            }
            if (nums[i] > nums[i + 1]) {
                increase = false;
            }
        }
        return increase || decrease;
    }
}

