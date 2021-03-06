package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个仅由数字 6 和 9 组成的正整数 n。最多只能翻
 * 转一位数字，将 6 变成 9，或把 9 变成 6、请返回可以得到的最大数字
 */
public class EP1323 {
    public int maximum69Number(int n) {
        return Integer.parseInt(String.valueOf(n).replaceFirst("6", "9"));
    }
}
