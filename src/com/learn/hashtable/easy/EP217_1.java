package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description : 给定一个整数数组，判断是否存在重复元素。如果任意一值在
 * 数组中出现至少两次，如果任意一值在数组中出现至少两次，函数返回 true。
 * 如果数组中每个元素都不相同，则返回 false
 */
public class EP217_1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
