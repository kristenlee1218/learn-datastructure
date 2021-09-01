package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么应该返回最靠近左边的那一个
 * 中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和
 */
public class EP724 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = 0, leftsum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int j = 0; j < nums.length; j++) {
            if (leftsum == sum - leftsum - nums[j]) {
                return j;
            }
            leftsum += nums[j];
        }
        return -1;
    }
}
