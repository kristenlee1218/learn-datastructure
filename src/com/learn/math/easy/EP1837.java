package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个整数 n（10 进制）和一个基数 k，请将 n 从 10 进
 * 制表示转换为 k 进制表示，计算并返回转换后各位数字的总和。转换后各位
 * 数字应当视作是 10 进制数字，且它们的总和也应当按 10 进制表示返回
 */
public class EP1837 {
    public int sumBase(int n, int k) {
        int result = 0;
        while (n > 0) {
            result += (n % k);
            n /= k;
        }
        return result;
    }
}
