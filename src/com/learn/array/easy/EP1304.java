package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个整数 n，请返回任意一个由 n 个各不相同的整数组成的数组，
 * 并且这 n 个数相加和为 0
 */
public class EP1304 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n == 1) {
            return result;
        }
        if (n % 2 != 0) {
            n--;
        }
        int mid = (n - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            result[i] = i + 1;
            result[mid + 1 + i] = -(i + 1);
        }
        return result;
    }
}
