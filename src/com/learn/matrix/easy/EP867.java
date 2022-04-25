package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个二维整数数组 matrix，返回 matrix的转置矩阵、
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引
 */
public class EP867 {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result
                ;
    }
}
