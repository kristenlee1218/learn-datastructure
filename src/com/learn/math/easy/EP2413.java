package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 一个正整数 n，返回 2 和 n 的最小公倍数（正整数）
 */
public class EP2413 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }
}
