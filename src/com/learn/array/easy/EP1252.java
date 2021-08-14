package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0、
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和
 * 列（从 0 开始编号）、需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1、
 * 在执行完所有 indices 指定的增量操作后，返回矩阵中「奇数值单元格」的数目
 */
public class EP1252 {

    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        for (int[] p : indices) {
            row[p[0]]++;
            col[p[1]]++;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((row[i] + col[j]) & 1) != 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
