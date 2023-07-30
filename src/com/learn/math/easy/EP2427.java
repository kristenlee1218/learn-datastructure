package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 两个正整数 a 和 b，返回 a 和 b 的公因子的数目。
 * 如果 x 可以同时整除 a 和 b，则认为 x 是 a 和 b 的一个公因子
 */
public class EP2427 {
    public int commonFactors(int a, int b) {
        if (a > b) {
            return commonFactors(b, a);
        }
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result += (a % i == 0 && b % i == 0) ? 1 : 0;
        }
        return result;
    }
}
