package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数 n，编写一个函数，如果 n 是一个完全平方数，
 * 则返回 true，否则返回 false
 */
public class EP367 {
    public boolean isPerfectSquare(int n) {
        int i = 1, j = n;
        while (i <= j) {
            int mid = (i + j) / 2;
            if ((long) mid * mid < n) {
                i = mid + 1;
            } else if ((long) mid * mid > n) {
                j = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
