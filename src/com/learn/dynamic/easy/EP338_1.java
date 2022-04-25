package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/11/1
 * @description : 一个整数 n，对于 0 <= i <= n 中的每个 i，计
 * 算其二进制表示中 1 的个数，返回一个长度为 n + 1 的数组 nums
 */
public class EP338_1 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
