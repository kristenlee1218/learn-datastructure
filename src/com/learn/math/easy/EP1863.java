package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2022/1/1
 * @description : 一个数组的异或总和定义为数组中所有元素
 * 按位 XOR 的结果；如果数组为空，则异或总和为 0
 */
public class EP1863 {
    int result = 0;

    public int subsetXORSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        dfs(nums, 0, 0);
        return result;
    }

    public void dfs(int[] nums, int i, int sum) {
        if (i == nums.length) {
            result += sum;
            return;
        }
        dfs(nums, i + 1, sum ^ nums[i]);
        dfs(nums, i + 1, sum);
    }
}
