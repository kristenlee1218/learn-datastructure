package com.learn.string.easy;

import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/9/5
 * @description : 一个字符串数组 words 和一个字符串 s，请判断 s 是不是 words 的字母缩略词。
 * 如果可以按顺序串联 words 中每个字符串的第一个字符形成字符串 s，则认为 s 是 words 的首字母
 * 缩略词。如果 s 是 words 的首字母缩略词，返回 true；否则返回 false
 */
public class EP2828 {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.charAt(0));
        }
        return result.toString().equals(s);
    }
}
