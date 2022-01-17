package com.learn.matrix.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description :对一个大小为 n x n 的矩阵而言，如果其每一行和每一
 * 列都包含从 1 到 n 的 全部 整数（含 1 和 n），则认为该矩阵是一个
 * 有效矩阵。一个大小为 n x n 的整数矩阵 matrix，请判断矩阵是否为
 * 一个有效矩阵：如果是返回 true；否则返回 false
 */
public class EP2133 {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> setRow = new HashSet<>(matrix.length);
        Set<Integer> setCol = new HashSet<>(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (!setRow.add(matrix[i][j]) || !setCol.add(matrix[j][i])) {
                    return false;
                }
            }
            setRow.clear();
            setCol.clear();
        }
        return true;
    }
}
