package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description : 集合 s 包含从 1 到 n 的整数。因为数据错误，
 * 导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导
 * 致集合丢失了一个数字并且有一个数字重复。给定一个数组 nums 代
 * 表了集合 S 发生错误后的结果。请找出重复出现的整数，再找到丢失
 * 的整数，将它们以数组的形式返回
 */
public class EP645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int pre = 0;
        for (int num : nums) {
            if (num == pre) {
                result[0] = pre;
            } else if (num - pre > 1) {
                result[1] = pre + 1;
            }
            pre = num;
        }
        if (nums[nums.length - 1] != nums.length) {
            result[1] = nums.length;
        }
        return result;
    }
}
