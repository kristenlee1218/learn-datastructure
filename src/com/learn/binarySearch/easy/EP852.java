package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description : 由整数组成的山脉数组 nums，返回任何满足 nums[0] < nums[1] < ...
 * nums[i - 1] < nums[i] > nums[i + 1] > ... > nums[nums.length - 1] 的下标 i
 */
public class EP852 {
    public int peakIndexInMountainArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
