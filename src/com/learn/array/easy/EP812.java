package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :给定包含多个点的集合，从其中取三个点组成三角形，
 * 返回能组成的最大三角形的面积
 */
public class EP812 {
    public double largestTriangleArea(int[][] points) {
        double result = 0;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                for (int k = j + 1; k < points.length; ++k) {
                    result = Math.max(result, area(points[i],
                            points[j], points[k]));
                }
            }
        }
        return result;
    }

    public double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0] * Q[1] + Q[0] * R[1] + R[0] * P[1] - P[1] * Q[0] - Q[1] * R[0] - R[1] * P[0]);
    }
}
