package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个整数，将其转化为7进制，并以字符串形式输出
 */
public class EP504 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}
