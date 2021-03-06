package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 */
public class EP14 {
    public String longestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "";
        }
        for (int i = 0; i < str[0].length(); i++) {
            char temp = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (i == str[j].length() || temp != str[j].charAt(i)) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}
