package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，
 * 计算置位位数为质数的整数个数（注意，计算置位代表二进制表示中1的个数。
 * 例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数）
 */
public class EP762 {
    public int countPrimeSetBits(int l, int r) {
        int result = 0;
        for (int x = l; x <= r; ++x) {
            if (isSmallPrime(Integer.bitCount(x))) {
                result++;
            }
        }
        return result;
    }
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
    }
}
