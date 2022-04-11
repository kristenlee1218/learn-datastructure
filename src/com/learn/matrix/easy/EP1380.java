package com.learn.matrix.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个 m * n 的矩阵，矩阵中的数字各不相同。
 * 请按任意顺序返回矩阵中的所有幸运数
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 */
public class EP1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            row[i] = matrix[i][0];
            for (int j = 0; j < matrix[0].length; j++) {
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == col[j]) {
                    list.add(row[i]);
                }
            }
        }
        return list;
    }
}
