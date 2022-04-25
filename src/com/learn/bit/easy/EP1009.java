package com.learn.bit.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description : 一个十进制数 n，请返回其二进制表示的反码所对应的十进制整数
 */
public class EP1009 {
    public int bitwiseComplement(int n) {
        int num = 1;
        while (num < n) {
            num = (num << 1) + 1;
        }
        return n ^ num;
    }
}
