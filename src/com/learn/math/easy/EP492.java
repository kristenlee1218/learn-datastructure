package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :现给定一个具体的矩形页面面积，你的任务是设计一个长度为
 * L 和宽度为 W 且满足以下要求的矩形的页面。要求：
 * 1. 你设计的矩形页面必须等于给定的目标面积
 * 2. 宽度 W 不应大于长度 L，换言之，要求 L >= W
 * 3. 长度 L 和宽度 W 之间的差距应当尽可能小
 * 你需要按顺序输出你设计的页面的长度 L 和宽度 W
 */
public class EP492 {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width != 0) {
            --width;
        }
        return new int[]{area / width, width};
    }
}
