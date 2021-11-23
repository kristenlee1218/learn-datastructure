package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public double largestTriangleArea(int[][] points) {
        double result = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    result = Math.max(result, area(points[i], points[j], points[k]));
                }
            }
        }
        return result;
    }

    public double area(int[] p, int[] q, int[] r) {
        return 0.5 * Math.abs(p[0] * q[1] + q[0] * r[1] + r[0] * p[1]
                - p[1] * q[0] - q[1] * r[0] - r[1] * p[0]);
    }
}