package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其
 * 最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后
 * 出现的单词。如果不存在最后一个单词，请返回 0
 */
public class EP58 {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        return str[str.length - 1].length();
    }
}
