package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/7/15
 * @description : 给定一个排序数组和一个目标值，在数组中找到目标值，并
 * 返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 */
public class EP35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
