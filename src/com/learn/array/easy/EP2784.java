package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2023/8/11
 * @description : 一个整数数组 nums，如果它是数组 base[n] 的一个排列，称它是个好数组。
 * base[n] = [1, 2, ..., n - 1, n, n] （换句话说，它是一个长度为 n + 1 且包含 1 到
 * n - 1 恰好各一次，包含 n 两次的一个数组）。比方说，base[1] = [1, 1]，base[3]
 * = [1, 2, 3, 3]。如果数组是一个好数组，请返回 true，否则返回 false
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
