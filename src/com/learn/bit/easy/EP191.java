package com.learn.bit.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/21
 * @description :输入是一个无符号整数（以二进制串的形式），返回其二进制
 * 表达式中数字位数为 '1' 的个数（也被称为汉明重量）
 */
public class EP191 {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
