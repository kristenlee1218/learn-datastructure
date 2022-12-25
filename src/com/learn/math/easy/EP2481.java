package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/12/25
 * @description : 圆内一个有效切割，符合以下二者之一：
 * 该切割是两个端点在圆上的线段，且该线段经过圆心。该切割是一端在圆心另一端在圆上的线段
 */
public class EP2481 {
    public int numberOfCuts(int n) {
        return n == 1 ? 0 : n % 2 == 0 ? n / 2 : n;
    }
}
