package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :给你一个仅由数字 6 和 9 组成的正整数 num。最多只能
 * 翻转一位数字，将 6 变成 9，或把 9 变成 6、请返回可以得到的最大数字
 */
public class EP1323_1 {
    public int maximum69Number(int num) {
        if (num / 1000 == 6) {
            return num + 3000;
        }
        if ((num / 100) % 10 == 6) {
            return num + 300;
        }
        if ((num / 10) % 10 == 6) {
            return num + 30;
        }
        if (num % 10 == 6) {
            return num + 3;
        }
        return num;
    }
}
