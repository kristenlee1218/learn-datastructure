package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给出一个 32 位的有符号整数，需要将这个整数中每位上的数字进行反转
 */
public class EP7 {
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
