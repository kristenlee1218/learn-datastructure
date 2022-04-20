package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数 n，如果 n 是一个完全平方数，
 * 则返回 true，否则返回 false
 */
public class EP367 {
    public boolean isPerfectSquare(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid < n) {
                left = mid + 1;
            } else if ((long) mid * mid > n) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
