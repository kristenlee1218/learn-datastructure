package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description : 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现
 */
public class EP693 {
    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            if (n % 2 == (n / 2) % 2) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
