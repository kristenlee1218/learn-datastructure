package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给一个 m * n 的矩阵 grid，矩阵中的元素无论是按
 * 行还是按列，都以非递增顺序排列、请统计并返回 grid 中负数的数目
 */
public class EP1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
