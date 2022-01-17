package com.learn.string.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/6
 * @description :一个整数 n，请返回一个含 n 个字符的字符串，其中每
 * 种字符在该字符串中都恰好出现奇数次。返回的字符串必须只含小写英文字母。
 * 如果存在多个满足题目要求的字符串，则返回其中任意一个即可
 */
public class EP1374 {
    public String generateTheString(int n) {
        char[] c = new char[n];
        Arrays.fill(c, 'a');
        if (n % 2 == 0) {
            c[n - 1] = 'b';
        }
        return new String(c);
    }
}
