package com.learn.greedy.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :给定一个整数数组 A，只能用以下方法修改该数组：选择某个索
 * 引 i 并将 A[i] 替换为 -A[i]，然后总共重复这个过程 K 次（可以多次选择同
 * 一个索引 i）、以这种方式修改数组后，返回数组可能的最大和
 */
public class EP1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}