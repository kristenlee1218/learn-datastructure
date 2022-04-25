package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description : 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体
 * 力花费值cost[i]（下标从 0 开始）。每当你爬上一个阶梯你都要花费对应的体力值，
 * 一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。请找出达到
 * 楼层顶部的最低花费。在开始时可以选择从下标为 0 或 1 的元素作为初始阶梯
 *
 * 题目解析：
 * 我觉得这个题的描述应该改改：每个阶梯都有一定数量坨屎，一次只能跨一个或者
 * 两个阶梯，走到一个阶梯就要吃光上面的屎，问怎么走才能吃最少的屎？开局你
 * 选前两个阶梯的其中一个作为开头点，并吃光该阶梯的屎。
 */
public class EP746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length + 1];
        result[0] = result[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            result[i] = Math.min(result[i - 1] + cost[i - 1],
                    result[i - 2] + cost[i - 2]);
        }
        return result[cost.length];
    }
}
