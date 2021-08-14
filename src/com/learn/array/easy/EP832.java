package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给定一个二进制矩阵 A，想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]、
 * 反转图片的意思是图片中的 0 全部被 1 替换 1 全部被 0 替换。例如反转 [0, 1, 1] 的结果是 [1, 0, 0]
 */
public class EP832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int x = A.length, y = A[0].length;
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                // 从后往前赋值，同时取反
                B[i][y - j - 1] = 1 - A[i][j];
            }
        }
        return B;
    }
}
