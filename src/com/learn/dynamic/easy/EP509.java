package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :斐波那契数，通常用 f(n) 表示，形成的序列称为斐波那契数列。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和
 */
public class EP509 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
