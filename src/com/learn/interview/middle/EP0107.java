package com.learn.interview.middle;

/**
 * @author : Kristen
 * @date : 2022/1/31
 * @description :一幅由 N × N 矩阵表示的图像，其中每个像素的大小为
 * 4 字节。请设计一种算法，将图像旋转 90 度、不占用额外内存空间能否做到？
 */
public class EP0107 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][len - 1 - i];
                matrix[len - 1 - j][len - 1 - i] = temp;
            }
        }
    }
}
