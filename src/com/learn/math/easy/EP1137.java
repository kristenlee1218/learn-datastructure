package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :泰波那契序列 Tn 定义如下：
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件
 * 下 Tn+3 = Tn + Tn+1 + Tn+2
 * 整数 n，请返回第 n 个泰波那契数 Tn 的值
 */
public class EP1137 {
    public int tribonacci(int n) {
        return fun(n, 0, 1, 1);
    }

    int fun(int n, int acc1, int acc2, int acc3) {
        if (n == 1) {
            return acc2;
        }
        if (n == 0) {
            return 0;
        }
        return fun(n - 1, acc2, acc3, acc1 + acc2 +
                acc3);
    }
}