package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/5
 * @description : 编写一个函数，输入是一个无符号整数（以二进制串的形式），
 * 返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量）
 */
public class Offer15 {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
