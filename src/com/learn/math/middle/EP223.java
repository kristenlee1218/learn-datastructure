package com.learn.math.middle;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description :二维平面上两个由直线构成且边与坐标轴平行/垂直的矩形，请
 * 计算并返回两个矩形覆盖的总面积。每个矩形由其左下顶点和右上顶点坐标表示：
 * 第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义
 * 第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义
 */
public class EP223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0);
        return area1 + area2 - overlapArea;
    }
}
