package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description :从 1 到 n 的数设计排列方案，使得所有的「质数」都
 * 应该被放在「质数索引」（索引从 1 开始）上；需要返回可能的方案总数
 */
public class EP1175 {
    public int isPrime(int n) {
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int numPrimeArrangements(int n) {
        int primeCount = n >= 2 ? 1 : 0;
        for (int i = 3; i <= n; i += 2) {
            primeCount += isPrime(i);
        }
        long result = 1;
        for (int i = 2; i <= primeCount; i++) {
            result = result * i % 1000000007;
        }
        for (int i = n - primeCount; i > 1; i--) {
            result = result * i % 1000000007;
        }
        return (int) result;
    }
}
