package com.learn.string.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description :给出一个字符串数组 words 组成的一本英语词典。返回 words
 * 中最长的一个单词，该单词是由 words 词典中其他单词逐步添加一个字母组成。若其
 * 中有多个可行的答案，则返回答案中字典序最小的单词。若无答案，则返回空字符串
 */
public class EP720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String str = "";
        for (String s : words) {
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                str = s.length() > str.length() ? s : str;
                set.add(s);
            }
        }
        return str;
    }
}
