package com.learn.math.hard;

/**
 * @author ：Kristen
 * @date ：2022/3/14
 * @description : 从 1 开始，移除所有包含数字 9 的所有整数，例如 9，19，29，
 * ……，这样就获得了一个新的整数数列：1，2，3，4，5，6，7，8，10，11，……
 * 给定正整数 n，请返回新数列中第 n 个数字是多少。1 是新数列中的第一个数字
 */
public class EP660 {
    public int newInteger(int n) {
        return Integer.parseInt(Integer.toString(n, 9));
    }
}
