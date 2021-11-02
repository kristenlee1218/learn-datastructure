package com.learn.binarySearch.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :
 */
public class EP1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] > nums.length - 1) {
            return nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums.length - i && nums[i - 1] < nums.length - i) {
                return nums.length - i;
            }
        }
        return -1;
    }
}
