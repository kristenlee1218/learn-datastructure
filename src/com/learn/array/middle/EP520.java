package com.learn.array.middle;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给定一个单词，你需要判断单词的大写使用是否正确。
 * 在以下情况时单词的大写用法是正确的：全部字母都是大写，比如 "USA"。
 * 单词中所有字母都不是大写，比如 "leetcode"。如果单词不只含有一个字母，
 * 只有首字母大写，比如 "Google"。否则定义这个单词没有正确使用大写字母
 */
public class EP520 {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int upper = 0;
        int lower = 0;
        for (char c : ch) {
            if (c >= 'a') {
                lower++;
            } else {
                upper++;
            }
        }
        if (upper == ch.length) {
            return true;
        }
        if (lower == ch.length) {
            return true;
        }
        return upper == 1 && ch[0] < 'a';
    }
}
