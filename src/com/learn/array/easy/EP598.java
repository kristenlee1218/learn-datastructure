package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :给定一个初始元素全部为0，大小为 m*n 的矩阵M以及在M上的一系列
 * 更新操作。操作用二维数组表示，其中的每个操作用一个含有两个正整数a 和 b的数组
 * 表示，含义是将所有符合0 <= i < a 以及 0 <= j < b 的元素M[i][j]的值都增加 1。
 * 在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数
 */
public class EP598 {
    public int maxCount(int m, int n, int[][] nums) {
        int[][] result = new int[m][n];
        for (int[] arr : nums) {
            for (int i = 0; i < arr[0]; i++) {
                for (int j = 0; j < arr[1]; j++) {
                    result[i][j]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == result[0][0]) {
                    count++;
                }
            }
        }
        return count;
    }
}
