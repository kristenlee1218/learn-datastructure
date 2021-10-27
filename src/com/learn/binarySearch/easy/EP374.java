package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description :
 */
public class EP374 extends GuessGame {
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
