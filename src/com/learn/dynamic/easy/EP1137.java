package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 泰波那契序列 Tn 定义如下：T0 = 0, T1 = 1, T2 = 1,
 * 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2 整数 n，请返回第 n
 * 个泰波那契数 Tn 的值
 */
public class EP1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }
}
