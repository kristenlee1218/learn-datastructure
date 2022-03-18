package com.learn.lcp.easy;

/**
 * @author : Kristen
 * @date : 2021/7/30
 * @description :桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。每
 * 次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数
 */
public class LCP06 {
    public int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            if (coin % 2 == 0) {
                count += coin / 2;
            } else {
                count += coin / 2 + 1;
            }
        }
        return count;
    }
}
