package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个 n * n 的网格 grid，上面放置着一些 1 x 1 x 1 的正
 * 方体。每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * 放置好正方体后，任何直接相邻的正方体都会互相粘在一起，形成一些不规则的三维
 * 形体。请返回最终这些形体的总表面积。注意：每个形体的底面也需要计入表面积中
 */
public class EP892 {
    public int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int level = grid[i][j];
                if (level > 0) {
                    area += (level << 2) + 2;
                    area -= i > 0 ? Math.min(level, grid[i - 1][j]) << 1 : 0;
                    area -= j > 0 ? Math.min(level, grid[i][j - 1]) << 1 : 0;
                }
            }
        }
        return area;
    }
}
