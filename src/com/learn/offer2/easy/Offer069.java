package com.learn.offer2.easy;

/**
 * @author : Kristen
 * @date : 2022/2/10
 * @description :符合下列属性的数组 arr 称为山脉数组
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 由整数组成的山脉数组 arr，返回任何满足 arr[0] < arr[1]
 * < ... arr[i - 1] < arr[i] > arr[i + 1] > ... >
 * arr[arr.length - 1] 的下标 i
 */
public class Offer069 {
    public int peakIndexInMountainArray(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
