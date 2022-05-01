package com.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] mat = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            mat[i / c][i % c] = nums[i / n][i % n];
        }
        return mat;
    }
}