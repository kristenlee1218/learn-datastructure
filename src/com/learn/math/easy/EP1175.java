package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description :请你帮忙给从 1 到 n 的数设计排列方案，
 * 使得所有的「质数」都应该被放在「质数索引」（索引从 1 开始）上；
 * 你需要返回可能的方案总数。让我们一起来回顾一下「质数」：
 * 质数一定是大于 1 的，并且不能用两个小于它的正整数的乘积来表示。
 * 由于答案可能会很大，所以请你返回答案 模 mod 10^9 + 7 之后的结果即可
 */
public class EP1175 {
    public int isPrime(int n) { //n>=3,且为奇数(不考虑偶数)
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int numPrimeArrangements(int n) {
        //对2特判
        int primeCount = n >= 2 ? 1 : 0;
        for (int i = 3; i <= n; i += 2) {
            primeCount += isPrime(i);
        }
        long ans = 1;
        for (int i = 2; i <= primeCount; i++) {
            ans = ans * i % 1000000007;
        }
        for (int i = n - primeCount; i > 1; i--) {
            ans = ans * i % 1000000007;
        }
        return (int) ans;
    }
}
