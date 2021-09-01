package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description :给你一个整数数组 nums，其中总是存在唯一的一个最大整数
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍
 * 如果是，则返回最大元素的下标，否则返回 -1
 */

public class EP747 {
    public int dominantIndex(int[] nums) {
        int flag = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > flag) {
                flag = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index && flag < nums[i] * 2) {
                index = -1;
                break;
            }
        }
        return index;
    }
}
