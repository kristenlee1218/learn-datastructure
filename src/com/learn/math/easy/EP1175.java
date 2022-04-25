package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description : 从 1 到 n 的数设计排列方案，使得所有的「质数」都
 * 应该被放在「质数索引」（索引从 1 开始）上，需要返回可能的方案总数
 */
public class EP1175 {
    public int numPrimeArrangements(int n) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int count = 0;
        for (int prime : primes) {
            if (n >= prime) {
                count++;
            }
        }
        long result = 1;
        final int mod = (int) 1e9 + 7;
        for (int i = 1; i <= count; i++) {
            result = result * i % mod;
        }
        for (int i = 1; i <= n - count; i++) {
            result = result * i % mod;
        }
        return (int) result % mod;
    }
}
