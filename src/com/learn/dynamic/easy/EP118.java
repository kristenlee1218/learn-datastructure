package com.learn.dynamic.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和
 */
public class EP118 {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> list = new ArrayList<>();
        int[][] result = new int[row][row];
        for (int i = 0; i < row; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                }
                subList.add(result[i][j]);
            }
            list.add(subList);
        }
        return list;
    }
}
