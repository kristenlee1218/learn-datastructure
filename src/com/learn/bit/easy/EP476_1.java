package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :对整数的二进制表示取反（0 变 1，1 变 0）后，
 * 再转换为十进制表示，可以得到这个整数的补数
 */
public class EP476_1 {
    public int findComplement(int num) {
        int n = num;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n ^ num;
    }
}
