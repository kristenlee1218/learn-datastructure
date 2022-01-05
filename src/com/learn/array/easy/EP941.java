package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给定一个整数数组 A，如果它是有效的山脉数组就返回 true，
 * 否则返回 false、如果 A 满足下述条件，那么它是一个山脉数组：A.length >= 3、
 * 在 0 < i< A.length - 1条件下，存在 i 使得 A[0] < A[1] < ... A[i-1] <
 * A[i]、A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class EP941 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int peakCount = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] == A[i]) {
                return false;
            }
            if (A[i - 1] > A[i] && A[i] < A[i + 1]) {
                return false;
            }
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peakCount++;
            }
        }
        return peakCount == 1;
    }
}
