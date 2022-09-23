package com.learn.offer.middle;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
        int col = matrix[0].length;
        int[] result = new int[row * col];
        int index = 0;
        int left = 0, top = 0, right = col - 1, bottom = row - 1;
        while (true) {
            // 从左往右走
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            // 从上往下走
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            if (--right < left) {
                break;
            }
            // 从右往左走
            for (int i = right; i >= left; i--) {
                result[index++] = matrix[bottom][i];
            }
            if (--bottom < top) {
                break;
            }
            // 从下往上走
            for (int i = bottom; i >= top; i--) {
                result[index++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }
        return result;
    }
}
