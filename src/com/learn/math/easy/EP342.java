package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :给定一个整数，写一个函数来判断它是否是 4 的幂次方
 */
public class EP342 {
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 4 == 0) {
            n /= 4;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
