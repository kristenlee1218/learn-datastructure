package com.learn.greedy.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/30
 * @description : 一家商店正在打折销售糖果。每购买两个糖果，商店会免费
 * 送一个糖果。免费送的糖果唯一的限制是：它的价格需要小于等于购买的两个糖
 * 果价格的较小值。下标从 0 开始的整数数组 cost，其中 cost[i]表示第 i
 * 个糖果的价格，返回获得所有糖果的最小总开销
 */
public class EP2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int result = 0;
        int i;
        for (i = cost.length - 1; i > 1; i -= 3) {
            result = result + cost[i] + cost[i - 1];
        }
        while (i >= 0) {
            result += cost[i--];
        }
        return result;
    }
}
