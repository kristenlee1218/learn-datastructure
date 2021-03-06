package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个整数，判断它是否是 2 的幂次方
 */
public class EP231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 2 == 0) {
            n /= 2;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
