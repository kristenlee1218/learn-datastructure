package com.learn.lcp.easy;

/**
 * @author : Kristen
 * @date : 2021/7/30
 * @description :桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
 * 每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 */
public class LCP06 {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] % 2 == 0) {
                sum += coins[i] / 2;
            } else {
                sum += coins[i] / 2 + 1;
            }
        }
        return sum;
    }
}
