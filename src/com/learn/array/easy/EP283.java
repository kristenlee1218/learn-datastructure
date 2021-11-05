package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :给定一个数组 nums，编写一个函数将所有 0
 * 移动到数组的末尾，同时保持非零元素的相对顺序
 */
public class EP283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > index) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
