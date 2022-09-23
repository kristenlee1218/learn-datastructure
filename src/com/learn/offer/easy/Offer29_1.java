package com.learn.offer.easy;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class Offer29_1 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
        int[] result = new int[(right + 1) * (bottom + 1)];
        while (true) {
            for (int i = left; i <= right; i++) {
                result[x++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                result[x++] = matrix[i][right];
            }
            if (left > --right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                result[x++] = matrix[bottom][i];
            }
            if (top > --bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                result[x++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }
        return result;
    }
}
