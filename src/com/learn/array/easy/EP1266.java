package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。
 * 请你计算访问所有这些点需要的最小时间（以秒为单位）
 */
public class EP1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int num = points.length;
        int result = 0;
        for (int i = 0; i < num - 1; i++) {
            result += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        return result;
    }
}
