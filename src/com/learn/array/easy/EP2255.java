package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description : 一个字符串数组 words 和一个字符串 s，其中 words[i]
 * 和 s 只包含小写英文字母。请返回 words 中是字符串 s 前缀的字符串数目
 */
public class EP2255 {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String str : words) {
            if (s.startsWith(str)) {
                count++;
            }
        }
        return count;
    }
}
