package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :给定一个正整数 n，找到并返回 n 的二进制表示中两个 相邻 1 之间的 最长距离。
 * 如果不存在两个相邻的 1，返回 0。如果只有 0 将两个 1 分隔开（可能不存在 0 ），
 * 则认为这两个 1 彼此 相邻。两个 1 之间的距离是它们的二进制表示中位置的绝对差。
 * 例如，"1001" 中的两个 1 的距离为 3
 */
public class EP868 {
    public int binaryGap(int nums) {
        int max = 0;
        int count = 0;
        while (nums >= 1) {
            if (nums % 2 == 0 && count > 0) {
                count++;
            } else if (nums % 2 == 1) {
                max = max > count ? max : count;
                count = 1;
            }
            nums = nums / 2;
        }
        return max;
    }
}
