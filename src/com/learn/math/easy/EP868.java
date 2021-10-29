package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :给定一个正整数 n，找到并返回 n 的二进制表示中两个相邻 1
 * 之间的最长距离。如果不存在两个相邻的 1，返回 0。如果只有 0 将两个 1
 * 分隔开（可能不存在 0 ），则认为这两个 1 彼此相邻。两个 1 之间的距离是
 * 它们的二进制表示中位置的绝对差。例如，"1001" 中的两个 1 的距离为 3
 */
public class EP868 {
    public int binaryGap(int n) {
        int max = 0;
        int count = 0;
        while (n >= 1) {
            if (n % 2 == 0 && count > 0) {
                count++;
            } else if (n % 2 == 1) {
                max = Math.max(max, count);
                count = 1;
            }
            n /= 2;
        }
        return max;
    }
}
