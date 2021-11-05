package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description :给定一个长度为 n 的非空整数数组，每次操作将会使 n - 1
 * 个元素增加 1。找出让数组所有元素相等的最小操作次数
 */
public class EP453_1 {
    public int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            moves += num;
            min = Math.min(min, num);
        }
        return moves - min * nums.length;
    }
}
