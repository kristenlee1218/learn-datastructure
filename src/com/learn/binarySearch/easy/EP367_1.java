package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数 n，如果 n 是一个完全平方数，
 * 则返回 true，否则返回 false
 */
public class EP367_1 {
    public boolean isPerfectSquare(int num) {
        long x = 1, result = 1;
        while (result <= num) {
            if (result == num) {
                return true;
            }
            x++;
            result = x * x;
        }
        return false;
    }
}
