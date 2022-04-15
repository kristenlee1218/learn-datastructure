package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/11/10
 * @description :两个大小为 n x n 的二进制矩阵 mat 和 target。度顺时针轮转矩阵 mat
 * 中的元素若干次，如果能够使 mat 现以 90 与 target 一致，返回 true；否则，返回 false
 */
public class EP1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        return isSameMatrix(mat, target) || isSameMatrix(mat, matrixRotation(target))
                || isSameMatrix(mat, matrixRotation(matrixRotation(target)))
                || isSameMatrix(mat, matrixRotation(matrixRotation(matrixRotation(target))));
    }

    public boolean isSameMatrix(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] matrixRotation(int[][] a) {
        int[][] r = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                r[j][a.length - 1 - i] = a[i][j];
            }
        }
        return r;
    }
}
