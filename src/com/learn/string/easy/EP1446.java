package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/6
 * @description :一个字符串 s，字符串的「能量」定义为：只包含一种字符的最
 * 长非空子字符串的长度。请返回字符串的能量
 */
public class EP1446 {
    public int maxPower(String s) {
        int result = 1, count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 1;
            }
        }
        return result;
    }
}
