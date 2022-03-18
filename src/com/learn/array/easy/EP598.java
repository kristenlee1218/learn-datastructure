package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :给定一个初始元素全部为 0，大小为 m*n 的矩阵M以及在M上的一系
 * 列更新操作。操作用二维数组表示，其中的每个操作用一个含有两个正整数a 和 b的数
 * 组表示，含义是将所有符合0 <= i < a 以及 0 <= j < b 的元素M[i][j]的值都
 * 增加 1。在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数
 */
public class EP598 {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
