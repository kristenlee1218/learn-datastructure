package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description : 给定一个长度为 n 的非空整数数组，每次操作将会使 n - 1
 * 个元素增加 1。找出让数组所有元素相等的最小操作次数
 */
public class EP453 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            moves += nums[i] - nums[0];
        }
        return moves;
    }
}
