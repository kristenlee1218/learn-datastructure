package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2022/1/30
 * @description : 一家商店正在打折销售糖果。每购买两个糖果，商店会免费送
 * 一个糖果。免费送的糖果唯一的限制是：它的价格需要小于等于购买的两个糖果
 * 价格的较小值。总共有 4 个糖果，价格分别为 1，2，3 和 4，一位顾客买了
 * 价格为 2 和 3 的糖果，那么可以免费获得价格为 1 的糖果，但不能获得价
 * 格为 4 的糖果。给一个下标从 0 开始的整数数组 cost，其中 cost[i]
 * 表示第 i 个糖果的价格，请返回获得所有糖果的最小总开销
 */
public class EP2144 {
    public int minimumCost(int[] cost) {
        int[] numCost = new int[101];
        for (int i : cost) {
            numCost[i]++;
        }
        int result = 0;
        for (int i = numCost.length - 1, j = 0; i >= 1; i--) {
            for (; numCost[i] > 0; --numCost[i], j++) {
                if (j % 3 < 2) {
                    result += i;
                }
            }
        }
        return result;
    }
}
