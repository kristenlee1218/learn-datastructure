package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个整数类型的数组 nums，请编写一个能够返回数组
 * “中心索引” 的方法。如果数组不存在中心索引，返回 -1。如果数组有多个中
 * 心索引，应该返回最靠近左边的那一个
 *
 * 中心索引：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和
 */
public class EP724 {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
