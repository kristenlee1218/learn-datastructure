package com.learn.dynamic.middle;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :给定正整数 n，找到若干个完全平方数（比如 1, 4,
 * 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个
 * 数最少。一个整数 n，返回和为 n 的完全平方数的最少数量。完全平方
 * 数是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整
 * 数自乘的积。例如，1、4、9 和 16 是完全平方数，而 3 和 11 不是
 */
public class EP279 {
    public int numSquares(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, result[i - j * j]);
            }
            result[i] = min + 1;
        }
        return result[n];
    }
}
