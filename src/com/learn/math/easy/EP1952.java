package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给一个整数 n。如果 n 恰好有三个正除数，返回 true；否则，返回 false。
 * 如果存在整数 k，满足 n = k * m，那么整数 m 就是 n 的一个除数
 */
public class EP1952 {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count == 3;
    }
}
