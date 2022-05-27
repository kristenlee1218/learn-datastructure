package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2022/5/27
 * @description : 一个整数 num 的 k 美丽值定义为 num 中符合以下条件
 * 的子字符串数目：子字符串长度为 k。子字符串能整除 num。整数 num 和 k，
 * 请返回 num 的 k 美丽值
 */
public class EP2269 {
    public int divisorSubstrings(int num, int k) {
        int n = (num + "").length();
        int result = 0;
        for (int i = 0; i <= n - k; i++) {
            int j = Integer.parseInt((num + "").substring(i, i + k));
            if (j != 0 && num % j == 0) {
                result++;
            }
        }
        return result;
    }
}
