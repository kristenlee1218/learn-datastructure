package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/14
 * @description : 一个二进制字符串 s，该字符串不含前导零、如果 s 包
 * 含零个或一个由连续的 '1' 组成的字段，返回 true。否则，返回 false
 */
public class EP1784 {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
