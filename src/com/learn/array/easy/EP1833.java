package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description :店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，
 * 其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消
 * 费，他想要买尽可能多的雪糕。给你价格数组 costs 和现金量 coins，请你计算并
 * 返回 Tony 用 coins 现金能够买到的雪糕的最大数量
 */
public class EP1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0, count = 0;
        for (int cost : costs) {
            sum += cost;
            if (sum > coins) {
                break;
            }
            count++;
        }
        return count;
    }
}
