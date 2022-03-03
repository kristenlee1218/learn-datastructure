package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2021/11/8
 * @description :给定一个字符串，需要反转字符串中每个单词的字符顺序，
 * 同时仍保留空格和单词的初始顺序
 */
public class EP557 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] str = s.split(" ");
        for (String value : str) {
            StringBuilder sb = new StringBuilder(value);
            String afterReverse = sb.reverse().toString();
            result.append(afterReverse).append(" ");
        }
        return result.substring(0, result.length() - 1);
    }
}
