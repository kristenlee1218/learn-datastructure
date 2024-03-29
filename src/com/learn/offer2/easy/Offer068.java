package com.learn.offer2.easy;

/**
 * @author : Kristen
 * @date : 2022/2/10
 * @description : 给定一个排序数组和一个目标值，在数组中找到目标值，
 * 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置、
 * 可以假设数组中无重复元素
 */
public class Offer068 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
