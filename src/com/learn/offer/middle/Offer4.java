package com.learn.offer.middle;

/**
 * @author : Kristen
 * @date : 2021/8/5
 * @description :在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean flag = false;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
