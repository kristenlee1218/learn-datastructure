package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 对整数的二进制表示取反（0 变 1，1 变 0）后，再转
 * 换为十进制表示，可以得到这个整数的补数
 */
public class EP476 {
    public int findComplement(int n) {
        int result = 1;
        while (result < n) {
            result = result << 1;
            result++;
        }
        return n ^ result;
    }
}
