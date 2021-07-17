package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :斐波那契数，通常用F(n)表示，形成的序列称为斐波那契数列。
 * 该数列由0 和 1 开始，后面的每一项数字都是前面两项数字的和
 */
public class EP509 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
