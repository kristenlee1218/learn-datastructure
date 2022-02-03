package com.learn.interview.easy;

/**
 * @author : Kristen
 * @date : 2022/2/1
 * @description : 设计一个算法，算出 n 阶乘有多少个尾随零
 */
public class EP1605 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
