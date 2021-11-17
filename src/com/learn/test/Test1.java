package com.learn.test;

import com.learn.binarySearch.easy.GuessGame;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) <= 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}