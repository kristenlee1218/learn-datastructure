package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，
 * 则返回 True，否则返回 False
 */
public class EP367 {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        int j = num;
        int mid;
        while (i <= j) {
            mid = (i + j) / 2;
            if ((long) mid * mid < num) {
                i = mid + 1;
            } else if ((long) mid * mid > num) {
                j = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}