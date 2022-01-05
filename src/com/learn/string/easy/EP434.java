package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :统计字符串中的单词个数，这里的单词指的是连续的不是空格的
 * 字符。请注意，你可以假定字符串里不包括任何不可打印的字符
 */
public class EP434 {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
