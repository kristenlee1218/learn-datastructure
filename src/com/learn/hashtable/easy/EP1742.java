package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description : 一家生产小球的玩具厂工作，有 n 个小球，编号
 * 从 lowLimit 开始，到highLimit 结束（即 n == highLimit -
 * lowLimit + 1）。另有无限数量的盒子，编号从 1 到 infinity。
 * 将每个小球放入盒子中，其中盒子的编号应当等于小球编号上每位数字
 * 的和。如，编号 321 的小球应当放入编号 3 + 2 + 1 = 6 的盒子，
 * 而编号 10 的小球应当放入编号 1 + 0 = 1 的盒子。两个整数
 * lowLimit 和 highLimit，返回放有最多小球的盒子中的小球数量。
 * 如果有多个盒子都满足放有最多小球，只需返回其中任一盒子的小球数量
 */
public class EP1742 {
    public int countBalls(int low, int high) {
        int[] result = new int[46];
        int max = Integer.MIN_VALUE;
        for (int i = low; i <= high; i++) {
            int box = 0, ball = i;
            while (ball > 0) {
                box += ball % 10;
                ball /= 10;
            }
            max = Math.max(max, ++result[box]);
        }
        return max;
    }
}
