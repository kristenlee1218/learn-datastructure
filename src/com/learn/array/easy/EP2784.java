package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2023/8/11
 * @description :
 */
public class EP2784 {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int n = len - 1;
        if (nums[len - 1] != n) {
            return false;
        }
        for (int i = 0, j = 1; i < len - 1; i++, j++) {
            if (nums[i] != j) {
                return false;
            }
        }
        return true;
    }
}
