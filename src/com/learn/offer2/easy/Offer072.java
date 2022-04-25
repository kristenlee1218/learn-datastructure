package com.learn.offer2.easy;

/**
 * @author : Kristen
 * @date : 2022/2/10
 * @description :给定一个非负整数 x，计算并返回 x 的平方根，即实现
 * int sqrt(int x) 函数正数的平方根有两个，只输出其中的正数平方根。
 * 如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去
 */
public class Offer072 {
    public int mySqrt(int x) {
        return Math.abs((int) Math.sqrt(x));
    }
}
