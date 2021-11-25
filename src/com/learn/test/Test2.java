
package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP27
 */
public class Test2 {
    public int removeElement(int[] nums, int value) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

