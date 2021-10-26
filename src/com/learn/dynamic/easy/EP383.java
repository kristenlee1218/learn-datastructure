package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description :一个整数 n，对于 0 <= i <= n 中的每个 i，
 * 计算其二进制表示中 1 的个数，返回一个长度为 n + 1 的数组 nums 作为答案
 */
public class EP383 {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }
}
