package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :
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
