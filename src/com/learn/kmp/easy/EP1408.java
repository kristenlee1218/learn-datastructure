package com.learn.kmp.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/6
 * @description : 一个字符串数组 words，数组中的每个字符串都可以看作
 * 是一个单词。请按任意顺序返回 words 中是其他单词的子字符串的所有单词
 */
public class EP1408 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}
