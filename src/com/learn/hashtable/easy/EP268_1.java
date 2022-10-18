package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description : 给定一个包含 [0, n] 中 n 个数的数组 nums，
 * 找出 [0, n] 这个范围内没有出现在数组中的那个数
 */
public class EP268_1 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
