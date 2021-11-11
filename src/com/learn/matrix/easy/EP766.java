package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个 m x n 的矩阵 matrix。如果这个矩阵是托普利茨矩阵，
 * 返回 true；否则返回 false、如果矩阵上每一条由左上到右下的对角线上的元素
 * 都相同，那么这个矩阵是托普利茨矩阵（[[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * 为 true）
 */
public class EP766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
