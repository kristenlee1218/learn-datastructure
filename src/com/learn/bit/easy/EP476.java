package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description :
 */
public class EP476 {
    public int findComplement(int num) {
        int result = 1;
        while (result < num) {
            result = result << 1;
            result++;
        }
        return num ^ result;
    }
}
