package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description : 一个整数数组 nums，其中总是存在唯一的一个最大整数，
 * 请找出数组中的最大元素并检查它是否至少是数组中每个其他数字的两倍，如
 * 果是则返回最大元素的下标，否则返回 -1
 */
public class EP747 {
    public int dominantIndex(int[] nums) {
        int m = -1, n = -1, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) {
                n = m;
                m = nums[i];
                index = i;
            } else if (nums[i] > n) {
                n = nums[i];
            }
        }
        return m >= n * 2 ? index : -1;
    }
}
