package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖
 */
public class EP1037 {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0] - points[1][0];
        int y1 = points[0][1] - points[1][1];
        int x2 = points[0][0] - points[2][0];
        int y2 = points[0][1] - points[2][1];
        return x1 * y2 != x2 * y1;
    }
}
