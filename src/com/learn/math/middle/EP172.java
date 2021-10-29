package com.learn.math.middle;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个整数 n，返回 n! 结果尾数中零的数量
 */
public class EP172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
