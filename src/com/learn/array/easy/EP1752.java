package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给你一个数组 nums、所有元素与 nums 相同，但按非递减顺序排列、
 * 如果 nums 能够由源数组轮转若干位置（包括 0 个位置）得到，则返回 true；否则返回 false
 */
public class EP1752 {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
    }
}
