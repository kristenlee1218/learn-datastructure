package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/3/24
 * @description :一个整数数组 nums 和一个整数 k。找到 nums 中长度为
 * k 的子序列，且这个子序列的和最大。请返回任意一个长度为 k 的整数子序列。
 * 子序列定义为从一个数组里删除一些元素后，不改变剩下元素的顺序得到的数组
 */
public class EP2099 {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - 1 - i];
        }
        return result;
    }
}
