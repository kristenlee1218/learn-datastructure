package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个非负整数 n，反复将各个位上的数字
 * 相加，直到结果为一位数，返回此结果
 */
public class EP258 {
    public int addDigits(int n) {
        return (n - 1) % 9 + 1;
    }
}
