package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :给定一个具体的矩形页面面积，你的任务是设计一个长度为 L
 * 和宽度为 W 且满足以下要求的矩形的页面。要求：
 * 1. 设计的矩形页面必须等于给定的目标面积。
 * 2. 宽度 W 不应大于长度 L，换言之，要求 L >= W 。
 * 3. 长度 L 和宽度 W 之间的差距应当尽可能小。
 * 需要按顺序输出设计的页面的长度 L 和宽度 W。
 */
public class EP492 {
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        if (sqrt * sqrt == area) {
            return new int[]{sqrt, sqrt};
        }
        for (int i = sqrt; i >= 1; i--) {
            if (area % i == 0) {
                return new int[]{area / i, i};
            }
        }
        return null;
    }
}
