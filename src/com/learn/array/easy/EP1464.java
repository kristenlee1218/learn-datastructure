package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 nums，请选择数组的两个不同下标 i 和 j，
 * 使 (nums[i]-1)*(nums[j]-1) 取得最大值、请计算并返回该式的最大值
 */
public class EP1464 {
    public int maxProduct(int[] nums) {
        int result;
        Arrays.sort(nums);
        result = (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        return result;
    }
}
