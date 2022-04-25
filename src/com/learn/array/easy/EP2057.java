package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/11/7
 * @description : 一个下标从 0 开始的整数数组 nums，返回 nums 中满足
 * i mod 10 == nums[i] 的最小下标 i；如果不存在这样的下标，返回 -1
 */
public class EP2057 {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
