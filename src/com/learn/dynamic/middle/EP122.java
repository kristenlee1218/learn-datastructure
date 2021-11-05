package com.learn.dynamic.middle;

/**
 * @author : Kristen
 * @date : 2021/11/1
 * @description :给定一个数组 prices，其中 prices[i] 是一支给定股票
 * 第 i 天的价格。设计一个算法来计算所能获取的最大利润。可以尽可能地
 * 完成更多的交易（多次买卖一支股票）
 * 注意：不能同时参与多笔交易（必须在再次购买前出售掉之前的股票）
 */
public class EP122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum += Math.max(0, prices[i] - prices[i - 1]);
        }
        return sum;
    }
}
