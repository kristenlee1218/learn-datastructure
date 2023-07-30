package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description : 一个整型数组 nums，在数组中找出由三个数组成的最大乘积，并输出这个乘积
 */
public class EP628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
