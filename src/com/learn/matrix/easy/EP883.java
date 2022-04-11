package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :在 N * N 的网格中，我们放置了一些与 x，y，z 三轴对齐的
 * 1 * 1 * 1 立方体。每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格
 * (i, j) 上。现在，我们查看这些立方体在 xy、yz 和 zx 平面上的投影。
 * 投影就像影子，将三维形体映射到一个二维平面上。在这里，从顶部、
 * 前面和侧面看立方体时，会看到“影子”。返回所有三个投影的总面积。
 */
public class EP883 {
    public int projectionArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; ++i) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < grid.length; ++j) {
                if (grid[i][j] > 0) {
                    result++;
                }
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }
            result += row + col;
        }
        return result;
    }
}
