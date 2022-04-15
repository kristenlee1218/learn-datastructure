package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :对于一个正整数，如果它和除了它自身以外的所有正因子之和相等，
 * 称为「完美数」、给定一个整数 n，如果是完美数，返回 true，否则返回 false
 */
public class EP507_1 {
    public boolean checkPerfectNumber(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int count = 0;
        for (int i = 2; i * i < n; i++) {
            count += n % i == 0 ? i + n / i : 0;
        }
        return count + 1 == n;
    }
}
