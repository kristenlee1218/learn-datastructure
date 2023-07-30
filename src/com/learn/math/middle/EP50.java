package com.learn.math.middle;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description : 实现 pow(x, n)，即计算 x 的 n 次幂函数（即，x^n）
 */
public class EP50 {
    public double myPow(double x, int n) {
        double result = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                result *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / result : result;
    }
}
