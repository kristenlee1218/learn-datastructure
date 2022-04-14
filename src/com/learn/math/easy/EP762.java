package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :给定两个整数 L 和 R，找到闭区间 [L, R] 范围内，计算置位位数
 * 为质数的整数个数（注意，计算置位代表二进制表示中1的个数
 */
public class EP762 {
    public int countPrimeSetBits(int l, int r) {
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (isSmallPrime(Integer.bitCount(i))) {
                result++;
            }
        }
        return result;
    }

    public boolean isSmallPrime(int i) {
        return (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19);
    }
}
