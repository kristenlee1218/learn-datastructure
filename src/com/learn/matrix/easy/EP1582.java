package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :一个大小为 rows x cols 的矩阵 mat，其中
 * mat[i][j] 是 0 或 1，请返回矩阵 mat 中特殊位置的数目
 */
public class EP1582 {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
