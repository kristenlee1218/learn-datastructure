package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/28
 * @description :一个字符串如果没有三个连续相同字符，那么它就是一个好字符串。
 * 一个字符串 s，请从 s 删除最少的字符，使它变成一个好字符串。请返回删除后的
 * 字符串。题目数据保证答案总是 唯一的
 */
public class EP1957 {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == c && sb.charAt(sb.length() - 2) == c) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
