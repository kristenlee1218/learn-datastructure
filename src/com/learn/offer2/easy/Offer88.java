package com.learn.offer2.easy;

/**
 * @author : Kristen
 * @date : 2022/2/10
 * @description :数组的每个下标作为一个阶梯，第 i 个阶梯对应着
 * 一个非负数的体力花费值 cost[i]（下标从 0 开始）。每当爬上一个
 * 阶梯都要花费对应的体力值，一旦支付了相应的体力值，就可以选择向
 * 上爬一个阶梯或者爬两个阶梯。请找出达到楼层顶部的最低花费。
 * 在开始时可以选择从下标为 0 或 1 的元素作为初始阶梯
 */
public class Offer88 {
    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length + 1];
        result[0] = result[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            result[i] = Math.min(result[i - 1] + cost[i - 1], result[i - 2] + cost[i - 2]);
        }
        return result[cost.length];
    }
}
