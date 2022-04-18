package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个正整数 n，如果 n 是一个完全平方数，
 * 则返回 true，否则返回 false
 */
public class EP367_2 {
    public boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }
}
