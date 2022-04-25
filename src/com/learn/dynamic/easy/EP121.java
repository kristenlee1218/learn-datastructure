package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个数组 prices ，它的第 i 个元素 prices[i]表示
 * 一支给定股票第 i 天的价格。只能选择某一天买入这只股票，并选择在未来的某
 * 一个不同的日子卖出该股票。设计一个算法来计算所能获取的最大利润。返回可以
 * 从这笔交易中获取的最大利润。如果不能获取任何利润返回 0
 */
public class EP121 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
