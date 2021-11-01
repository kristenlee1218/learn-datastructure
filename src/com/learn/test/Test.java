package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int p, q = 0;
        int r = 1, s = 1;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }
}
