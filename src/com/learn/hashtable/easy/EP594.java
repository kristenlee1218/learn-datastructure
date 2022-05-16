package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description : 和谐数组是一个数组里元素的最大值和最小值之间的差别
 * 正好是 1。一个整数组 nums，请在所有可能的子序列中找到最长的和谐子序
 * 列的长度。数组的子序列是一个由数数组派生出来的序列，它可以通过删除一
 * 些元素或不删除元素、且不改变其余元素的顺序而得到
 */
public class EP594 {
    public int findlhs(int[] nums) {
        Arrays.sort(nums);
        int i = 0, result = 0;
        for (int j = 0; j < nums.length; j++) {
            while (nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                result = Math.max(result, j - i + 1);
            }
        }
        return result;
    }
}
