package com.learn.bit.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/20
 * @description : 颠倒给定的 32 位无符号整数的二进制位
 */
public class EP190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            result |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return result;
    }
}
