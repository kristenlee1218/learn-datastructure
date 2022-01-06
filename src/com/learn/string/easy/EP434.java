package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :统计字符串中的单词个数，这里的单词指的是连续的不是空格的
 * 字符。可以假定字符串里不包括任何不可打印的字符
 */
public class EP434 {
    public int countSegments(String s) {
        if ("".equals(s)) {
            return 0;
        }
        int count = 0;
        String[] str = s.split(" ");
        for (String s1 : str) {
            if (!" ".equals(s1) && !"".equals(s1)) {
                count++;
            }
        }
        return count;
    }
}
