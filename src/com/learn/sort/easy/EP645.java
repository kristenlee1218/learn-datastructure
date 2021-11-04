package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description : 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，
 * 导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
 * 导致集合丢失了一个数字并且有一个数字重复。给定一个数组 nums 代表了集合 S 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回
 */

public class EP645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        return new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
}
