package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 在一个 n * m 的二维数组中，每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Offer4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
