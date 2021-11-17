package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :总共有 n 枚硬币，需要将它们摆成一个阶梯形状，
 * 第 k 行就必须正好有 k 枚硬币。给定一个数字 n，找出可形成完整阶
 * 梯行的总行数。n 是一个非负整数，并且在 32 位有符号整型的范围内
 */
public class EP441_1 {
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
