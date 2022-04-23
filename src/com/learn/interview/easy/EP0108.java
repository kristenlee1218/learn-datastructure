package com.learn.interview.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 编写一种算法，若 M × N 矩阵中某个元素为 0，则将其所在的行与列清零
 */
public class EP0108 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (Integer i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        while (!x.isEmpty()) {
            Integer temp = x.iterator().next();
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[temp][i] = 0;
            }
            x.remove(temp);
        }
        while (!y.isEmpty()) {
            Integer temp = y.iterator().next();
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][temp] = 0;
            }
            y.remove(temp);
        }
    }
}
