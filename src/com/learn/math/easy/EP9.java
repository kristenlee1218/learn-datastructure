package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 判断一个整数是否是回文数。回文数是指正序（从左向右）
 * 和倒序（从右向左）读都是一样的整数
 */
public class EP9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int n = x;
        while (n != 0) {
            cur = cur * 10 + n % 10;
            n /= 10;
        }
        return cur == x;
    }
}
