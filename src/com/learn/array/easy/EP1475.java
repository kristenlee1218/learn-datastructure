package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个数组 prices，其中 prices[i] 是商店里第 i 件商品的价格。商店里
 * 正在进行促销活动，如果要买第 i 件商品，那么可以得到与 prices[j]相等的折扣，其中 j 是
 * 满足 j > i 且 prices[j] <= prices[i] 的最小下标，如果没有满足条件的 j，将没有任何
 * 折扣、请返回一个数组，数组中第 i 个元素是折扣后购买商品 i 最终需要支付的价格
 */
public class EP1475 {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
