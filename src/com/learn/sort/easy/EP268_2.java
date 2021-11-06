package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :给定一个包含 [0, n]中 n 个数的数组 nums，
 * 找出 [0, n] 这个范围内没有出现在数组中的那个数
 */
public class EP268_2 {
    public int missingNumber(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}
