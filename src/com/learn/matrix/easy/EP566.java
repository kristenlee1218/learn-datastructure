package com.learn.matrix.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description : 在 MATLAB 中，有一个非常有用的函数 reshape，它
 * 可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保
 * 留其原始数据。一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整
 * 数 r 和 c，分别表示想要的重构的矩阵的行数和列数。重构后的矩阵需要
 * 将原始矩阵的所有元素以相同的行遍历顺序填充。如果具有给定参数的
 * reshape 操作是可行且合理的，则输出新的重塑矩阵；否则输出原始矩阵
 */
public class EP566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int col = mat.length;
        int row = mat[0].length;
        if (col * row != r * c) {
            return mat;
        }

        int m = 0;
        int n = 0;
        int[][] newMat = new int[r][c];
        for (int[] mats : mat) {
            for (int j = 0; j < row; j++) {
                newMat[m][n++] = mats[j];
                if (n == c) {
                    n = 0;
                    m++;
                }
            }
        }
        return newMat;
    }
}
