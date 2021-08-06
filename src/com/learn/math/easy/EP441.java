package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :总共有 n 枚硬币，需要将它们摆成一个阶梯形状，
 * 第 k 行就必须正好有 k 枚硬币。给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在 32 位有符号整型的范围内
 */
public class EP441 {
    public int arrangeCoins(int n) {
        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
        }
        return i - 1;
    }
}
