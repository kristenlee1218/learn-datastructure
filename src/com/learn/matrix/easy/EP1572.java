package com.learn.matrix.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个正方形矩阵 mat，请返回在矩阵主对角线上的元素
 * 和副对角线上且不在主对角线上元素的和
 */
public class EP1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            mat[i][i] = 0;
        }
        for (int i = 0; i < mat.length; i++) {
            sum += mat[mat.length - 1 - i][i];
        }
        return sum;
    }
}
