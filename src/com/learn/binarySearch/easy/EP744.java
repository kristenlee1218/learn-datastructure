package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description :一个排序后的字符列表 letters，列表中只包含小写英文字母。另
 * 一个目标字母 target，请寻找在这一有序列表里比目标字母大的最小字母。
 */
public class EP744 {
    public int peakIndexInMountainArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
