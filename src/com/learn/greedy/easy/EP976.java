package com.learn.greedy.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成
 * 的、面积不为零的三角形的最大周长。如果不能形成任何面积不为零的三角形，返回 0
 */
public class EP976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i - 1] + nums[i - 2] + nums[i];
            }
        }
        return 0;
    }
}
