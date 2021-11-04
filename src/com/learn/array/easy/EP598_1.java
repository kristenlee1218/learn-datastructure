package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :给定一个初始元素全部为0，大小为 m*n 的矩阵M以及在M上的
 * 一系列更新操作。操作用二维数组表示，其中的每个操作用一个含有两个正整数a 和 b
 * 的数组表示，含义是将所有符合0 <= i < a 以及 0 <= j < b 的元素M[i][j]
 * 的值都增加 1。在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。
 */
public class EP598_1 {
    public int maxCount(int m, int n, int[][] nums) {
        for (int[] arr : nums) {
            m = Math.min(m, arr[0]);
            n = Math.min(n, arr[1]);
        }
        return m * n;
    }
}
